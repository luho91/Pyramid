/**
 * Helper class with auxiliary static functions.
 */

package controller;

import model.Vector;

public class MathHelper {
    public static Vector crossProduct(Vector v1, Vector v2) {
        return new Vector((v1.getY() * v2.getZ()) - (v1.getZ() * v2.getY()), (v1.getZ() * v2.getX()) -(v1.getX() * v2.getZ()), (v1.getX() * v2.getY()) - (v1.getY() * v2.getX()));
    }
}
