import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {
	String course, name, city;

	public Student1(String name, String course, String city) {
		super();
		this.course = course;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return course + " : " + name + " : " + city;
	}

	public String getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
}

public class Stream5 {

	public static void main(String[] args) {
		List<Student1> stds = Arrays.asList(
				new Student1("Mark", "Java ME", "Chicago"),
				new Student1("Helen", "Java EE", "Houston"),
				new Student1("Jessy", "Java ME", "Chicago"));
		
		stds.stream()
		.collect(Collectors.groupingBy(Student1::getCourse))
		.forEach((src, res) -> System.out.println(res));

	}

}
