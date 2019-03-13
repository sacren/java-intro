/**
 * Test driver for StatCalc class.
 */
import java.util.Scanner;

public class TestStatCalc {
    /** Test driver for the calculation of dataset. */
    public static void main(String[] args) {
        StatCalc calc = new StatCalc();
        System.out.println(calc);
        double number;
        Scanner inputStream = new Scanner(System.in);
        for ( ; ; ) {
            System.out.println();
            System.out.print("Enter a positive number or 0 to stop: ");
            number = inputStream.nextDouble();
            if (number < 0) {
                throw new IllegalArgumentException(
                        String.format("%f is invalid!", number));
            }
            if ((int)number == 0) {
                break;
            }
            calc.addStats(number);
            System.out.println(calc);
        }
        inputStream.close();
        if (calc.getCount() == 0) {
            System.out.println();
            System.out.println("No stats at all!");
        } else {
            listStats(calc);
        }
    }

    /* static helper for list of stats */
    private static void listStats(StatCalc calc) {
        System.out.println();
        System.out.println("=== List of stats ===");
        System.out.println();
        System.out.printf(
                "Number of entries is %d%n"
                        + "Sum of the numbers in the dataset is %.2f%n"
                        + "Sum of the square of numbers in the dataset is %.2f%n"
                        + "Mean value of the dataset is %.2f%n"
                        + "Standard deviation fo the dataset is %.2f%n"
                        + "Max number of the dataset is %.2f%n"
                        + "Min number of the dataset is %.2f%n",
                calc.getCount(),
                calc.getSum(),
                calc.getSquareSum(),
                calc.getMean(),
                calc.getStandardDeviation(),
                calc.getMax(),
                calc.getMin());
    }
}
