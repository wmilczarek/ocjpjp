package others;


public class Uncompilable<T> {

	T Obj;

/* not compiling because static

	static T t;

	static T get() {
		return t;
	}

	static void showObj()	{
		T obj = new T();
	}*/

}
