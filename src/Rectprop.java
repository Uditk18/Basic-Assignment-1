
//Program defining Rectangle Properties
import java.util.*;

class Rectprop {
	public static void main(String args[]) {
		rectangle rect1 = new rectangle();
		rectangle rect2 = new rectangle();

		int area1 = rect1.area(20, 30);
		int area2 = rect2.area(20, 20);
		if (area1 == area2) {
			System.out.println("Both rectangles have same area and area is : " + area1);
		} else {
			System.out.println("Both areas are different");
		}
		int peri1 = rect1.perimeter(20, 30), peri2 = rect2.perimeter(20, 20);
		System.out.println("Perimeter of rectangle 1:" + peri1 + "\nPerimeter of rectangle 2:" + peri2);

	}
}

class rectangle {
	int length;
	int breadth;

	int area(int length, int breadth) {
		return length * breadth;
	}

	int perimeter(int length, int breadth) {
		return (2 * (length + breadth));
	}

}