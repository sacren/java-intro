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
            System.out.print("Enter a number or 0 to stop: ");
            number = inputStream.nextDouble();
            if ((int)number == 0) {
                break;
            }
            calc.enter(number);
            System.out.println(calc);
        }
        inputStream.close();
        System.out.println();
        System.out.println("=== List of stats ===");
        System.out.println();
        System.out.printf(
                "Number of rolls is %d%n"
                        + "Sum of the numbers in the dataset is %.2f%n"
                        + "Sum of the square of numbers in the dataset is %.2f%n"
                        + "Max number of the dataset is %.2f%n"
                        + "Min number of the dataset is %.2f%n",
                calc.getCount(),
                calc.getSum(),
                calc.getSquareSum(),
                calc.getMax(),
                calc.getMin());
    }
}
