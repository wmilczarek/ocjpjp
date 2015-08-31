package basicPatterns.strategy;


public class Context {


	public static void main(String[] args) {
		boolean select = true;

		if (select) {
			Strategy selectedStrategy = new StrategyA();
			selectedStrategy.doThings();
		} else {

			Strategy selectedStrategy = new StrategyB();
			selectedStrategy.doThings();
		}
	}


}
