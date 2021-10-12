import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class IntStream1 {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.of(1, 2, 3);
		IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;
		IntStream newStream = stream.map(inFu.apply(10));
		newStream.forEach(System.out::print);
		

	}

}
