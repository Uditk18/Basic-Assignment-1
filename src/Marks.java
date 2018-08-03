
//Prog to find passing marks etc
import java.util.*;

class Marks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m1, m2, m3;
		System.out.print("***PLEASE ENTER MARKS BETWEEN 0-100***");
		System.out.print("\nEnter marks for subject 1:");
		m1 = sc.nextInt();
		System.out.print("\nEnter marks for subject 2:");
		m2 = sc.nextInt();
		System.out.print("\nEnter marks for subject 3:");
		m3 = sc.nextInt();

		if (m1 > 60 && m2 > 60 && m3 > 60) {
			System.out.println("PASSED :)");
		} else if ((m1 > 60 && m2 > 60) || (m1 > 60 && m3 > 60) || (m2 > 60 && m3 > 60)) {
			System.out.println("PROMOTED :|");

		} else if (m1 > 60 || m2 > 60 || m3 > 60 || (m1 < 60 && m2 < 60 && m3 < 60)) {
			System.out.println("FAILED :(");

		}

	}
}