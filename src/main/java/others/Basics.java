package others;

//Output - is 10 10 !

class A {
	int i = 5;
}

public class Basics{

	public  static void changeOne(A p){
		p.i =0;
	}

	public static void changeTwo(A p){
		p = new A();
	}
	public static void main(String[] args){
		A obj = new A();
		changeOne(obj);
		System.out.println(obj.i);
		changeTwo(obj);
		System.out.println(obj.i);
	}


}
