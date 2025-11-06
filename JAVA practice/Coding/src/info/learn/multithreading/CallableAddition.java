package info.learn.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAddition {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
				
		FutureTask<Integer> task = new FutureTask<Integer>(new Adder(20,10));
		Thread t1 = new Thread(task);
		t1.start();
		System.out.println(task.get());
	}
}

class Adder implements Callable<Integer>{
	
	private int x = 0;
	private int y = 0;
	
	public Adder() {
		
	}
	
	public Adder(int x, int y) {
		this.x = x;
		this.y =y;
	}

	@Override
	public Integer call() throws Exception {
		return this.x + this.y;
	}
	
}
