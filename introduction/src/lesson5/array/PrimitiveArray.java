package lesson5.array;

import java.util.Arrays;
/**
 * This class is an example to help beginners to understand basics concepts 
 * about arrays of primitive types
 * @author kenyo
 *
 */
public class PrimitiveArray {

	public static void main(String[] args) {
		showArrayOfIntegers();
		showArrayOfChars();
		declareAndAssignValuesToArray();
	}

	private static void showArrayOfIntegers() {
		int[] array = new int[10]; //Array to store up to 10 integer values
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;
		array[6] = 70;
		array[7] = 80;
		array[8] = 90;
		array[9] = 100;
		System.out.println(Arrays.toString(array));
	}
	
	
	private static void showArrayOfChars() {
		char[] array = new char[10]; //Array to store up to 10 char values
		//since integer values are assigned to char positions,  
		//the JVM will considerer ASCII codes
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;
		array[6] = 70;
		array[7] = 80;
		array[8] = 90;
		array[9] = 100;
		
		
		System.out.println(Arrays.toString(array));
	}
	
	private static void declareAndAssignValuesToArray() {
		int[] array = {12, 15, 17, 19, 21, 27};
		System.out.println(Arrays.toString(array));
	}
}
