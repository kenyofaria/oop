package encapsulation;


/**
 * This class was written just to show for beginners about encapsulation.
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
