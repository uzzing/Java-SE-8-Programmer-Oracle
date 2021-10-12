import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Fragment {

	public static void main(String[] args) {
		
		Stream<List<String>> iStr = Stream.of(
				Arrays.asList("1", "John"),
				Arrays.asList("2", null));
		
		Stream<String> nlnSt = iStr.flatMap(x -> x.stream());
		nlnSt.forEach(System.out::print);
		

	}

}
