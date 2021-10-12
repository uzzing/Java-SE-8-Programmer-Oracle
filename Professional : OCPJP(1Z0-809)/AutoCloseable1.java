import java.io.IOException;

final class Folder implements AutoCloseable {

	public void open() {
		System.out.print("Open");
	}
	
	@Override
	public void close() throws IOException {
		
		System.out.print("Close");
		
	}
	
}

public class AutoCloseable1 {

	public static void main(String[] args) throws Exception {
		
		try (Folder f = new Folder()) {
			f.open();
		}

	}

}
