
//Program to find if number is Armstrong or not
import java.util.*;

class Armstrong2 {
	public static void main(String args[]) {

		Scanner obj = new Scanner(System.in);
		int num;

		// Taking input
		System.out.print("Please give input:");
		num = obj.nextInt();
		checkarm(num);
	}

	public static void checkarm(int num) {
		int temp, num1;
		int sum = 0;
		// storing value in other value
		num1 = num;

		// looping till num can't be divided further
		while (num != 0) {
			temp = num % 10;
			// System.out.println(temp);
			sum = sum + (temp * temp * temp);
			// Storing sum in sum

			num = num / 10;
		}
//System.out.println(sum);
		if (num1 == sum) {
			System.out.print("ARMSTRONG NUMBER!");
		} else {
			System.out.print("NOT AN ARMSTRONG NUMBER!!!!");
		}

	}

}