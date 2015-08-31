package enums;

//output is:
// PLUSONE : -1 : 0
// MINUSONE : -1 : -2
// ABS : -1 : 1

enum EnumOperations {

	PLUSONE {
		int operate(int value) {

			return ++value;
		}
	},
	MINUSONE {
		int operate(int value) {

			return --value;
		}
	},
	ABS {
		int operate(int value) {

			return Math.abs(value);
		}
	};

	abstract int operate(int x);

}

public class BasicEnumOperations {
	public static void main(String[] args) {
		int value = -1;

		for (EnumOperations theEnum : EnumOperations.values()) {
			System.out.println(theEnum + " : " + value + " : " + theEnum.operate(value));
		}
	}
}


