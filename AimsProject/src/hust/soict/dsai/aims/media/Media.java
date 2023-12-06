package hust.soict.dsai.aims.media;
import java.util.Comparator;
public abstract class Media {
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	private int id;
	private String title;
	private String category;
	private float cost;

	public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public float getCost(){
        return cost;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCost(float cost){
        this.cost=cost;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public Media(String title, String category, float cost){
        this.title=title;
        this.category=category;
        this.cost=cost;
        //this.id = ++Media.nbMedia;
    }

    public Media(String title){
        this.title=title; 
        //this.id = ++Media.nbMedia; 
    }
    
    public Media(String title, String category, String director, int length, float cost) {
    	this.title=title;
        this.category=category;
        this.cost=cost;
        //this.director=director;
        //this.length=lenght;
	}
    
    public Media(String title, String category, String director, float cost) {
    	this.title=title;
        this.category=category;
        this.cost=cost;
	}
    
    public boolean equals(Object o){
        if (o instanceof Media){
            Media that = (Media) o;
            return this.title == that.title; 
        }
        else{
            return false;
        }
    }
}

