package lesson3.wrappertypes;

/**
 * This example is about existing wrapper types in java. 
 * The example make use of some existing methods in the String type.
 *  
 * @author kenyo
 *
 */
public class WrapperStringType {

	
	public static void main(String[] args) {
		String s = "Oriented-object programming";
		printValue(s);
		printSize(s);
		printCharAt(s);
		printSubString(s);
		makingShards(s);
		String cpf = "198.187.109-00";
		Validator validator = new Validator();
		String cpfWithoutHifenAndDots = validator.extractCPFDigits(cpf);
		System.out.println("cpf without hifen and dots: " + cpfWithoutHifenAndDots);
	}

	private static void makingShards(String s) {
		String[] shards = s.split(" ");
		System.out.println("first shard: " + shards[0]);
		System.out.println("second shard: " + shards[1]);
	}

	private static void printSubString(String s) {
		System.out.println("substring from "
				+ "position 3 to position 6: " + s.substring(3, 6));
	}

	private static void printCharAt(String s) {
		System.out.println("char at position 3: " + s.charAt(3));
	}

	private static void printSize(String s) {
		System.out.println("size: " + s.length());
	}

	private static void printValue(String s) {
		System.out.println("value: " + s);
	}
	
}
