import java.util.Arrays;
import java.util.List;

public class Stream6 {

	public static void main(String[] args) {
		List<String> codes = Arrays.asList("B", "C", "A", "D");
		
		codes.parallelStream().forEach(s -> System.out.print(s));
		System.out.println("");
		codes.parallelStream().forEachOrdered(s1 -> System.out.print(s1));

	}

}
