import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
	String fName;
	String lName;
	
	public Emp(String fn, String ln) {
		this.fName = fn;
		this.lName = ln;
	}
	
	public String getfName() { return fName; }
	
	public String getlName() { return lName; }

	@Override
	public String toString() {
		return "Emp [fName=" + fName + ", lName=" + lName + "]";
	}
	
	
}

public class Collectors1 {

	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList(
				new Emp("John", "Smith"),
				new Emp("Peter", "Sam"),
				new Emp("Thomas", "Wale"));
		
		List<Emp> newEmp = emp.stream()
		.sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))
		.collect(Collectors.toList());
		
		newEmp.forEach(System.out::println);

	
		//.map(Emp::getfName).sorted(Comparator.reverseOrder())


	}

}
