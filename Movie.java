
public class Movie extends CD {
	
	int duration = 0;
	
	public Movie (int aDuration, String aTitle, String anAuthor, int aYear, int aPrice){
		super(aTitle, anAuthor, aYear, aPrice);
		duration = aDuration;
	}
	
	public void getDuration(){
		System.out.println(duration);
	}
	
}
