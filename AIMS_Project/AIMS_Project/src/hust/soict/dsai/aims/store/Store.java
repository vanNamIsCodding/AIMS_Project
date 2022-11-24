package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBERS_STORES = 50;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_STORES];
	private int qtyOrdered = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_STORES) {
			System.out.println("The cart is already full");
		}else {
			this.itemsInStore[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added to store");
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is null");
		}else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (this.itemsInStore[i] == disc) {
					this.itemsInStore[i] = this.itemsInStore[qtyOrdered - 1];
					this.itemsInStore[qtyOrdered - 1] = null;
					qtyOrdered--;
				}
			}
			System.out.println("The disc has been deleted from store");
		}
	}
}
