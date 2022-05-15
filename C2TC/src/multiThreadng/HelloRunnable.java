package multiThreadng;

public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello...Welcome to Capgemini....");
		
	}

public static void main(String...args) {
	
	HelloRunnable hello = new HelloRunnable();
	
	Thread helloThread  = new Thread(hello);
	
	helloThread.start();
    
    }

}