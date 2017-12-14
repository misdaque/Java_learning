package twenty9;

public class Main {
	public static void main(String args[]) {
		
		System.out.println("Lets begin the game of card");
		
		Gulam gObject= new Gulam();
		Nehla nObject = new Nehla();
		Ekka eObject = new Ekka();
		Dehla dObject = new Dehla();
		
		System.out.println(gObject.Card());
		System.out.println(nObject.Card());
		System.out.println(eObject.Card());
		System.out.println(dObject.Card());
	}

}
