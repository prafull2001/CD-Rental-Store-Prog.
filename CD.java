
public class CD implements Media{
	
	String title = " ";
	String author = " ";
	int yearPub = 0;
	int price = 0;
	
	public CD (String aTitle, String anAuthor, int aYear, int aPrice){
		title = aTitle;
		author = anAuthor;
		yearPub = aYear;
		price = aPrice;
	}
	
	public String getTitle(){
		return this.title;
	}

	public void getAuthor(){
		System.out.println(author);
	}

	public void getYear(){
		System.out.println(yearPub);
	}

	public void getPrice(){
		System.out.println("Price");
	}
	
	public void play(){
		System.out.println("PLAYED CD " + title + " by " + author);
	}
	
	public void pause(){
		System.out.println("PAUSED CD " + title + " by " + author);
	}
	
	public void stop(){
		System.out.println("STOPPED CD " + title + " by " + author);
	}

}
