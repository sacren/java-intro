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

    /** CapInit method to capitalize the string by the user. */
    public String capitalize(String str) {
        String[] array = str.split(" ");
        String s = "";
        int count = 0;
        char c;
        for (String word : array) {
            count++;
            if (word.isEmpty()) {
                s += " ";
                continue;
            }
            c = word.charAt(0);
            if (Character.isLetter(c)) {
                s += Character.toUpperCase(c);
            } else {
                s += c;
            }
            if (count == array.length) {
                s += word.substring(1);
            } else {
                s += word.substring(1) + " ";
            }
        }
        return s;
    }

    /** CapInit instance desciption. */
    public String toString() {
        return String.format(
                "Input:  %s%n"
                        + "Output: %s",
                userStr,
                capStr);
    }
}
