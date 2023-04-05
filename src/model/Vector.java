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
    private double x;
    private double y;
    private double z;

    // Directional vector
    public Vector(Dot a, Dot b) {
        this.a = a;
        this.b = b;
        updateCoords();
    }

    // Position vector
    public Vector(double x, double y, double z) {
        this.a = new Dot(0, 0, 0);
        this.b = new Dot(x, y, z);
        updateCoords();
    }

    public Dot getA() {
        return a;
    }
    public Dot getB() {
        return b;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    /**
     * Updates "a" as well as the x, y, z values.
     * @param a The new dot a position.
     */
    public void setA(Dot a) {
        this.a = a;
        updateCoords();
    }

    /**
     * Updates "a" as well as the x, y, z values.
     * @param b The new dot b position.
     */
    public void setB(Dot b) {
        this.b = b;
        updateCoords();
    }

    /**
     * Recalculates the x, y, z values from dots a and b.
     */
    public void updateCoords() {
        this.x = getB().getX() - getA().getX();
        this.y = getB().getY() - getA().getY();
        this.z = getB().getZ() - getA().getZ();
    }

    /**
     * Compares the z value of both dots that define the vector.
     * @return True, when the vector points towards the viewer, False, when the vector points away from the viewer.
     */
    public boolean isFacedOut() {
        return (this.a.getZ() - this.b.getZ() > 1);
    }
}
