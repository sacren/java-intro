/**
 * Test driver for CapInit class.
 */
import java.util.Scanner;

public class TestCapInit {
    /** CapInit driver for the first letter capitalized. */
    public static void main(String[] args) {
        Scanner inStream = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = inStream.nextLine();
        inStream.close();
        CapInit capital = new CapInit(s);
        System.out.println();
        System.out.println("=== Capitalize the first letter ===");
        System.out.println();
        System.out.println(capital);
        System.out.println();
        System.out.println("=== Capitalize by getter ===");
        System.out.println();
        System.out.printf(
                "Original:    %s%n"
                        + "Capitalized: %s%n",
                capital.getUserStr(),
                capital.getCapStr());
    }
}
