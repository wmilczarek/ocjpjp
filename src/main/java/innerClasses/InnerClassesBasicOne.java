package innerClasses;


//This will print only "INNER CLASS" - because top class will be not instantiating

public class InnerClassesBasicOne {

	private static int i = 1;

	private static void f() {
		System.out.print(i);
	}

	InnerClassesBasicOne() {
		System.out.println("TOP CLASS");
	}

	static class TheInnerClass {

		TheInnerClass() {
			System.out.println("INNER CLASS");
		}

		void g() {
			f();
		}
	}

	public static void main(String[] args) {
		new InnerClassesBasicOne.TheInnerClass();
	}

}
