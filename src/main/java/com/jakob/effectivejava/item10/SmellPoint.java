package com.jakob.effectivejava.item10;

/**
 * @author Jakob
 */
public class SmellPoint extends Point {
    private final long smell;

    public SmellPoint(int x, int y, long smell) {
        super(x, y);
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        if (!(o instanceof SmellPoint)) {
            return o.equals(this);
        }
        return super.equals(o) && ((SmellPoint) o).smell == smell;
    }
}
