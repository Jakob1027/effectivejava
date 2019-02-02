package com.jakob.effectivejava.item10;

/**
 * @author Jakob
 */
public class Equals {
    public static void main(String[] args) {
        Point redPoint = new ColorPoint(1, 2, "red");
        Point smellPoint = new SmellPoint(1, 2, 3);
        redPoint.equals(smellPoint);
    }
}
