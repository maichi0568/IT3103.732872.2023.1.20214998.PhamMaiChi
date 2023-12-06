package hust.soict.dsai.aims.media;

public class Track implements Playable{
	
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	// Pham Mai Chi 20214998
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track(String title,int length) {
		this.title = title;
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	// Pham Mai Chi 20214998
	public boolean equals(Object o){
        if (o instanceof Track){
            Track that = (Track) o;
            return this.title == that.title && this.length == that.length;
        }
        else{
            return false;
        }
    }
}
