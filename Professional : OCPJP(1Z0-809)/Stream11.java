import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test1 {
	List<String> list = null;
	
	public void printValues() {
		System.out.print(getList());
	}
	
	public List<String> getList() { return list; }
	public void setList(List<String> newList) { this.list = newList; }
	
}

public class Stream11 {

	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
		Test1 t = new Test1();
		t.setList(li.stream().collect(Collectors.toList()));
		// t.getList().forEach(Test::printValues);
		// forEach(Consumer)

	}

}
