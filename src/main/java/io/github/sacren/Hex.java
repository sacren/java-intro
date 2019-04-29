/**
 * Hex class.
 *
 * <p>Private data:
 * -userStr:String
 *
 * <p>Constructor:
 * +Hex(userStr:String)
 *
 * <p>Public methods:
 * +check():void
 * +getDec():long
 * +toString():String
 */
public class Hex {
    /* private static data */
    private static final int HEX = 16;

    /* private instance data */
    private String userStr;

    /** Hex constructor. */
    public Hex(String userStr) {
        this.userStr = userStr;
        check();
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
    public long getDec() {
        final char[] a = userStr.toCharArray();
        long decimal = 0;
        int index = 0;
        for (char c : a) {
            /* (a.length - 1) is the position of the most significant hex bit.
             * (a.length - ++index) happens to be the exponent.
             */
            decimal += Math.pow(HEX, a.length - ++index) * Character.digit(c, HEX);
        }
        return decimal;
    }

    /** Hex instance description. */
    public String toString() {
        return String.format(
                "Hex:     %s%n"
                        + "Decimal: %d",
                userStr,
                getDec());
    }
}
