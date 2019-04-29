/**
 * Hex class.
 *
 * <p>Private data:
 * -usrStr:String
 * -inArray:char[]
 *
 * <p>Constructor:
 * +Hex(usrStr:String)
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
    private String usrStr;
    private char[] inArray;

    /** Hex constructor. */
    public Hex(String usrStr) {
        this.usrStr = usrStr;
        inArray = usrStr.toCharArray();
        check();
    }

    /** Hex method to validate user input. */
    public void check() {
        /* throw if the user doesn't have input */
        if (inArray.length == 0) {
            throw new IllegalArgumentException(
                    String.format("\"%s\" is invalid!", usrStr));
        }
        for (char c : inArray) {
            if (Character.digit(c, HEX) == -1) {
                throw new IllegalArgumentException(
                        String.format("\"%s\" is invalid!", usrStr));
            }
        }
    }

    /** Hex method of conversion to the decimal number. */
    public long getDec() {
        long decimal = 0;
        int index = 0;
        for (char c : inArray) {
            /* (inArray.length - 1) is the position of the most significant hex bit.
             * (inArray.length - ++index) happens to be the exponent.
             */
            decimal += Math.pow(HEX, inArray.length - ++index) * Character.digit(c, HEX);
        }
        return decimal;
    }

    /** Hex instance description. */
    public String toString() {
        return String.format(
                "Hex:     %s%n"
                        + "Decimal: %d",
                usrStr,
                getDec());
    }
}
