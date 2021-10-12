import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
	CyclicBarrier cb;
	public Worker(CyclicBarrier cb) {
		this.cb = cb;
	}
	
	public void run() {
		try {
			cb.await();
			System.out.print("Worker..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Master implements Runnable {
	public void run() {
		System.out.print("Master..");
	}
}

public class CyclicBarrier1 {

	public static void main(String[] args) {
		Master master = new Master(); // implements Runnable
		
		CyclicBarrier cb = new CyclicBarrier(1);
		
		Worker worker = new Worker(cb); // extends Thread
		worker.start();

	}

}
