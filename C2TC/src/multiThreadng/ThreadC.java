package multiThreadng;

public class ThreadC {

	public static void main(String[] args) throws InterruptedException {
	
		ThreadD d = new ThreadD();
		d.start();
		
		synchronized (d) {
			
			System.out.println("main thread calling wait() method"); //step 1
			System.out.println();
			d.wait();
			
			System.out.println("main method got notification call"); //step 4
			System.out.println();
			
			System.out.println("total balance " +d.totalBalance);
			System.out.println();
		}
	}

}

class ThreadD extends Thread {
	int totalBalance = 0;
	public void run() {
		
		synchronized (this) {
			System.out.println("child Thread starts calculation for total balance"); //step 2
			System.out.println();
			
			for(int i=0; i<=50; i++) {
				
				totalBalance =totalBalance + i;
			}
			
			System.out.println("child class gives notification call"); //step 3
			System.out.println();
			this.notify();

		}
	}
}







