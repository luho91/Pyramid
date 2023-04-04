/**
 * Drawable dot in R². Has double and int coordinates.
 * The double value is for calculations.
 * The int value is for drawing.
 */

package model;

import controller.GeoHelper;

public class Dot {

    double x;
    double y;
    double z;

    // Translate coordinates from double to int for drawing.
    int transX;
    int transY;
    int transZ;

    /**
     * Create a dot in R² with x, y and z coordinates.
     * @param x The x coordinate.
     * @param y The y coordinate.
     * @param z The z coordinate.
     */
    public Dot (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.transX = GeoHelper.doubleToInt(getX());
        this.transY = GeoHelper.doubleToInt(getY());
        this.transZ = GeoHelper.doubleToInt(getZ());
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
    public int getTransX() {
        return transX;
    }
    public int getTransY() {
        return transY;
    }
    public int getTransZ() {
        return transZ;
    }

    /**
     * Private to protect from misuse.
     * Is only called by setter for x.
     * @param transX Is calculated in {@link #setX(double)}
     */
    private void setTransX(int transX) {
        this.transX = transX;
    }

    /**
     * Automatically updates both x and transX.
     * @param x The new x value.
     */
    public void setX(double x) {
        this.x = x;
        setTransX(GeoHelper.doubleToInt(this.x));
    }
    /**
     * Private to protect from misuse.
     * Is only called by setter for y.
     * @param transY Is calculated in {@link #setY(double)}
     */
    private void setTransY(int transY) {
        this.transY = transY;
    }
    /**
     * Automatically updates both y and transY.
     * @param y The new y value.
     */
    public void setY(double y) {
        this.y = y;
        setTransY(GeoHelper.doubleToInt(this.y));
    }
    /**
     * Private to protect from misuse.
     * Is only called by setter for z.
     * @param transZ Is calculated in {@link #setZ(double)}
     */
    private void setTransZ(int transZ) {
        this.transZ = transZ;
    }
    /**
     * Automatically updates both z and transZ.
     * @param z The new z value.
     */
    public void setZ(double z) {
        this.z = z;
        setTransZ(GeoHelper.doubleToInt(this.z));
    }

}
