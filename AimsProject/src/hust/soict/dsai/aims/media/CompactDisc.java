package hust.soict.dsai.aims.media;
import java.util.*;

public class CompactDisc extends Disc implements Playable{
	// Pham Mai Chi 20214998
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	public CompactDisc( String title, String category, float cost,String director, String artist) {
		super(title,category,cost,0,director);
		this.artist = artist;
	}
	public void addTrack(Track track) {
		if (tracks.contains(track)){
			System.out.println("Already inside");
			return;
		}
		tracks.add(track);
		//this.setLength(this.getLength() + track.getLength());
		System.out.println("Add Track successfully");
	}
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
				System.out.println("Already inside");
				tracks.remove(track);
				//this.setLength(this.getLength() - track.getLength());
				System.out.println("Remove Track successfully");
				return;
		}
		System.out.println("No Track to Remove");
	}
	public int getLength() {
		int totalLength=0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	
	public void play() {
		System.out.println("Playing compact disc of artist: " + this.artist);
		System.out.println("Compact disc length: " + this.getLength());
		for (Track track : tracks) {
			track.play();
		}
	}
}
