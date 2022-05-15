package multiThreadng;

public class SetThreadPriorityDemo extends Thread{

	public void run() {
		 System.out.println("Thread "+ Thread.currentThread().getName()+ " started");
		 System.out.println("Thread with priority "+ Thread.currentThread().getPriority()+ " is runnig");
	}
	public static void main(String[] args) {
		SetThreadPriorityDemo t1 = new SetThreadPriorityDemo();
		SetThreadPriorityDemo t2 = new SetThreadPriorityDemo();
		SetThreadPriorityDemo t3 = new SetThreadPriorityDemo();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
