/**
 * Drawable meta-triangle consisting of 3 dots.
 * Can check calculate the normal vector and evaluate its direction.
 * @see model.Dot
 */

package model;

import controller.MathHelper;

public class Triangle {

    private Dot a;
    private Dot b;
    private Dot c;

    public Triangle (Dot a, Dot b, Dot c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Dot getA() {
        return a;
    }
    public Dot getB() {
        return b;
    }
    public Dot getC() {
        return c;
    }

    public void setA(Dot a) {
        this.a = a;
    }
    public void setB(Dot b) {
        this.b = b;
    }
    public void setC(Dot c) {
        this.c = c;
    }

    public Vector calcNormalVector() {
        return MathHelper.crossProduct(new Vector(getA(), getB()), new Vector(getA(), getC()));
    }
}

