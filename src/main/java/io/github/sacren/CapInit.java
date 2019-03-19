/**
 * CapInit class with first letter capitalized.
 *
 * <p>Private data:
 * -userStr:String
 * -capStr:String
 *
 * <p>Constructor:
 * +CapInit(userStr:String)
 *
 * <p>Public methods:
 * +getUserStr():String
 * +getCapStr():String
 * +capitalize():String
 * +toString():String
 */
public class CapInit {
    /* private instance data */
    private String userStr;
    private String capStr;

    /** CapInit constructor. */
    public CapInit(String userStr) {
        this.userStr = userStr;
        capStr = capitalize();
    }

    /** CapInit getter for user input. */
    public String getUserStr() {
        return userStr;
    }

    /** CapInit getter for capitalized string. */
    public String getCapStr() {
        return capStr;
    }

    /** CapInit method to capitalize the string by the user. */
    public String capitalize() {
        String capitalized = "";
        char prev = '.';
        for (char current : userStr.toCharArray()) {
            if (!Character.isLetter(prev) && Character.isLetter(current)) {
                current = Character.toUpperCase(current);
            }
            capitalized += current;
            prev = current;
        }
        return capitalized;
    }

    /** CapInit instance description. */
    public String toString() {
        return String.format(
                "Original:    %s%n"
                        + "Capitalized: %s",
                userStr,
                capStr);
    }
}
