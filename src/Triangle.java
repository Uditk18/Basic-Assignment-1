//Triangle class to set instance variable and methods
class Triangle {
	int side1;
	int side2;
	int side3;

	// Constructor
	public Triangle(int s1, int s2, int s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	// checking if triangle is equilateral or not
	boolean isEquilateral() {
		return (side1 == side2 && side2 == side3 && side3 == side1);
	}

	// checking isosceles
	boolean isIsosceles() {
		return (side1 == side2 || side2 == side3 || side3 == side1);
	}

	// checking scalene
	boolean isScalene() {
		return (side1 != side2 && side2 != side3 && side3 != side1);
	}

	// Checking right angled triangle a^2+b^2=c^2
	boolean isRight() {
		int maxlength;
		maxlength = Math.max(Math.max(side1, side2), side3);
		return (maxlength * maxlength == (side1 * side1) + (side2 * side2) + (side3 * side3) - (maxlength * maxlength));
	}

}