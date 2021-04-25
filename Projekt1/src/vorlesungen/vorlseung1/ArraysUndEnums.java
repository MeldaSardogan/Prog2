package vorlesungen.vorlseung1;

public class ArraysUndEnums {
	
	enum Weekday { MO, DI, MI, DO, FR, SA , SO };
	
	public static void printDay(Weekday day) {
		
		switch(day)
		{
		case MO : System.out.println("Montag"); break;
		case DI : System.out.println("Dienstag"); break;
		case MI  : System.out.println("Mittwoch"); break;
		case DO : System.out.println("Donnerstag"); break;
		case FR : System.out.println("Freitag"); break;
		case SA : System.out.println("Samstag"); break;
		case SO : System.out.println("Sonntag"); break;
		default : System.out.println("kein Tag"); break;
		}
	}
	
	
	public static void printDay(int day) {
		
		switch(day)
		{
		case 0 : System.out.println("Montag"); break;
		case 1 : System.out.println("Dienstag"); break;
		case 2 : System.out.println("Mittwoch"); break;
		case 3 : System.out.println("Donnerstag"); break;
		case 4 : System.out.println("Freitag"); break;
		case 5 : System.out.println("Samstag"); break;
		case 6 : System.out.println("Sonntag"); break;
		default : System.out.println("kein Tag"); break;
		}
	}
	
	public static void printDay(String day) {
		switch(day)
		{
		case "Mo" : System.out.println("Montag"); break;
		case "Di" : System.out.println("Dienstag"); break;
		case "Mi" : System.out.println("Mittwoch"); break;
		case "Do" : System.out.println("Donnerstag"); break;
		case "Fr" : System.out.println("Freitag"); break;
		case "Sa" : System.out.println("Samstag"); break;
		case "So" : System.out.println("Sonntag"); break;
		default : System.out.println("kein Tag"); break;
		}
	}

	public static void main(String[] args) {
		
		int [] intArray = new int[4];
		String [][] stringArray = new String[4][5];
		int [][] mdintArray = new int[3][4];
		
		for (int i = 0; i < stringArray.length; i++) {
			
			for(int j =0; j < stringArray[i].length ; j++) {
				stringArray[i][j] = "(" + i + "," + j + ")";
				
			}
		}
		
		
		for (int i = 0; i < stringArray.length; i++) {
			
			System.out.print(i + ": ");
			for(int j =0; j < stringArray[i].length ; j++) {
				System.out.print(stringArray[i][j] + " ");
				
			}
			System.out.println();
		}
		
		printDay(1);
		//printDay(123); --> kann man machen da nicht ausgeschlossen
		//wurde, gibt jedoch nichts aus; mit deafault wird dies behoben.
		printDay(123); // Ausgabe: kein Tag
		
		printDay("Mo");
		printDay("Hallo"); // viel größeren Wertebereich als ich verwalten möchte
		//nicht optimal, dafür gibt es Enums = aufzählungstypen
		
		printDay(Weekday.SA); //NameDerKlasse.WertDerÜbergebenWird
		//statische Kosntaten, über den Klassen Namen greife ich auf Sie zu
		// es kann kein weiterer Wert hinzugefügt werden
		
		Weekday day = Weekday.MO;
		System.out.println(day);
		
		
	}

}
