package strings;
import java.util.Scanner;

public class reverseupperandlower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create an empty string to hold the converted characters
        String convertedString = "";

        // Loop through each character in the input string and convert it
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                // Convert uppercase character to lowercase
                convertedString += Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                // Convert lowercase character to uppercase
                convertedString += Character.toUpperCase(currentChar);
            } else {
                // Leave any other character as it is
                convertedString += currentChar;
            }
        }

        // Print out the converted string
        System.out.println("Converted string: " + convertedString);
    }
}
