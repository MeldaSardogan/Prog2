package aufgaben.aufgabe3;

public class TestKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solitaire game = new Solitaire();
		System.err.println("    START");
		System.out.println();
		game.print();
		System.out.println();
		int zug =1;
		while(game.moveFirstPossible())
		{
			System.err.println("After "+ zug+". move:");
			System.out.println();
			zug++;
			game.print();	
		}

		System.err.println("No possible moves");


	}

}
