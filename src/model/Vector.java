/**
 * Creates a connection between two Dots.
 * Can also function as a normal vector.
 * @see model.Dot
 * @see model.Triangle
 */

package model;

public class Vector {

    private Dot a;
    private Dot b;

    Vector(Dot a, Dot b) {
        this.a = a;
        this.b = b;
    }

    public Dot getA() {
        return a;
    }
    public Dot getB() {
        return b;
    }

    public void setA(Dot a) {
        this.a = a;
    }
    public void setB(Dot b) {
        this.b = b;
    }

    /**
     * Compares the z value of both dots that define the vector.
     * @return True, when the vector points towards the viewer, False, when the vector points away from the viewer.
     */
    public boolean isFacedOut() {
        return (this.a.getZ() - this.b.getZ() > 1);
    }
}
