package innerClasses;


public class InnerClassesAndVariables {

	int intVar = 10;

	static int staticIntVar = 15;

	public InnerClassesAndVariables() {
		System.out.println("INNER CLASS");
	}

	static class InnerClass {

		public InnerClass() {
			/*System.out.println(intVar); - this will not compile because inner class has no access to not static top level class variables*/

			System.out.println(staticIntVar);
		}
	}


	public static void main(String[] args) {
		new InnerClassesAndVariables.InnerClass();
	}
}
