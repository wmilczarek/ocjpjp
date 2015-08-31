package basicPatterns.visitator;

public class ElementVisitableB implements ElementVisitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		System.out.println("ElementVisitable A sout");
	}
}
