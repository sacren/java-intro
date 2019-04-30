/**
 * Test driver for Hex class.
 */
import java.util.Scanner;

public class TestHex {
    /** Hex test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String usrStr;
        System.out.print("Enter a hex number: ");
        usrStr = in.nextLine();
        in.close();
        System.out.println();
        System.out.println("=== Hex to decimal ===");
        System.out.println();
        System.out.println(new Hex(usrStr));
    }
}
