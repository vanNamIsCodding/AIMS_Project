package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[20];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}else {
			this.itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	void orderedItemsCart() {
		float sum = 0;
		System.out.println("***********************CART***********************");
		System.out.println("Odered Items:");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.printf("%d.DVD - [Title: %s] - [Category: %s] - [Director: %s] - [Length: %d] - [Price: %f $] \n", i+1, itemOrdered[i].getTitle(), itemOrdered[i].getCategory(), itemOrdered[i].getDirector(), itemOrdered[i].getLength(), itemOrdered[i].getCost());
			sum += itemOrdered[i].getCost();
		}
		System.out.printf("Total cost: [%f $] \n", sum);
		System.out.println("***************************************************");
	}
	
	public void searchIdDVDs(int id) {
		int i;
		for (i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].getId() == id) {
				System.out.println("The DVD: ");
				System.out.printf("[Id: %d] - [Title: %s] - [Category: %s] - [Director: %s] - [Leagth: %d] - [Price: $f $]\n", itemOrdered[i].getId(), itemOrdered[i].getTitle(), itemOrdered[i].getCategory(), itemOrdered[i].getDirector(), itemOrdered[i].getLength(), itemOrdered[i].getCost());
				break;
			}
		}
		if (i == MAX_NUMBERS_ORDERED) {
			System.out.println("The DVD is not found");
		}
	}
	
	public void searchTitleDVDs(String title) {
		int i;
		for (i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].getTitle().equalsIgnoreCase(title)) {
				System.out.println("The DVD: ");
				System.out.printf("[Id: %d] - [Title: %s] - [Category: %s] - [Director: %s] - [Leagth: %d] - [Price: $f $]\n", itemOrdered[i].getId(), itemOrdered[i].getTitle(), itemOrdered[i].getCategory(), itemOrdered[i].getDirector(), itemOrdered[i].getLength(), itemOrdered[i].getCost());
				break;
			}
		}
		if (i == MAX_NUMBERS_ORDERED) {
			System.out.println("The DVD is not found");
		}
	}
	void addDigitalVideoDisc(DigitalVideoDisc []dvdList) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}else {
			for (int i = 0; i < dvdList.length; i++) {
				if (qtyOrdered == MAX_NUMBERS_ORDERED) {
					System.out.println("The cart is already full");
					break;
				}else {
					this.itemOrdered[qtyOrdered] = dvdList[i];
					qtyOrdered++;
				}
			}
			if (qtyOrdered != MAX_NUMBERS_ORDERED) {
				System.out.println("The list dvd has been addded");
			}
		}
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}else {
			this.itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			System.out.println("The div1 has been added");
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is already full");
			}else {
				this.itemOrdered[qtyOrdered] = dvd2;
				qtyOrdered++;
				System.out.println("The div2 has been added");
			}
		}
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is null");
		}else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (this.itemOrdered[i] == disc) {
					this.itemOrdered[i] = this.itemOrdered[qtyOrdered - 1];
					this.itemOrdered[qtyOrdered - 1] = null;
					qtyOrdered--;
				}
			}
			System.out.println("The disc has been deleted");
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += this.itemOrdered[i].getCost();
		}
		return sum;
	}
}
