

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @autor nakama
 */

class Mobile {
	static String name = "Smartphone";
	String brand;
	int price;

	static void show(Mobile m) {
		System.out.println("Name: " + name);
		System.out.println("Brand: " + m.brand);
		System.out.println("Price: " + m.price);
	}
	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}

}
public class estaticas {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "Samsung";
		m1.price = 30000;
		Mobile m2 = new Mobile();
		m2.brand = "Apple";
		m2.price = 70000;

		m2.show();
		m1.show();
		Mobile.show(m1);
	}
}