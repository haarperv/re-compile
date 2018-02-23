package com.matt.forgehax.mods.commands;

import com.google.common.util.concurrent.FutureCallback;
import com.matt.forgehax.util.command.Command;
import com.matt.forgehax.util.command.CommandBuilders;
import com.matt.forgehax.util.console.ConsoleIO;
import com.matt.forgehax.util.entity.PlayerInfo;
import com.matt.forgehax.util.entity.PlayerInfoHelper;
import com.matt.forgehax.util.mod.BaseMod;
import com.matt.forgehax.util.mod.CommandMod;
import com.matt.forgehax.util.mod.loader.RegisterMod;
import joptsimple.internal.Strings;

import javax.annotation.Nullable;
import java.util.Arrays;

import static com.matt.forgehax.Helper.getGlobalCommand;
import static com.matt.forgehax.Helper.getModManager;

/**
 * Created on 6/1/2017 by fr1kin
 */
@RegisterMod
public class HelpCommand extends CommandMod {
    public HelpCommand() {
        super("HelpCommand");
    }

    @RegisterCommand
    public Command save(CommandBuilders builder) {
        return builder.newCommandBuilder()
                .name("save")
                .description("Save all configurations")
                .processor(data -> getGlobalCommand().serializeAll())
                .build();
    }

    @RegisterCommand
    public Command help(CommandBuilders builder) {
        return builder.newCommandBuilder()
                .name("help")
                .description("Help text for mod syntax and command list")
                .processor(data -> {
                    final StringBuilder build = new StringBuilder();
                    build.append("Type \".search <optional: containing string>\" for list of mods\n");
                    build.append("Use -? or --help after command to see command options\n");
                    build.append("See the FAQ for details\n");
                    build.append("https://github.com/fr1kin/ForgeHax#faq");
                    data.write(build.toString());
                    data.markSuccess();
                })
                .build();
    }

    @RegisterCommand
    public Command search(CommandBuilders builder) {
        return builder.newCommandBuilder()
                .name("search")
                .description("Lists all the mods or all the mods containing the given argument")
                .options(parser -> {
                    parser.acceptsAll(Arrays.asList("details", "d"), "Gives description");
                    parser.acceptsAll(Arrays.asList("hidden", "h"), "Show hidden mods");
                })
                .processor(data -> {
                    final StringBuilder build = new StringBuilder();
                    final String arg = data.getArgumentCount() > 0 ? data.getArgumentAsString(0) : null;
                    boolean showDetails = data.hasOption("details");
                    boolean showHidden = data.hasOption("hidden");
                    getGlobalCommand().getChildren().stream()
                            .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName()))
                            .forEach(command -> {
                                @Nullable BaseMod mod = getModManager().get(command.getName()).orElse(null);
                                if((Strings.isNullOrEmpty(arg) || command.getName().toLowerCase().contains(arg.toLowerCase()))
                                        && (mod == null || showHidden || !mod.isHidden())) {
                                    build.append(command.getName());
                                    if (showDetails) {
                                        build.append(" - ");
                                        build.append(command.getDescription());
                                    }
                                    build.append('\n');
                                }
                            });
                    data.write(build.toString());
                    data.markSuccess();
                })
                .build();
    }

    @RegisterCommand
    public Command history(CommandBuilders builder) {
        return builder.newCommandBuilder()
                .name("history")
                .description("Lists name history of given player")
                .processor(data -> {
                    data.requiredArguments(1);
                    final StringBuilder build = new StringBuilder();
                    final String arg = data.getArgumentAsString(0);
                    final int indents = ConsoleIO.getIndents();
                    PlayerInfoHelper.invokeEfficiently(arg, new FutureCallback<PlayerInfo>() {
                        @Override
                        public void onSuccess(@Nullable PlayerInfo result) {
                            if(result == null) return;
                            int previousIndents = ConsoleIO.getIndents();
                            ConsoleIO.setIndents(indents);
                            if(result.isOfflinePlayer()) {
                                ConsoleIO.write(String.format("\"%s\" is not a registered username", result.getName()));
                            } else {
                                if(result.getNameHistory().size() > 1)
                                    ConsoleIO.write(String.format("%s's name history (newest-oldest): %s", result.getName(), result.getNameHistoryAsString()));
                                else
                                    ConsoleIO.write(String.format("%s has never changed their name", result.getName()));
                            }
                            ConsoleIO.setIndents(previousIndents);
                        }

                        @Override
                        public void onFailure(Throwable t) {}
                    });
                    data.write(build.toString());
                    data.markSuccess();
                })
                .build();
    }

    @RegisterCommand
    public Command loaded(CommandBuilders builder) {
        return builder.newCommandBuilder()
                .name("loaded")
                .description("Loaded plugin list")
                .processor(data -> {
                    final StringBuilder build = new StringBuilder();
                    getModManager().getLoadedClasses().stream()
                            .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getSimpleName(), o2.getSimpleName()))
                            .forEach(clazz -> {
                                build.append(clazz.getSimpleName());
                                build.append('\n');
                            });
                    data.write(build.toString());
                })
                .build();
    }
}
