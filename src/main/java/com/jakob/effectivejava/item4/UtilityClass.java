package com.jakob.effectivejava.item4;

/**
 * @author Jakob
 */
// Noninstantiable utility class
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }

}
