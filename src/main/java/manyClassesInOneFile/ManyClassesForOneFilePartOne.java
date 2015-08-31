package manyClassesInOneFile;


abstract class Test {

	void test() {
		System.out.println("Super");
	}
}

//protected - modifier for class protected it not allow here
/* protected */ class SubTest extends Test {

	void test() {
		System.out.println("Super");
	}
}

public class ManyClassesForOneFilePartOne {

	public static void main(String[] args) {

	}

}


