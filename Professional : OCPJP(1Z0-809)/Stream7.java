import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Stream7 {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("pen", "is", "not", "a", "pencil");
		
		Predicate<String> test = s -> {
			int i = 0;
			boolean result = s.contains("pen");
			System.out.print((i++) + " : ");
			return s.contains("a");
		};
		
		str.stream().filter(test).findFirst().ifPresent(System.out::print);
	}

}
