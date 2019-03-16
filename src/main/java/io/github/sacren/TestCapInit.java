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
        System.out.println(capital);
    }
}
