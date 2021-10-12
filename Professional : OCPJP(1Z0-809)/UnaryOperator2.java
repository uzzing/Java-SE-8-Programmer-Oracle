import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperator2 {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> uo1 = s -> s * 2;
		List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
		
		loanValues.stream()
		.filter(lv -> lv >= 1500)
//		.map(lv -> uo1.apply(lv)) // error
		.map(lv -> lv * 2)
		.forEach(s -> System.out.println(s + ""));

	}

}
