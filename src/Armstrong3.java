
//Print armstrong numbers between 100-1000
import java.util.*;

class Armstrong3 {
	public static void main(String args[]) {
		int num;
		System.out.print("Armstrong numbers between 100 and 1000 are:");

		for (num = 100; num <= 1000; num++) {
			checkarm(num);
		}
	}

	public static void checkarm(int num) {
		int temp, num1;
		int sum = 0;
		num1 = num;
		while (num != 0) {
			temp = num % 10;
			// System.out.println(temp);
			sum = sum + (temp * temp * temp);
			// System.out.println(sum);

			num = num / 10;
		}
//System.out.println(sum);
		if (num1 == sum) {
			System.out.println(num1);
		}

	}

}