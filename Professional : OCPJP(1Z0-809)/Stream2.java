import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		
//		Stream<String> stream = listVal.stream();
//		System.out.println(stream.map(x -> x.length() > 3).count());
//		System.out.println(stream.filter(x -> x.length() > 3).count());
		// IllegalStateException: stream has already been operated upon or closed

		System.out.println(
				listVal.stream().filter(x -> x.length() > 3).count());
		
		

	}

}
