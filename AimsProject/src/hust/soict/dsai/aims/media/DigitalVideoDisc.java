package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	// Pham Mai Chi 20214998
	// Class member
	private static int nbDigitalVideoDiscs = 0;
	
	// Pham Mai Chi 20214998
	// Instance member
	private String director;
	private int length;
	
	// Pham Mai Chi 20214998
	// Getter method
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
	// Pham Mai Chi 20214998
	// Create Constructor method

	// Create a DVD object by category, title and cost
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost);
	}
	
	public boolean isMatchByTitle(String title_find) {
		if (title_find.equals(getTitle())) return true;
		else return false;
	}
	
	public boolean isMatchByID(int id) {
		if (id==getId()) return true;
		else return false;
	}
	
	public String toString() {
		return getId() + ". DVD - " + getTitle() + " - " + getCategory() + " - " + this.director + " - " + this.length + ": " + getCost() + " $";
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
