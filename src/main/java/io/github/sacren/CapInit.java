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
 * +capitalize(:String):String
 * +toString():String
 */
public class CapInit {
    /* private instance data */
    private String userStr;
    private String capStr;

    /** CapInit constructor. */
    public CapInit(String userStr) {
        this.userStr = userStr;
        capStr = capitalize(userStr);
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
    public String capitalize(String str) {
        String capitalized = "";
        char prev = '.';
        for (char next : str.toCharArray()) {
            if (!Character.isLetter(prev) && Character.isLetter(next)) {
                next = Character.toUpperCase(next);
            }
            capitalized += next;
            prev = next;
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
