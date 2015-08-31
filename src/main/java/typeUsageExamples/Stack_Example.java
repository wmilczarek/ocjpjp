package typeUsageExamples;


import java.util.Stack;

//Stack: lifo - based data structure
public class Stack_Example {

	public static final String[] CuteKitens = {"cat1", "cat2", "cat3", "cat4", "cat5", "cat6"};

	public static final String UglyCat = "fucking ugly as shit cat";

	private static Stack<String> testStack = new Stack<String>();

	public static void main(String[] args) {


		for (String cat: CuteKitens) {
			testStack.push(cat);
			System.out.println(testStack.peek());
		}

		System.out.println(testStack.toString());

		hideUglyCat(3);
	}

	private static void hideUglyCat(int i) {

		testStack.add(i,UglyCat);
		System.out.println(testStack.toString());
	}


}
