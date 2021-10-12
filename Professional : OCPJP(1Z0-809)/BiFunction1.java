import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunction1 {

	public static void main(String[] args) {
		
		
		BiPredicate<Integer, Double> val2 = (t1, t2) -> t1 > t2;
		System.out.println(val2.test(10, 10.5));

		
		BiFunction<Integer, Double, Double> val  = (t1, t2) -> t1 + t2;
		System.out.println(val.apply(10, 10.5));
		
		BiConsumer<Integer, Double> val3 = (t1, t2) -> System.out.println(t1 + t2);
		val3.accept(10, 10.5);
	}
}
