package info.learn.multithreading;

public class ThreadLocalSample {
	
	public static void main(String[] args) {
		MyRunnable temp = new MyRunnable();
		Thread t1 = new Thread(temp);
		Thread t2 = new Thread(temp);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class MyRunnable implements Runnable{

	private ThreadLocal<Integer> local = new ThreadLocal<Integer>();
	
	@Override
	public void run() {
		local.set((int) (Math.random() * 10D));
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		
		System.out.println(local.get());
	}
	
}
