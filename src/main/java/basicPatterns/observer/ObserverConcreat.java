package basicPatterns.observer;

public class ObserverConcreat implements Observer {

	@Override
	public void update(ThisWillBeObserved thisWillBeObserved) {
		System.out.println("Note Observer class has changed");
		System.out.println(thisWillBeObserved.toString());
	}
}
