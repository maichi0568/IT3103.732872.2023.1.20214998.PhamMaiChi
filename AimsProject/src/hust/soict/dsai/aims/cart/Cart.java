package hust.soict.dsai.aims.cart;
import java.util.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	// Pham Mai Chi 20214998
	 public void addMedia(Media media) {
	        if (itemsOrdered.contains(media)) {
	            System.out.println("Already has this media");
	        } else {
	            itemsOrdered.add(media);
	            System.out.println("Media added successfully");
	        }
	    }
	 // Pham Mai Chi 20214998
	 public void removeMedia(Media media) {
	        if (itemsOrdered.contains(media)) {
	            itemsOrdered.remove(media);
	            System.out.println("Media remove successfully");
	        } else
	            System.out.println("Media not found");
	    }

	public float totalCost() {
		float totalcost = 0;
		for (Media media : itemsOrdered) {
			totalcost += media.getCost();
		}
		return totalcost;
	}
	public void print() {
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
    }
	
	public Media searchId(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Media founded:");
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match found with id: " + id);
        return null;
    }

    public Media searchTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                System.out.println("Media founded:");
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No match found with title: " + title);
        return null;
    }
	/*public void print() {
		System.out.println("***********************CART***********************");
		for (int i=0; i< this.qtyOrdered; i++) {
			System.out.println((i+1) + ". DVD - " + itemsOrderes[i].getTitle() +" - " + itemsOrderes[i].getCategory() 
					+" - " + itemsOrderes[i].getDirector() + " - " + itemsOrderes[i].getLength() 
					+ ": " + itemsOrderes[i].getCost() + " $");
		}
		System.out.println("Total cost: " + Cart.this.totalCost()+"\n***************************************************");
	}
	/*
	public void searchTitle(String title) {
		for (int i=0; i<this.qtyOrdered; i++) {
			if (this.itemsOrderes[i].isMatchByTitle(title)) {
				System.out.println(this.itemsOrderes[i]);
				return;
			}
		}
		System.out.println("No match is found!");
	}
	
	public void searchID(int id) {
		for (int i=0; i<this.qtyOrdered; i++) {
			if (this.itemsOrderes[i].isMatchByID(id)) {
				System.out.println(this.itemsOrderes[i]);
				return;
			}
		}
		System.out.println("No match is found!");
	}*/
	public Object getItemsOrdered() {
		// TODO Auto-generated method stub
		return null;
	}
}
