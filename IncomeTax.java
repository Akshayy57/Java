package Internshala;

import java.util.Scanner;

public class IncomeTax {
	public static void calculateTax(String name, long income) {
		double tax;
		if (income >= 300000) {
			tax = income * 0.2;
		} else if (income >= 100000 && income < 300000) {
			tax = income * 0.1;
		} else {
			tax = 0;
		}
		System.out.println(name + ": Rs" + tax);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Tax Calculator App");
		System.out.println("----- WELCOME -----");
		System.out.println();

		// Take No. of Persons Count
		System.out.println("Enter Total Persons Count");
		int count = sc.nextInt();
		System.out.println();

		// Array to store Persons name
		String[] name = new String[count];

		// Array to store Incomes
		long[] income = new long[count];

		// for-loop to store name and income
		for (int i = 0; i < count; i++) {
			System.out.println("Enter name " + (i + 1) + ":");
			name[i] = sc.next();
			System.out.println("Enter " + name[i] + "'s Annual Income:");
			income[i] = sc.nextLong();
			System.out.println();
		}

		// Print name and Tax on Income
		System.out.println("Names with liable taxes");
		System.out.println("-----------------------");
		for (int i = 0; i < count; i++) {
			calculateTax(name[i], income[i]);
		}

		sc.close();

	}

}
