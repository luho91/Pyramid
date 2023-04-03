/**
 * Drawable meta-triangle consisting of 3 dots.
 * Has a positive or negative normal vector depending on the direction of rotation of the dots,
 * @see Dot
 */
public class Triangle {

    Dot a;
    Dot b;
    Dot c;
    boolean normalV;

    public Triangle (Dot myA, Dot myB, Dot myC) {
        this.a = myA;
        this.b = myB;
        this.c = myC;
        this.normalV = getNormalV();
    }

    public boolean getNormalV() {
        return true;
    }

}

