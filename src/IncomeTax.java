
//Prog to find tax based on salary of each individual
import java.util.*;

class IncomeTax {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double income;
		double tax;
		System.out.print("Please enter the CTC (upto 10lacs):");
		income = sc.nextDouble();
		if (income >= 0 && income <= 180000) {
			tax = 0;
			System.out.print("Slab A and tax amount is=" + tax);
		} else if (income >= 180001 && income <= 300000) {
			tax = 0.1 * income;
			System.out.print("Slab B and tax amount is=" + tax);
		} else if (income >= 300001 && income <= 500000) {
			tax = 0.2 * income;
			System.out.print("Slab C and tax amount is=" + tax);
		} else if (income >= 500001 && income <= 1000000) {
			tax = 0.3 * income;
			System.out.print("Slab D and tax amount is=" + tax);
		}
	}
}