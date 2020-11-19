package introduction.lesson7.exceptions.sample1;

public class Main {

	public static void main(String args[]) {
		System.out.println("starting main");
		method1(); //stop here
		System.out.println("finished main");
		
	}
	
	public static void method1() {
		System.out.println("starting method1");
		try {
			int a = 2/0;
			System.out.println("division is: " + a);
			method2(); //stop here
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("finished method1");
	}
	
	public static void method2() {
		System.out.println("starting method2");
		Student s = null;
		System.out.println(s.getRegister());

//		System.out.println("starting method2");
//		try {
//			Student s = null;
//			System.out.println(s.getRegister());
//		}catch(NullPointerException e) {
//			e.printStackTrace();
//		}
//		for(int i=1; i<=3; i++) {
//			System.out.println(i);
//			int a=2/2;
//			System.out.println(a);
//		}
		System.out.println("finished method2");
	}
}
