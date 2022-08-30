/*
 	* Calculate the area of different figures like rectangle, square, circle. Input
 	* the operands by the user for side length or radius. For performing the same
	* create a different class Area and make the methods for the different figures.
	* Then in the Main class, use the Area class to perform these operations.
	* Example - Input: Radius = 3 Output: 28.26
	*/

package Internshala;

import java.util.Scanner;

public class ObjectArea {
	// if you want to use method in same class.
	// rectangle
	//	public static void rectangleArea(float length, float breadth) {
	//		float area = length * breadth;
	//		System.out.println(area);
	//	}
	//
	//	// square
	//	public static void squareArea(float side) {
	//		float area = side * side;
	//		System.out.println(area);
	//	}
	//
	//	// circle
	//	public static void circleArea(float radius) {
	//		double area = Math.PI * radius * radius;
	//		System.out.println(area);
	//
	//	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Area a1 = new Area();

		System.out.println("What you want to calculate?");
		System.out.println("1. Area of rectangle");
		System.out.println("2. Area of Square");
		System.out.println("3. Area of Circle");

		int input = sc.nextInt();
		switch (input) {
		case 1:
			System.out.println("Enter length and breadth");
			float length = sc.nextFloat();
			float breadth = sc.nextFloat();
			a1.rectangleArea(length, breadth);
			break;
		case 2:
			System.out.println("Enter side of a square");
			float side = sc.nextFloat();
			a1.squareArea(side);
			break;
		case 3:
			System.out.println("Enter radius of the circle");
			float radius = sc.nextFloat();
			a1.circleArea(radius);
			break;
		default:
			System.out.println("Enter valid Choice");
		}
		System.out.println();
		sc.close();

	}

}

class Area {
	// rectangle
	void rectangleArea(float length, float breadth) {
		float area = length * breadth;
		System.out.println(area);
	}

	// square
	void squareArea(float side) {
		float area = side * side;
		System.out.println(area);
	}

	// circle
	void circleArea(float radius) {
		double area = Math.PI * radius * radius;
		System.out.println(area);

	}
}