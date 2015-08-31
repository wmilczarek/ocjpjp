package basicPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ThisWillBeObservedConcreat implements ThisWillBeObserved {


	List<Observer> observers;


	public ThisWillBeObservedConcreat() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void updateObservers() {

		observers.stream().forEach(o -> o.update(this));

	}

	public static void main(String[] args) {
		ThisWillBeObserved thisWillBeObserved = new ThisWillBeObservedConcreat();
		thisWillBeObserved.addObserver(new ObserverConcreat());
		thisWillBeObserved.addObserver(new ObserverConcreat());
		thisWillBeObserved.updateObservers();
	}
}
