package aufgaben.Aufgabe5;

public class TestKlasse {

	public static void main(String[] args) {

		SetOperations so = new SetOperations();
		so.fill();
		so.fillBothUnion();
		so.print();
		so.fillBothIntersection();
		so.print();
		so.fillBothDifference();
		so.print();

		
	}

}
