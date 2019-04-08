/**
 * Test driver for Hex class.
 */
import java.util.Scanner;

public class TestHex {
    /** Hex test driver. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hexStr = in.nextLine();
        in.close();
        Hex hex = new Hex(hexStr);
        System.out.println();
        System.out.println("=== Hex conversion to decimal ===");
        System.out.println();
        System.out.println(hex);
    }
}
