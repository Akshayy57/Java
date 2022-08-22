/*
 * Write a program to accept an array of integers from the user.
 * After accepting the input, arrange the elements in such a way that the largest element is at the last index 
 * and the smallest is at the 0th index.
 * The first line of input will denote the number of elements in the array followed by the elements.
 * Finally, output the re-arranged array in ascending order.
 * */

package LearnJava;

import java.util.Scanner;

public class ArrangeArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array.");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter array data");

		// for loop to take array data
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// for loop to compare and print array in ascending order.
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}
