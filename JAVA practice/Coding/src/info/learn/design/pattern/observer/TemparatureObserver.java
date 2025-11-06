package info.learn.design.pattern.observer;

public class TemparatureObserver implements Observer{

	private boolean alert = false;
	
	@Override
	public void update() {
		System.out.println("Should be alerted "+alert);		
	}

	@Override
	public void setMyModel(MyModel myModel) {
		if(myModel.getTemp() > 10) {
			this.alert = true;
		}
		update();
	}

	public boolean isAlert() {
		return alert;
	}

	public void setAlert(boolean alert) {
		this.alert = alert;
	}

}
