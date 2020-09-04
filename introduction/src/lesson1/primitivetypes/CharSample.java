package lesson1.primitivetypes;

/**
 * This class aims to demonstrate what is char type in Java
 * @author kenyo
 *
 */
public class CharSample {

	
	public static void main(String[] args) {
		char c = 'k';
		System.out.println("default char is: " + c);
		
		char letter = 65;
		System.out.println("the letter is: " + letter);
		
		char otherLetter = (char)(letter+1);
		System.out.println("the other letter is: " + otherLetter);
		
		System.out.println("Oh!! It seems that default "
						 + "letter was changed: " + (char)(c+1));
	}
}
