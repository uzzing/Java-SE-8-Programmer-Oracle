import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp1 {
	private String eName;
	private Integer eAge;
	
	Emp1(String eN, Integer eA) {
		this.eName = eN;
		this.eAge = eA;
	}
	
	public Integer getEAge() {
		return eAge;
	}
	
	public String getEName() {
		return eName;
	}
	
}


public class Stream3 {

	public static void main(String[] args) {
		
		List<Emp1> li = Arrays.asList(new Emp1("Sam", 20), new Emp1("John", 60), new Emp1("Jim", 51));
		
		Predicate<Emp1> agVal = s -> {
			System.out.print("check");
			return s.getEAge() < 60;
		};
	
		
		li = li.stream().filter(agVal).collect(Collectors.toList());
		//li.stream().sorted((v1, v2) -> v1.getEAge() < v2.getEAge());
		Stream<String> names = li.stream().map(Emp1::getEName);
		names.forEach(n -> System.out.print(n + " "));
	
	}

}
