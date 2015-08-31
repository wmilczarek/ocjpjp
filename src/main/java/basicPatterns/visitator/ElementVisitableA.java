package basicPatterns.visitator;

public class ElementVisitableA implements ElementVisitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		System.out.println("ElementVisitable A sout");
	}
}
