import java.util.Scanner;

/**
 * Name: Donovan Kilpela
 * Course: CIS 171 Java 
 * Date: 6/21/24
 */

public class TextFoundKilpela {

	// Method that will get the string from user input
	public static boolean doubleVowels(String word) {
		for (int i = 0; i < word.length() - 1; i++) {
			if ((word.charAt(i) == 'e' && word.charAt(i + 1) == 'e')
					|| word.charAt(i) == 'o' && word.charAt(i + 1) == 'o') {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String word;
		boolean foundMatch = false;

		// Gets the user input and lets them know what is the Sentinel Value
		System.out.print("Enter a word. Enter in exit to quit: ");
		word = scnr.nextLine().toLowerCase();

		// This will make it loop until the foundMatch is turned to True
		while (!foundMatch) {

			// This will check the input and if it is exit it will end the loop and program
			if (word.equals("exit")) {
				System.out.println();
				System.out.println("Thank you for using this program");
				foundMatch = true;

				// This is if the word has ee or oo in the word and lets the user know and asks
				// for another word
			} else if (doubleVowels(word)) {
				System.out.println();
				System.out.println("Double Vowles (ee or oo) found in the word");
				System.out.print("Enter a word. Enter in exit to quit: ");

				word = scnr.nextLine().toLowerCase();

				// This will let the user know that it doesn't have the double vowel and asks
				// user for another word
			} else {
				System.out.println();
				System.out.println("Double vowles (ee or oo) not found try again");
				System.out.print("Enter a word. Enter in exit to quit: ");
				word = scnr.nextLine().toLowerCase();

			}
		}
		// Closes the scanner
		scnr.close();

	}

}
