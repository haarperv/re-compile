package com.matt.forgehax.util.command.v2.argument;

import com.google.common.collect.Lists;
import joptsimple.OptionDescriptor;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created on 1/30/2018 by fr1kin
 */
public class OptionV2Builder {
    private Collection<String> names = Lists.newArrayList();
    private String description = null;
    private boolean required = false;
    private OptionDescriptor descriptor = null;
    private ArgumentV2<?> argument = null;
    private ISuggestionProvider.Function<OptionV2> suggestionsFunction = null;

    /**
     * Name(s) to be associated with this option
     * @param names name(s)
     * @return this
     */
    public OptionV2Builder names(Collection<String> names) {
        this.names.addAll(names);
        return this;
    }
    public OptionV2Builder names(String... names) {
        return this.names(Arrays.asList(names));
    }

    /**
     * Description for this option
     * @param description describe what this option does
     * @return this
     */
    public OptionV2Builder description(String description) {
        this.description = description;
        return this;
    }

    public OptionV2Builder required(boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Creates option that wraps around a JOpt OptionDescriptor.
     * @param descriptor descriptor instance
     * @return this
     */
    public OptionV2Builder fromDescriptor(OptionDescriptor descriptor) {
        this.descriptor = descriptor;
        return this;
    }

    public OptionV2Builder argument(ArgumentV2<?> argument) {
        this.argument = argument;
        return this;
    }

    /**
     * Generates list of possible options given a certain input
     * @param suggestionsFunction function
     * @return this
     */
    public OptionV2Builder suggestions(ISuggestionProvider.Function<OptionV2> suggestionsFunction) {
        this.suggestionsFunction = suggestionsFunction;
        return this;
    }

    /**
     * Create new instance of Option.
     * Will automatically decide which child class to create it from.
     * @return new instance containing data provided
     */
    public OptionV2 build() {
        return descriptor == null ? asGeneric() : asJOptWrapper();
    }

    public OptionV2 asGeneric() {
        if(ArgumentHelper.isNullOrEmpty(argument)) // no argument
            return suggestionsFunction == null ? new OptionV2Generic(names, description, required)
                    : new OptionV2Generic.Suggestions(names, description, required, suggestionsFunction);
        else // argument
            return suggestionsFunction == null ? new OptionV2Generic.AcceptsArgument(names, description, required, argument)
                    : new OptionV2Generic.AcceptsArgument.Suggestions(names, description, required, argument, suggestionsFunction);
    }

    public OptionV2 asJOptWrapper() {
        if(!descriptor.acceptsArguments()) // no argument
            return suggestionsFunction == null ? new OptionV2JOptWrapper(descriptor)
                    : new OptionV2JOptWrapper.Suggestions(descriptor, suggestionsFunction);
        else // argument
            return suggestionsFunction == null ? new OptionV2JOptWrapper.AcceptsArgument(descriptor, argument)
                    : new OptionV2JOptWrapper.AcceptsArgument.Suggestions(descriptor, argument, suggestionsFunction);
    }
}
