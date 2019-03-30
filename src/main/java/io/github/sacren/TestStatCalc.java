/**
 * Test driver for StatCalc class.
 */
import java.util.Scanner;

public class TestStatCalc {
    /** Test driver for the calculation of dataset. */
    public static void main(String[] args) {
        StatCalc data = new StatCalc();
        Scanner in = new Scanner(System.in);
        double number;
        for ( ; ; ) {
            System.out.println();
            System.out.print("Enter a positive number or 0 to stop: ");
            number = in.nextDouble();
            if ((int)number == 0) {
                break;
            }
            data.addStats(number);
        }
        in.close();
        System.out.println();
        System.out.println("=== List of stats ===");
        System.out.println();
        System.out.println(data);
        System.out.println();
        System.out.println("=== Stats by calling methods ===");
        System.out.println();
        System.out.printf(
                "Number of entries: %d%n"
                        + "Sum of numbers: %.2f%n"
                        + "Sum of squares: %.2f%n"
                        + "Mean value: %.2f%n"
                        + "Standard deviation: %.2f%n"
                        + "Max number: %.2f%n"
                        + "Min number: %.2f%n",
                data.getCount(),
                data.getSum(),
                data.getSquareSum(),
                data.getMean(),
                data.getStandardDeviation(),
                data.getMax(),
                data.getMin());
    }
}
