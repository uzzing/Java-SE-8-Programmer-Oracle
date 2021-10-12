import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream8 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 20, 8);
		
		System.out.print(nums.stream().max(Comparator.comparing(a -> a)).get());
		
//		System.out.print(nums.stream().max(Integer::max).get()); // 10
	}

}
