package basicPatterns;


// Perfect Singleton patter -> synchronized is used for multi threading
public class Singleton {

private static Singleton singleton;

	private Singleton(){}

	public static final synchronized Singleton getInstance(){

		if(singleton == null){
			singleton = new Singleton();
		}

		return singleton;
	}

}
