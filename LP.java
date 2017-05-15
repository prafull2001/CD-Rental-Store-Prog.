
public class LP implements Media{
	
	String title = " ";
	String author = " ";
	int yearPub = 0;
	int price = 0;
	int duration = 0;
	
	public LP (int aDuration, String aTitle, String anAuthor, int aYear, int aPrice){
		duration = aDuration;
		title = aTitle;
		author = anAuthor;
		yearPub = aYear;
		price = aPrice;
	}
	
	public void play(){
		System.out.println("PLAYED LP " + title + " by " + author);
	}
	
	public void pause(){
		System.out.println("PAUSED LP " + title + " by " + author);
	}
	
	public void stop(){
		System.out.println("STOPPED LP " + title + " by " + author);
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
		System.out.println(price);
	}
	
	public void getDuration (){
		System.out.println(duration);
	}

}
