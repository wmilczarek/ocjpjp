package typeUsageExamples.dataStructures;


import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

//Queue: Fifo - based data structure
public class Queue_Example {

	private static final String[] Customers = { "cus1", "cus2", "cus3", "cus4", "cus5", "cus6", "cus7" };

	private static final Queue<String> queueTest = new ArrayDeque<>();


	public static void main(String[] args) {

		for(String customer: Customers){
			queueTest.add(customer); // add throws exception when cant insert
			queueTest.offer("separator"); // offer dose not throw exception when can't insert
		}
		System.out.println(queueTest);

		removeFromEmptyQueue(); // exception will be thrown
		pollFromEmptyQueue(); // nothing will happen

	}

	private static void removeFromEmptyQueue () {
		try {
			new ArrayDeque<>().element();
		} catch (NoSuchElementException e) {
			System.out.println(e.fillInStackTrace());
		}
	}

	private static void pollFromEmptyQueue() {
		new ArrayDeque<>().poll();
		System.out.println("After empty poll");
	}

}
