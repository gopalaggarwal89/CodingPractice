package info.learn.multithreading;

public class CreateDeadlock {

	String str1 = "Unix";
	String str2 = "Java";

	Thread t1 = new Thread("My Thread 1") {

		@Override
		public void run() {
						System.out.println(str1 + " : " +  str2);
		}
	};
	
	public static void main(String a[]) throws InterruptedException{
		CreateDeadlock mdl = new CreateDeadlock();
        mdl.t1.start();
        Thread.currentThread().join();
        System.out.println("Deadlock");
    }

}
