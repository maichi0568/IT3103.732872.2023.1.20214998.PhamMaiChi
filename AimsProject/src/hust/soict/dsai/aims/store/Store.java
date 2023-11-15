package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private int MAX_DISC=1000;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_DISC];
	private int  qtyOrdered =0;

	public void addDVD(DigitalVideoDisc dvd1) {
		int i =0;
		while (this.itemsOrdered[i] != null) {
			i++;
			if (i>=MAX_DISC) {
				System.out.println("Store is full");
				return;
		}
		}
		this.itemsOrdered[i] = dvd1;
		System.out.println("Add successfully");
	}
	public void removeDVD(DigitalVideoDisc dvd1) {
		int i =0;
		while (this.itemsOrdered[i]!=dvd1) {
			i++;
			if (i>MAX_DISC) {break;}
		}
		if (i>MAX_DISC) {
			System.out.println("Delete Unsuccessfully");
		}
		else {
			this.itemsOrdered[i] = null;
			System.out.println("Delete successfully");
		}
	}
}
