package model;

/**
 * Drawable dot in R². Has double and int coordinates.
 * The double value is for calculations.
 * The int value is for drawing.
 */
public class Dot {

    double x;
    double y;
    double z;

    // Translate coordinates from double to int for drawing.
    /*
    int transX;
    int transY;
    int transZ;*/

    public Dot (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
