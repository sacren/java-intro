/**
 * Triangle subclass implements Shape interface.
 *
 * <p>Private data:
 * -sideA:double
 * -sideB:double
 * -sideC:double
 *
 * <p>Constructor:
 * +Triangle(sideA:double, sideB:double, sideC:double)
 *
 * <p>Public methods:
 * +getArea():double
 * +toString():String
 */
public class Triangle implements Shape {
    /* private instance data */
    private double sideA;
    private double sideB;
    private double sideC;

    /** Triangle constructor with sideA, sideB and sideC. */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /** Triangle getArea method implements Shape interface. */
    @Override
    public double getArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double diffSideA = semiPerimeter - sideA;
        double diffSideB = semiPerimeter - sideB;
        double diffSideC = semiPerimeter - sideC;
        return Math.sqrt(semiPerimeter * diffSideA * diffSideB * diffSideC);
    }

    /** Triangle instance description. */
    public String toString() {
        return String.format(
                "Triangle[Side A=%.2f, Side B=%.2f, Side C=%.2f]",
                sideA, sideB, sideC);
    }
}
