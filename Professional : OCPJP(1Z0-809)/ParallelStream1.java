import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream1 {

	public static void main(String[] args) {
		
		List<String> nums = Arrays.asList("SE", "EE");
		String ans = nums.parallelStream()
				.reduce("Java", (a, b) -> a.concat(b));
		
		nums.parallelStream().forEach(System.out::println);

		System.out.print(ans);

	}

}
