package lesson4.object.reference.sample5;


/**
 * This class was written just to show for beginners about encapsulation.
 * In this example was encapsulated in the Number class the responsability of
 * determinate if a number is an even or odd number, based on value.
 * 
 * @author kenyo
 *
 */
public class Number {

	public int value;

	public String getType() {
		if(value%2==0) {
			return " even number ";
		}
		return " odd number ";
	}
	
}
