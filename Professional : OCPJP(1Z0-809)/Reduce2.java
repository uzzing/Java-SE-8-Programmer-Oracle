import java.util.Arrays;
import java.util.List;

class Product1 {
	int id;
	int price;
	
	public Product1(int id, int price) {
		this.id = id;
		this.price = price;
	}
	
	public String toString() {
		return id + " : " + price;
	}
}

public class Reduce2 {

	public static void main(String[] args)  {
		
		List<Product1> products = Arrays.asList(new Product1(1, 10), new Product1(2, 30), new Product1(2, 30));
		
		Product1 p = products.stream().reduce(new Product1(4, 0), (p1, p2) -> { p1.price += p2.price; return new Product1(p1.id, p1.price);});
		
		System.out.println(p);
		try {
			products.add(p);
		}  catch(Exception e) {
			e.printStackTrace();
		}
		
		products.stream().parallel().reduce((p1, p2) -> p1.price > p2.price? p1 : p2).ifPresent(System.out::println);

	}

}
