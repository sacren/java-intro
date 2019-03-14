/**
 * Rectangle subclass implements Shape interface.
 *
 * <p>Private data:
 * -length:double
 * -width:double
 *
 * <p>Constructor:
 * +Rectangle(length:double, width:double)
 *
 * <p>Public methods:
 * +getArea():double
 * +toString():String
 */
public class Rectangle implements Shape {
    /* private instance data */
    private double length;
    private double width;

    /** Rectangle constructor. */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /** Rectangle getArea method implements Shape interface. */
    @Override
    public double getArea() {
        return length * width;
    }

    /** Rectangle instance description. */
    public String toString() {
        return String.format(
                "Rectangle[length=%.2f, width=%.2f]",
                length, width);
    }
}
