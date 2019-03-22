/**
 * Test driver for StatCalc class.
 */
import java.util.Scanner;

public class TestStatCalc {
    /** Test driver for the calculation of dataset. */
    public static void main(String[] args) {
        StatCalc calc = new StatCalc();
        double number;
        Scanner inputStream = new Scanner(System.in);
        for ( ; ; ) {
            System.out.println();
            System.out.print("Enter a positive number or 0 to stop: ");
            number = inputStream.nextDouble();
            if ((int)number == 0) {
                break;
            }
            calc.addStats(number);
        }
        inputStream.close();
        System.out.println();
        System.out.println("=== List of stats ===");
        System.out.println();
        System.out.println(calc);
    }
}
