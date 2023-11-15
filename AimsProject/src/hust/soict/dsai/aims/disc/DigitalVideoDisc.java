package AimsProject;

public class DigitalVideoDisc {
	// Pham Mai Chi 20214998
	// Class member
	private static int nbDigitalVideoDiscs = 0;
	
	// Pham Mai Chi 20214998
	// Instance member
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	private int id = 0;
	
	// Pham Mai Chi 20214998
	// Getter method
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
	// Pham Mai Chi 20214998
	// Create Constructor method
	// Create a DVD object by title
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	// Create a DVD object by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	// Create a DVD object by director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	// Create a DVD object by all attributes
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	
	public boolean isMatchByTitle(String title_find) {
		if (title_find.equals(this.title)) return true;
		else return false;
	}
	
	public boolean isMatchByID(int id) {
		if (id==this.id) return true;
		else return false;
	}
	
	public String toString() {
		return this.id + ". DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost + " $";
	}
}
