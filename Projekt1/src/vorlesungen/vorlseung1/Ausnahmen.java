package vorlesungen.vorlseung1;

public class Ausnahmen {

	public static int division(int nr1, int nr2) {
		return nr1 / nr2;
	}

	public static void main(String[] args) {

		int nr1 = 4;
		int nr2 = 2;
		System.out.printf("%2d /%2d = %2d %n", nr1, nr2, division(nr1, nr2));
	}

}
