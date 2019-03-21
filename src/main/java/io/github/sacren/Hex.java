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
        int hex = 16;
        int index = 0;
        char[] a = userStr.toCharArray();
        /* throw if the user doesn't have input */
        if (a.length == 0) {
            return -1;
        }
        for (char c : a) {
            if (Character.digit(c, hex) == -1) {
                return -1;
            }
            decimal += Math.pow(hex, a.length - ++index) * Character.digit(c, hex);
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
