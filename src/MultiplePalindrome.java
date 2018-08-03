import java.util.*;

class MultiplePalindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// as input size is 10
		String arr[] = new String[10];
		int i, j, k, l, count;
		StringBuilder str = new StringBuilder("");
		char temp;

		// Taking input from user
		System.out.println("Enter input strings : ");
		for (i = 0; i <= 9; i++) {
			arr[i] = sc.nextLine();
		}
		// Creating empty string
		String a = "";

		for (i = 0; i <= 9; i++) {
			str = new StringBuilder("");
			for (j = arr[i].length() - 1; j >= 0; j--) {
				str = str.append(arr[i].charAt(j));
			}
			a = str.toString();
			if (arr[i].equals(a)) {
				count = str.length() - 1;
				for (k = 0; k <= count; k++) {
					for (l = k + 1; l < count; l++) {
						if ((int) str.charAt(k) < (int) str.charAt(l)) {
							temp = str.charAt(k);
							str.setCharAt(k, str.charAt(l));
							str.setCharAt(l, temp);
						}
					}
				}
				System.out.println(str + " " + (count + 1));
			}

		}

	}

}
