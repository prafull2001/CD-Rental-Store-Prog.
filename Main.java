public class Main {

	public static void main (String[] args){
		
		Store myStore = new Store();
		
		Movie movie1 = new Movie (175, "Lord of the Rings", "Peter Jackson", 2001, 20);
		Movie movie2 = new Movie (130, "Star Wars", "George Lucas", 1977, 15);
		
		Music music1 = new Music (4, "m.A.A.d City", "Kendrick Lamar", 2012, 2);
		Music music2 = new Music (4, "XXX FEAT. U2", "Kendrick Lamar", 2017, 2);
		
		Audiobook book1 = new Audiobook (120, "The Lightning Thief", "Rick Riordan", 2005, 7);
		Audiobook book2 = new Audiobook (120, "Freakonomics", "Steven Levitt", 2005, 8);
		
		LP lp1 = new LP(5, "Careless Whisper", "George Michael", 1984, 2);
		LP lp2 = new LP(5, "Take Five", "Paul Desomond", 1959, 2);
		
		
		
		myStore.addMovie(movie1);
		myStore.addMovie(movie2);
		myStore.addMusic(music1);
		myStore.addMusic(music2);
		myStore.addAudio(book1);
		myStore.addAudio(book2);
		myStore.addLP(lp1);
		myStore.addLP(lp2);

		// Listing Inventory of all Media type
				myStore.getMovieINV();
		myStore.getMusicINV();
		myStore.getAudioINV();
		myStore.getLPINV();
		
		System.out.println();
		System.out.println();

		// Add media to shopping cart		
		myStore.addToCart(movie1);
		myStore.addToCart(book2);
		myStore.addToCart(music1);
		myStore.addToCart(lp1);
		myStore.addToCart(lp2);
		
		//myStore.removeFromCart(lp2);

		// List cart
		myStore.listCart();

		System.out.println("Playing Media from cart exhibiting POLYMORPHISM - each Media item stored in Cart will 'play' in its own unique way");
		System.out.println("------------------------------------------------------------------------------------------------------------------");

		// Polymorphism - each Media item stored in Cart will 'play' in its own unique way
		for(int i = 0; i < myStore.myCart.size(); i++){
			myStore.myCart.get(i).play();
		}
		
	}
	
}
