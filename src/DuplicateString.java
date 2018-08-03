import java.util.Scanner;

class DuplicateString {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		int i = 0;
		// character to store string characters one by one
		char ch;
		// creating empty string to store final string without duplicates
		String ans = "";

		// length of the input string
		int length = str.length();

		// loop till end of string
		for (i = 0; i < length - 1; i++) {
			ch = str.charAt(i); // extract each character in string
			if (ch != ' ') { // if char is not space
				ans = ans + ch; // add the char to final answer

			}
			str = str.replace(ch, ' '); // replace the character in the whole string with space

		}
		System.out.println("String without duplicates = " + ans);

	}

}