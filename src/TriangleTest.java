
//import Triangle.java;
import java.util.*;

class TriangleTest {
	public static void main(String args[]) {
		// creating 3 objects and passing values through constructor
		Triangle t1 = new Triangle(10, 10, 10);
		Triangle t2 = new Triangle(10, 9, 8);
		Triangle t3 = new Triangle(3, 4, 5);

//Checking triangle 1
		System.out.println("Is TRIANGLE 1");
		System.out.println("Equilateral? : " + t1.isEquilateral());
		System.out.println("Isosceles? : " + t1.isIsosceles());
		System.out.println("Scalene? : " + t1.isScalene());
		System.out.println("Equilateral? : " + t1.isRight());

		System.out.println("Is TRIANGLE 2");
		System.out.println("Equilateral? : " + t2.isEquilateral());
		System.out.println("Isosceles? : " + t2.isIsosceles());
		System.out.println("Scalene? : " + t2.isScalene());
		System.out.println("Equilateral? : " + t2.isRight());

		System.out.println("Is TRIANGLE 3");
		System.out.println("Equilateral? : " + t3.isEquilateral());
		System.out.println("Isosceles? : " + t3.isIsosceles());
		System.out.println("Scalene? : " + t3.isScalene());
		System.out.println("Equilateral? : " + t3.isRight());

	}
}