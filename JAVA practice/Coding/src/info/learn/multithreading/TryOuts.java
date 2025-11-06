package info.learn.multithreading;

public class TryOuts implements Runnable{

	@Override
	public void run() {
		System.out.println("Running");		
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		t1.start();
		t1.start();
	}
	

}
