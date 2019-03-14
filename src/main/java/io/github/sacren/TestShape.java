/**
 * Test driver for Shape interface.
 */
public class TestShape {
    /** Shape interface driver. */
    public static void main(String[] args) {
        final double length = 6;
        final double width = 3;
        Shape rectangle = new Rectangle(length, width);
        System.out.println(rectangle);
        System.out.println();
        System.out.printf(
                "Rectangle area is %.2f%n",
                rectangle.getArea());
        final double sideA = 4;
        final double sideB = 5;
        final double sideC = 8;
        Shape triangle = new Triangle(sideA, sideB, sideC);
        System.out.println();
        System.out.println(triangle);
        System.out.println();
        System.out.printf(
                "Triangle area is %.2f%n",
                triangle.getArea());
    }
}
