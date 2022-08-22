/*
 * Swap Strings. Keep in mind that you do not have any additional space for more variables. Use just two variable.
 * */

package LearnJava;

import java.util.Scanner;

public class SwapStringWithOnly2Variable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name1:");
		String a = sc.nextLine();

		System.out.println("Enter name2:");
		String b = sc.nextLine();

		System.out.println("Before swap => a: " + a + ", b: " + b);

		// Swapping
		a = a + b; // Add both string
		b = a.substring(0, a.length() - b.length()); // select just the starting String
		a = a.substring(b.length()); // select from second string index

		System.out.println("String after Swap => a: " + a + ", b: " + b);
		sc.close();

	}

}
