import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface CourseFilter extends Predicate<String> {
	public default boolean test(String str) {
		return str.contains("Java");
	}
}


public class Predicate1 {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
		
		Predicate<String> cf1 = s -> s.length() > 3;
		
		Predicate cf2 = new CourseFilter() {
			public boolean test(String s) {
				System.out.print("cf2");
				return s.startsWith("Java");
			}
		};
		
		long c = strs.stream().filter(cf1).filter(cf2).count();
		
		System.out.println(c);
		

	}
	

}
