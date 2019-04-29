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
 * +check():void
 * +decimal():void
 * +toString():String
 */
public class Hex {
    /* private static data */
    private static final int HEX = 16;

    /* private instance data */
    private String userStr;
    private long decimal;

    /** Hex constructor. */
    public Hex(String userStr) {
        this.userStr = userStr;
        check();
        decimal();
    }

    /** Hex method to validate user input. */
    public void check() {
        final char[] a = userStr.toCharArray();
        /* throw if the user doesn't have input */
        if (a.length == 0) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" is invalid!", userStr));
        }
        for (char c : a) {
            if (Character.digit(c, HEX) == -1) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", userStr));
            }
        }
    }

    /** Hex method of conversion to the decimal number. */
    public void decimal() {
        final char[] a = userStr.toCharArray();
        int index = 0;
        for (char c : a) {
            /* (a.length - 1) is the position of the most significant hex bit.
             * (a.length - ++index) happens to be the exponent.
             */
            decimal += Math.pow(HEX, a.length - ++index) * Character.digit(c, HEX);
        }
    }

    /** Hex instance description. */
    public String toString() {
        return String.format(
                "Hex:     %s%n"
                        + "Decimal: %d",
                userStr,
                decimal);
    }
}
