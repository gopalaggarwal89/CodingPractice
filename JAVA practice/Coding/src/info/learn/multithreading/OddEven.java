package info.learn.multithreading;

public class OddEven{

	public static void main(String[] args) {		
		Printer printer = new Printer();
		Thread t1 = new Thread(new TaskEven(printer));
        Thread t2 = new Thread(new TaskOdd(printer));
        t2.start();
        t1.start();
	}
}

class TaskEven implements Runnable{
	private Printer printer;

	public TaskEven(Printer printer) {		
		this.printer = printer;
	}

	@Override
	public void run() {
		for(int i=2;i<=10;i+=2) {
			printer.printEven(i);
		}		
	}
	
}

class TaskOdd implements Runnable{
	
	private Printer printer;	
	
	public TaskOdd(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {	

		for(int i=1;i<=10;i+=2) {
			printer.printOdd(i);
		}
		
	}
	
}

class Printer{
	
	boolean flag = true;
	
	synchronized void printEven(int i) {
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even: "+i);
		flag = true;
		notify();
	}

	synchronized void printOdd(int i) {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd: "+i);
		flag = false;
		notify();
	}
}