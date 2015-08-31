package basicPatterns.visitator;

public class VisitorA implements Visitor{
	@Override
	public void visit(ElementVisitableA elementA) {

		System.out.println("inside VisitorA -> ElementVisitableA method ");
	}

	@Override
	public void visit(ElementVisitableB elementB) {
		System.out.println("inside VisitorA -> ElementVisitableB method ");
	}
}
