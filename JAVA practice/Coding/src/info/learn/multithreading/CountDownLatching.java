package info.learn.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatching {
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);
		Thread t1 = new Thread(new Service(10, latch));
		Thread t2 = new Thread(new Service(20, latch));
		Thread t3 = new Thread(new Service(30, latch));
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
		latch.await();
		System.out.println("All threads executed successfully");
	}
}

class Service implements Runnable{

	private int counter = 0;
	private CountDownLatch latch;
	
	public Service() {
		
	}
	
	public Service(int count, CountDownLatch latch) {
		this.counter = count;
		this.latch = latch;
	}
	
	@Override
	public void run() {
		synchronized(this) {
			System.out.println(Thread.currentThread().getName() + " : "+counter++);
		}
		latch.countDown();
	}
}
