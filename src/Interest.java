
//Program to find SI and CI on an amount

import java.util.*;

class Interest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double p, r, t;
		System.out.print("Enter the Principle amount:");
		p = sc.nextDouble();
		System.out.print("\nEnter the Rate of interest:");
		r = sc.nextDouble();
		System.out.print("\nEnter the Time Period in years:");
		t = sc.nextDouble();
		simpleinterest(p, r, t);
		compoundinterest(p, r, t);

	}

	public static void simpleinterest(double p, double r, double t) {
		double si = (p * r * t) / 100;
		System.out.println("Simple interest =" + si);
	}

	// Compound Interest = P(1 + R/100)^t
	public static void compoundinterest(double p, double r, double t) {
		double ci;
		ci = p * (Math.pow((1 + r / 100), t));
		System.out.println("Compound interest =" + ci);

	}

}