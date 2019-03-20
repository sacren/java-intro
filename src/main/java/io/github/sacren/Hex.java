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
    public long toDecimal() {
        long decimal = 0;
        int position = 0;
        char[] a = userStr.toCharArray();
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
                    decimal += Math.pow(16, a.length - position) * Character.digit(c, 16);
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
