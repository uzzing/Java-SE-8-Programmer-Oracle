class MyClass implements Runnable {
	public int value;
	public synchronized void run() {
		while (value < 100) {
			value++;
			System.out.print("value" + value);
		}
	}
}


public class Runnable1 {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		Thread a = new Thread(mc);
		a.start();
		Thread b = new Thread(mc);
		b.start();
	}
}
