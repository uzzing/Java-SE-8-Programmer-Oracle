import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperator1 {

	public static void main(String[] args) {
		
		List<Integer> codes = Arrays.asList(10, 20);
		UnaryOperator<Double> uo = s -> s + 10.0;
		
		codes.replaceAll(null); 
		

	}

}
