package com.matt.forgehax.asm.utils;

import java.lang.reflect.*;
import java.util.Objects;

public class ReflectionHelper {
    public static <F, T extends F> void copyOf(F from, T to, boolean ignoreFinal) throws NoSuchFieldException, IllegalAccessException {
        Objects.requireNonNull(from);
        Objects.requireNonNull(to);

        Class<?> clazz = from.getClass();

        for(Field field : clazz.getDeclaredFields()) {
            makePublic(field);

            if(isStatic(field) || (ignoreFinal && isFinal(field)))
                continue;
            else
                makeMutable(field);

            field.set(to, field.get(from));
        }
    }

    public static boolean isStatic(Member instance) {
        return (instance.getModifiers() & Modifier.STATIC) != 0;
    }

    public static boolean isFinal(Member instance) {
        return (instance.getModifiers() & Modifier.FINAL) != 0;
    }

    public static void makeAccessible(AccessibleObject instance, boolean accessible) {
        Objects.requireNonNull(instance);
        instance.setAccessible(accessible);
    }
    public static void makePublic(AccessibleObject instance) {
        makeAccessible(instance, true);
    }
    public static void makePrivate(AccessibleObject instance) {
        makeAccessible(instance, false);
    }

    public static void makeMutable(Member instance) throws NoSuchFieldException, IllegalAccessException {
        Objects.requireNonNull(instance);
        Field modifiers = Field.class.getDeclaredField("modifiers");
        makePublic(modifiers);
        modifiers.setInt(instance, instance.getModifiers() & ~Modifier.FINAL);
    }
    public static void makeImmutable(Member instance) throws NoSuchFieldException, IllegalAccessException {
        Objects.requireNonNull(instance);
        Field modifiers = Field.class.getDeclaredField("modifiers");
        makePublic(modifiers);
        modifiers.setInt(instance, instance.getModifiers() & Modifier.FINAL);
    }
}
