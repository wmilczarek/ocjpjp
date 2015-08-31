package others;


import java.util.Vector;

//compilation error in for loop - Vector is an object not primitive.

public class javaVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(2);
		v.add(3);
		v.add(5);

/*		for (int i: v){
			....
		}*/
	}
}
