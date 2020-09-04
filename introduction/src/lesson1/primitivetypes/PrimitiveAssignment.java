package lesson1.primitivetypes;

public class PrimitiveAssignment {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		
		System.out.println("FRIST: a value: " +  a + "; b value: " + b);
		
		b = a;
		System.out.println("SECOND: a value: " +  a + "; b value: " + b);
		
		a = 12;
		System.out.println("THIRD: a value: " +  a + "; b value: " + b);
		
	}
}
