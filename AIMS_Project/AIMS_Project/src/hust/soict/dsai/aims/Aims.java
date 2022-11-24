package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		System.out.println(anOrder.getQtyOrdered());
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		System.out.println(anOrder.getQtyOrdered());
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		System.out.println(anOrder.getQtyOrdered());

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		System.out.println(anOrder.getQtyOrdered());

		//print total cost of the items in the cart
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		//delete DVD from the cart
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println(anOrder.getQtyOrdered());
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println(anOrder.getQtyOrdered());
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println(anOrder.getQtyOrdered());
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());

	}
}
