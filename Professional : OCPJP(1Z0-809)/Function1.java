import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		
		List<String> nl = Arrays.asList("Jim", "John", "Jeff");
		Function<String, String> funVal = s -> "Hello : ".concat(s);
		nl.stream().map(funVal).peek(System.out::println);

	}

}
