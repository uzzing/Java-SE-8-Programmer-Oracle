
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class R implements Runnable {
	public void run() { System.out.println("Run..."); }
}

class C implements Callable<String> {
	public String call() throws Exception { return "Call..."; }
}


public class ExecutorService1 {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newSingleThreadExecutor();
//		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(new R());
		
		Future<String> f1 = es.submit(new C());
		try {
			System.out.println(f1.get().);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.shutdown();

	}

}
