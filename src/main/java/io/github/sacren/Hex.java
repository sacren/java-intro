/**
 * Hex class.
 *
 * <p>Private data:
 * -userStr:String
 * -decimal:long
 *
 * <p>Constructor:
 * +Hex(userStr:String)
 *
 * <p>Public methods:
 * +toDecimal(userStr:String):long
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
    public long toDecimal() {
        long decimal = 0;
        int index = 0;
        char[] a = userStr.toCharArray();
        /* throw if the user doesn't have input */
        if (a.length == 0) {
            return -1;
        }
        for (char c : a) {
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
                case 'a':
                case 'A':
                case 'b':
                case 'B':
                case 'c':
                case 'C':
                case 'd':
                case 'D':
                case 'e':
                case 'E':
                case 'f':
                case 'F':
                    decimal += Math.pow(16, a.length - ++index) * Character.digit(c, 16);
                    break;
                default:
                    return -1;
            }
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
