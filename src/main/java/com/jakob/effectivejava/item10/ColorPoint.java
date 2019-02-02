package com.jakob.effectivejava.item10;

/**
 * @author Jakob
 */
public class ColorPoint extends Point {
    private final String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates transitivity!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;

        // If o is a normal Point, do a color-blind comparison
        if (!(o instanceof ColorPoint)) {
            return o.equals(this);
        }

        return super.equals(o) && ((ColorPoint) o).color.equals(color);
    }
}
