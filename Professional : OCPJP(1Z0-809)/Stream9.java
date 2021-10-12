import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream9 {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		
		Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(System.out::println);
		Stream.of(list1, list2).flatMapToInt(list -> list.stream()).forEach(System.out::println);
	}

}
