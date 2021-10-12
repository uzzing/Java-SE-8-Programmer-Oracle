class MyThread implements Runnable {
	private String src[] = {"A", "B", "C"};
	private int count = 0;
	
	public void run() {
		synchronized(this) {
			while (count < src.length) {
				System.out.print(src[count]);
			}
		}
	}
}


public class Runnable2 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
	}
}
