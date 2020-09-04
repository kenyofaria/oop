package lesson2.objectreference;


/**
 * This class provide an example to show for beginners about Java objects references.
 * This example make use of MyType class. This class has no responsibility, serving only 
 * to make an instance.
 * 
 * @author kenyo
 *
 */
public class ObjectReferenceDemonstrate {

	public static void main(String[] args) {
		MyType t1 = new MyType();
		MyType t2 = new MyType();
		MyType t3 = new MyType();
		
		System.out.println("object t1 reference: " + t1);
		System.out.println("object t2 reference: " + t2);
		System.out.println("object t3 reference: " + t3);
		
		MyType[] array = new MyType[3];
		
		array[0] = t1;
		array[1] = t2;
		array[2] = t3;
		
		System.out.println("object array[0] reference: " + array[0]);
		System.out.println("object array[1] reference: " + array[1]);
		System.out.println("object array[2] reference: " + array[2]);
		
	}
}
