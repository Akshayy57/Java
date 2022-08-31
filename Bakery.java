package Bakery;

import java.util.ArrayList;

class Cake {
	String name;
	float price;

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for price
	public float getPrice() {
		return price;
	}

	// Setter for price
	public void setPrice(float price) {
		this.price = price;
	}

	void display() {
		System.out.println(name + " : " + '\u20B9' + price + " per pound");
	}
}

class Pastry extends Cake {
	@Override
	void display() {
		System.out.println(name + " : " + '\u20B9' + price + " per piece");
	}
}

public class Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cake cake1 = new Cake();
		cake1.setName("Choclate Brownie");
		cake1.setPrice(250.0f);

		Cake cake2 = new Cake();
		cake2.setName("Choclate Maple");
		cake2.setPrice(300.0f);

		Pastry pastry1 = new Pastry();
		pastry1.setName("Black Forest");
		pastry1.setPrice(35.0f);

		Pastry pastry2 = new Pastry();
		pastry2.setName("Choco Truffle");
		pastry2.setPrice(40.0f);

		ArrayList<Cake> cakeList = new ArrayList<>();
		cakeList.add(cake1);
		cakeList.add(cake2);

		ArrayList<Pastry> pastryList = new ArrayList<>();
		pastryList.add(pastry1);
		pastryList.add(pastry2);

		System.out.println("             Today's Special Menu             ");
		System.out.println("----------------------------------------------");
		System.out.println();
		System.out.println("Special Cakes");
		System.out.println("----------------------------------------------");

		for (Cake items : cakeList) {
			items.display();
		}

		System.out.println();
		System.out.println("Special Pastries");
		System.out.println("----------------------------------------------");

		for (Pastry items : pastryList) {
			items.display();
		}

	}

}
