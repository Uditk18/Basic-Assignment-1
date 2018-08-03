//Inverting an input string
import java.util.*;

class StringInv {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String str = "Lets take it to other level";

//System.out.println("Please input a string:");
//str=sc.nextLine();

		String[] words = str.split(" ");
		String revstring = "";
		int i, j;

		for (i = 0; i < words.length; i++) {
			String word = words[i];
			String revword = "";

			for (j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);
			}
			revstring = revstring + revword + " ";

		}

		System.out.println("Inverted String is:" + revstring);

	}
}