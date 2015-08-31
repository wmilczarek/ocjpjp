package basicPatterns.visitator;


public class VisitorB implements Visitor {

	@Override
	public void visit(ElementVisitableA elementA) {
		System.out.println("inside VisitorB -> ElementVisitableA method ");
	}

	@Override
	public void visit(ElementVisitableB elementB) {
		System.out.println("inside VisitorB -> ElementVisitableB method ");
	}
}
