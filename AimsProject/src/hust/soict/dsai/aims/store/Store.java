package hust.soict.dsai.aims.store;
import java.util.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
public class Store {
		private int MAX_DISC=1000;
	    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	   

		// Pham Mai Chi 20214998
	    public void addMedia(Media media) {
	        if (itemsInStore.contains(media)) {
	            System.out.println("Already has this media");
	        } else {
	            itemsInStore.add(media);
	            System.out.println("Media added successfully");
	        }
	    }

	    public void removeMedia(Media media) {
	        if (itemsInStore.contains(media)) {
	            itemsInStore.remove(media);
	            System.out.println("Media remove successfully");
	        } else
	            System.out.println("Media not found");
	    
	}

		public ArrayList<Media> getItemsInStore() {
			// TODO Auto-generated method stub
			return itemsInStore;
		}
}
