package info.learn.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		MyModel model = new MyModel();
		List<Observer> temperature = new ArrayList<Observer>();
		temperature.add(new TemparatureObserver());
		model.setObserver(temperature);
		model.setTemp(10);
		model.setTemp(5);
		model.setTemp(20);
		
	}

}
