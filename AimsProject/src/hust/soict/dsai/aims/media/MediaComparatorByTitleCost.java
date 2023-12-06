package hust.soict.dsai.aims.media;
import java.util.*;
public class MediaComparatorByTitleCost implements Comparator<Media>{
	public int compare(Media md1,Media md2) {
		if (md1.getTitle().compareTo(md2.getTitle())==1) {
			return 1;
			
		}
		else if (md1.getTitle().compareTo(md2.getTitle())==0) {
			if (md1.getCost()>md2.getCost()) {return 1;}
			else if (md1.getCost()==md2.getCost()) { return 0;}
			else {return -1;}
		}
		// Pham Mai Chi 20214998
		else {return -1;}
	}
	
}
