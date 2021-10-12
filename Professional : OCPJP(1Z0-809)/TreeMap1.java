import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		Map<Integer, String> books = new TreeMap<>();
		
		books.put(1007, "A");
		books.put(1002, "C");
		books.put(1003, "D");
		books.put(1003, "B");
		books.put(1003, "Z");
		books.put(1002, "A");
		
		System.out.println(books);

	}

}
