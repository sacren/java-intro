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
    }
}
