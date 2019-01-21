package info.learn.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyModel {
	
	private int temp;
	private List<Observer> observer = new ArrayList<Observer>();	
	
	public List<Observer> getObserver() {
		return observer;
	}
	public void setObserver(List<Observer> observer) {
		this.observer = observer;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
		notifyObservers();
	}
	
	public void notifyObservers() {
		List<Observer> observer = this.observer;
		for(Observer record : observer) {
			record.setMyModel(this);
		}	
	}
}
