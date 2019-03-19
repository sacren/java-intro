/**
 * Hex class.
 *
 * <p>Private data:
 * -userStr:String
 * -decimal:long int
 *
 * <p>Constructor:
 * +Hex(userStr:String)
 *
 * <p>Public methods:
 * +toDecimal(userStr:String):int
 * +toString():String
 */
public class Hex {
    /* private static data */
    private static final String ERROR_MSG = "Invalid user input!";

    /* private instance data */
    private String userStr;
    private long decimal;

    /** Hex constructor. */
    public Hex(String s) {
        userStr = s;
        decimal = toDecimal();
    }

    /** Hex method of conversion to the decimal number. */
    public int toDecimal() {
        int decimal = 0;
        int position = 0;
        char[] a = userStr.toCharArray();
        int digit = 0;
        for (char c : a) {
            position++;
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    digit = Character.digit(c, 10);
                    break;
                case 'a':
                case 'A':
                    digit = 10;
                    break;
                case 'b':
                case 'B':
                    digit = 11;
                    break;
                case 'c':
                case 'C':
                    digit = 12;
                    break;
                case 'd':
                case 'D':
                    digit = 13;
                    break;
                case 'e':
                case 'E':
                    digit = 14;
                    break;
                case 'f':
                case 'F':
                    digit = 15;
                    break;
                default:
                    return -1;
            }
            decimal += Math.pow(16, a.length - position) * digit;
        }
        return decimal;
    }

    /** Hex instance description. */
    public String toString() {
        if (decimal == -1) {
            throw new IllegalArgumentException(ERROR_MSG);
        }
        return String.format(
                "Hex:     %s%n"
                        + "Decimal: %d",
                userStr,
                decimal);
    }
}
