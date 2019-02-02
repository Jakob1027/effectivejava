package com.jakob.effectivejava.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Jakob
 */
// Builder pattern for class hierarchies
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addToppings(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this".
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings;
    }
}
