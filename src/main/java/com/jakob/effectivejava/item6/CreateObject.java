package com.jakob.effectivejava.item6;

/**
 * @author Jakob
 */
public class CreateObject {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    // Hideously slow! Can you spot the object creation?
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
