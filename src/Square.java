
//Find square of a number
import java.util.*;

class Square {

	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please input a number:");
		int num = obj.nextInt();
		int result;

		result = findsquare(num);
		System.out.print(",Square:" + result);
	}

	public static int findsquare(int num1) {
		int sq, mul;
		mul = num1 * 1;
		System.out.print(num1 + "*1=" + mul);
		sq = num1 * num1;
		return sq;
	}

}