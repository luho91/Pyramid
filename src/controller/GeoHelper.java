/**
 * Helper class with auxiliary static functions.
 */

package controller;

public class GeoHelper {
    /**
     * Casts a double value to rounded int.
     * @param d The double value.
     * @return The rounded int value.
     */
    public static int doubleToInt(double d) {
        return (int) Math.round(d);
    }
}
