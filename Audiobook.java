
public class Audiobook extends CD{

	int duration = 0;
	
	public Audiobook(int aDuration, String aTitle, String anAuthor, int aYear, int aPrice){
		super(aTitle, anAuthor, aYear, aPrice);
	}
	
	public void getDuration(){
		System.out.println(duration);
	}
	
	
}
