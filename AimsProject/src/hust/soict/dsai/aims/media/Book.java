package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media{

	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
	}
	// Pham Mai Chi 20214998 add new author name
	public void addAuthor(String authorName) {
		for (int i=0; i< this.authors.size(); i++) {
			if (this.authors.get(i).equals(authorName)) {
				System.out.println("Author's name already exist!");
				return;
			}
			this.authors.add(authorName);
			System.out.println("Add author's name successfully!");
		}
	}
	
	public void removeAuthor(String authorName) {
		for (int i=0; i< this.authors.size(); i++) {
			if (this.authors.get(i).equals(authorName)) {
				this.authors.remove(authorName);
				System.out.println("Remove successfully!");
				return;
			}
			System.out.println("No author already!");
		}
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
}
