
//Find out if number is Palindrome or not
import java.util.*;

class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0, temp;
		System.out.println("Please enter a number : ");
		num = sc.nextInt();
		int rem;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;

		}
		System.out.println(sum);
		if (sum == temp) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}