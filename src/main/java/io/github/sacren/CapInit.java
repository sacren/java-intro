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

    /** CapInit method for capitalization in another way. */
    public String getCap() {
        String[] array = userStr.split(" ");
        String s = "";
        int count = 0;
        int index; /* first letter in word */
        char c;
        for (String word : array) {
            count++;
            if (word.isEmpty()) {
                s += " ";
                continue;
            }

            /* determine the first occurrence of letter in word */
            index = firstLetter(word);

            /* no letter in word */
            if (index < 0) {
                if (count == array.length) {
                    s += word;
                } else {
                    s += word + " ";
                }
                continue;
            }

            /* there is a letter in word */
            s += word.substring(0, index); /* non-letter characters */
            s += Character.toUpperCase(word.charAt(index));
            /* the rest of word */
            if (count == array.length) {
                s += word.substring(index + 1);
            } else {
                s += word.substring(index + 1) + " ";
            }
        }
        return s;
    }

    /* helper for index of the first letter in word */
    private int firstLetter(String word) {
        int index = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                return index;
            }
            index++;
        }
        return -1; /* no letter in word */
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
