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
 * +decimal():void
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
        decimal();
    }

    /** Hex method of conversion to the decimal number. */
    public void decimal() {
        final char[] a = userStr.toCharArray();
        final int hex = 16;
        int index = 0;
        int digit;
        /* throw if the user doesn't have input */
        if (a.length == 0) {
            decimal = -1;
            return;
        }
        /* convert to decimal */
        decimal = 0;
        for (char c : a) {
            digit = Character.digit(c, hex);
            if (digit == -1) {
                decimal = -1;
                return;
            }
            /* (a.length - 1) is the position of the most significant hex bit.
             * (a.length - ++index) happens to be the exponent.
             */
            decimal += Math.pow(hex, a.length - ++index) * digit;
        }
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
