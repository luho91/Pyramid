/**
 * Drawable meta-triangle consisting of 3 dots.
 * Has a positive or negative normal vector depending on the direction of rotation of the dots,
 * @see model.Dot
 */

package model;

public class Triangle {

    Dot a;
    Dot b;
    Dot c;
    boolean nvDirection;

    public Triangle (Dot a, Dot b, Dot c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.nvDirection = getNVDirection();
    }

    // Normal vector direction calculation: Does it point towards or away from the viewer?
    public boolean getNVDirection() {
        return true;
    }
}

