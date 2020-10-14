package lesson9.list.sample1;

import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
//		String array[] = new String[10];
//		
//		array[0] = "a 1";
//		array[1] = "a 2";
//		array[2] = "a 3";
//		array[3] = "a 4";
//		array[4] = "a 5";
//		array[5] = "a 6";
//		array[6] = "a 7";
//		array[7] = "a 8";
//		array[8] = "a 9";
//		array[9] = "a 10";
//		
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
//		
//		System.out.println(" --------------------------------------------------- ");
		
		
		list.add("b 1");
		list.add("b 2");
		list.add("b 3");
		
		for(String s: list) {
			System.out.println(s);
		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
	}

}
