package basicPatterns.observer;


public interface ThisWillBeObserved {

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void updateObservers();

}
