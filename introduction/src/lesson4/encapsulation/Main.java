package lesson4.encapsulation;

public class Main {

	public static void main(String[] args) {
		Number[] array = new Number[100]; //creating an array of type Number. The array size is 100
		for (int i = 0; i < 100; i++) {
			Number itemDoArray = new Number(); //creating an object of Number
			itemDoArray.value = (int) (Math.random() * 100); //assigning a random value to the object created
			array[i] = itemDoArray; //making the i position of the array reference the create object 
		}
		int i = 0;
		while (i < 100) {
			System.out.println(array[i].value + "  --  " + array[i].getType()); 
			i++;
		}
	}

}
