package basicPatterns.visitator;

public class Client {
	static Visitor visitor;
	static ElementVisitable elementVisitable;

	public static void main(String[] args) {
		elementVisitable = new ElementVisitableA();
		visitor = new VisitorA();

		elementVisitable.accept(visitor);

	}


}
