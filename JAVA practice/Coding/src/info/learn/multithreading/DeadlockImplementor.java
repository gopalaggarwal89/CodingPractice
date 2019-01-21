package info.learn.multithreading;

public class DeadlockImplementor implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new DeadlockImplementor());
		t.start();
		t.join();
		System.out.println("Test");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

}
