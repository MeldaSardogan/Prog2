package aufgaben.aufgabe2;

public class MyIntegerMain {

	public static void main(String[] args) {

		MyInteger m1=null, m2=null;
		try {
			 m1 = new MyInteger("-0021") ;
			System.out.println("m1: " + m1.intValue());
		}
		catch(IllegalArgumentException e) {
			System.out.println("m1: " + e.getMessage());
			
		}
		

		try {
			 m1 = new MyInteger("5") ;
			System.out.println("m1: " + m1.intValue());
		}
		catch(IllegalArgumentException e) {
			System.out.println("m1: " + e.getMessage());
		}
		
		System.out.println("m1 equals m2?: " + m1.equals(m2));
		System.out.println("m1 double value: " + m1.doubleValue());
		System.out.println("m1 hashcode: " + m1.hashCode());
	}

}
