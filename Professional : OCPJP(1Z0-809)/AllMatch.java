import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AllMatch {

	public static void main(String[] args) {
		
//		List<String> colors = Arrays.asList("red", "green", "yellow");
		
		List<String> colors = Arrays.asList("green", "red", "yellow");
		
		Predicate<String> test = n -> {
			System.out.println(n);
			System.out.println("Searching i");
			return n.contains("green");
		};
		
		colors.stream()
		.filter(c -> c.length() >= 3)
		.allMatch(test);
	}

}
