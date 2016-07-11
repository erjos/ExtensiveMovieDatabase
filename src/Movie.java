//modified this class to include new field of product ID

public class Movie {
	//two private fields - so need to generate getters
	//we don't need setters because we only name the movie when we create the object
	//when a class doesn't have setters (aka can't change the fields) 
	private String title;
	private String category;
	private int movieID;
	
	public Movie (){
		
	}
	//constructor that accepts a title and category as parameters
	//you have to remember to set your constructor parameters to the fields they relate to in your arguments
	public Movie (String t, String c, int id){
		title = t;
		category = c;
		movieID = id;
	}
	
	//getters and setters
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}
	
	public int getMovieiD(){
		return movieID;
	}
}
