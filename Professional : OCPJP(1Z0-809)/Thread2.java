import java.util.concurrent.atomic.AtomicInteger;

class MyThread1 implements Runnable {

	private static AtomicInteger count = new AtomicInteger(0);
	
	@Override
	public void run() {
		int x = count.incrementAndGet();
		System.out.print(x + " ");
	}
	
}

public class Thread2 {
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread1());
		Thread thread2 = new Thread(new MyThread1());
		Thread thread3 = new Thread(new MyThread1());
		
		Thread[] ta = {thread1, thread2, thread3};
		for (int x = 0; x < 3; x++) {
			ta[x].start();
		}
	}

}
