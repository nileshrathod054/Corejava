package multiThreadng;

public class SetPriorityThread extends Thread{

	public void run() {
		 System.out.println("Thread "+ Thread.currentThread().getName()+ " started");
		 System.out.println("Thread with priority "+ Thread.currentThread().getPriority()+ " is runnig");
	}
	public static void main(String[] args) {
		SetThreadPriorityDemo t1 = new SetThreadPriorityDemo();
		SetThreadPriorityDemo t2 = new SetThreadPriorityDemo();
		SetThreadPriorityDemo t3 = new SetThreadPriorityDemo();
		
		t1.setPriority(3);
		t2.setPriority(9);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

