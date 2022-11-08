/*
* This program reverse a string
*
* @author  Peter Gemmell
* @version 1.0
* @since   2022-11-07
*/

/**
* This is the marks program.
*/
final class Main {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Reverses an inputted string.
    *
    * @param text this is the inputted text
    * @return returns reverse of text
    */
    public static String reverse(final String text) {

        final String returnValue;

        if (text.length() == 0) {
            returnValue = text;
        } else {

            returnValue = reverse(text.substring(1)) + (text.charAt(0));
        }
        return returnValue;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String text = "recursion";

        final String reversedText = reverse(text);

        System.out.println(text);
        System.out.println(reversedText);

        System.out.println("\nDone.");
    }
}
