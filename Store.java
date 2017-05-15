import java.util.ArrayList;

public class Store {
	
	ArrayList<Audiobook> AudioINV = new ArrayList<Audiobook>();
	ArrayList<Music> MusicINV = new ArrayList<Music>();
	ArrayList<Movie> MovieINV = new ArrayList<Movie>();
	ArrayList<LP> LPINV = new ArrayList<LP>();
	ArrayList<Media> myCart = new ArrayList<Media>();
	
		 
	
	public void addAudio (Audiobook anItem){
		AudioINV.add(anItem);
	}
	
	public void addMusic (Music anItem){
		MusicINV.add(anItem);
	}
	
	public void addMovie (Movie anItem){
		MovieINV.add(anItem);
	}
	
	public void addLP(LP anItem){
		LPINV.add(anItem);
	}
	
	public void addToCart (Media anItem){
		myCart.add(anItem);
	}
	
	public void removeFromCart (Media anItem){
		myCart.remove(anItem);
	}
	
	public void getAudioINV(){
		System.out.println("Audiobooks");
		System.out.println("----------");
		for(int i = 0; i < AudioINV.size(); i++){
			System.out.println(AudioINV.get(i).title);
		}
		System.out.println();
	}
	
	public void getMusicINV(){
		System.out.println("Music");
		System.out.println("-----");
		for(int i = 0; i < MusicINV.size(); i++){
			System.out.println(MusicINV.get(i).title);
		}
		System.out.println();
	}
	
	public void getMovieINV(){
		System.out.println("Movies");
		System.out.println("------");
		for(int i = 0; i < MovieINV.size(); i++){
			System.out.println(MovieINV.get(i).title);
		}
		System.out.println("");
	}
	
	public void getLPINV(){
		System.out.println("LPs");
		System.out.println("---");
		for(int i = 0; i < LPINV.size(); i++){
			System.out.println(LPINV.get(i).title);
		}
		System.out.println();
	}

	
	public void listCart(){
		System.out.println("My Cart");
		System.out.println("-------");
		for(int i = 0; i < myCart.size(); i++){

			System.out.println(myCart.get(i).getTitle());

		}
		System.out.println();
	}
	
	
}


























