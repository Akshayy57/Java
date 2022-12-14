/*
	 * Accept a three digit number from the user (100 to 999). First, check that the
	 * number has only three digits. Then separate each digit of the number and then
	 * arrange them in the reverse order such that the middle digit remains the same
	 * and first and third digit are swapped.
	 */

package LearnJava;

import java.util.Scanner;

public class SwapThreeDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();

		if (num >= 100 && num <= 999) {
			while (num > 0) {
				int i = num % 10;
				System.out.print(i);
				num /= 10;
			}
		} else {
			System.out.println("Enter a three digit number.");
		}
		sc.close();

	}

}
