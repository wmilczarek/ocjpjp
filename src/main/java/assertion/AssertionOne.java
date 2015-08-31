package assertion;

//todo: check

public class AssertionOne {

	public static void main(String[] args) {
		boolean assertEnabled = false;
		assert assertEnabled = true;

		System.out.println("assertion are" + (assertEnabled ? "enabled":"disabled"));
	}

}
