
class Resource implements AutoCloseable {
	public void close() throws Exception {
		System.out.println("close-");
	}
	
	public void open() {
		System.out.println("open-");
	}
}

public class AutoCloseable2 {

	public static void main(String[] args) {
		
		Resource res1 = new Resource();
		
		try {
			res1.open();
			res1.close();
		} catch (Exception e) {
			System.out.print("Exception -1");
		}
		
		Resource res2 = new Resource(); // open, close
		try (Resource res3 = new Resource()) { // open, close, close
			res3.open();
			res3.close();
		} catch (Exception e) {
			System.out.print("Exception -1");
		}
		
	

	}

}
