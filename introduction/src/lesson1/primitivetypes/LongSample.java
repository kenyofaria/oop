package lesson1.primitivetypes;

public class LongSample {

	public static void main(String[] args) {
		// this assignment works
		long number = 9223372036854775807l;
		System.out.println(number);

		// why does this assignment not work?
//		long nextNumber = 9223372036854775809l;
//		System.out.println(nextNumber);

	}
}
