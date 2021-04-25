package aufgaben.aufgabe1;

import javax.swing.JOptionPane;

public class Spiel {

	public static int siegPunkte;
	private static Spieler[] spieler;

	Spiel() {
		anzSpieler();
		siegPunkte();
		nameDerSpieler();
	}
	
	public void anzSpieler() {
		int anzSpieler=0;
		boolean inputOk= false;
		while(!inputOk) {
			try {
				String input = JOptionPane.showInputDialog("Anzahl der Spieler: ");
				inputOk= true;
				anzSpieler=Integer.parseInt(input);

			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein!");
				inputOk = false;
			}
		}
		
		spieler = new Spieler[anzSpieler];
		
	}
	
	public void siegPunkte() {
		
		boolean inputOk= false;
		while(!inputOk) {
			try {
				String input = JOptionPane.showInputDialog("Siegpunkte : ");
				inputOk= true;
				siegPunkte=Integer.parseInt(input);

			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein!");
				inputOk = false;
			}
		}	
		
	}
	
	public void nameDerSpieler() {
		String name ="";
		for(int i =0; i<spieler.length; i++) {
			name = JOptionPane.showInputDialog("Name des Spielers: " + (i +1)+ " : ");
			spieler[i] = new Spieler(name);	
		}
	}


}
