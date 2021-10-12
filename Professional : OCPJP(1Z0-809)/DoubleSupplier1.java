import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class DoubleSupplier1 {
	
	String name;
	Double cost;
	

	public DoubleSupplier1(String name, Double cost) {
		this.name = name;
		this.cost = cost;
	}
	
	String getName() { return name; }
	double getCost() { return cost; }


	public static void main(String[] args) {
		DoubleSupplier1 j1 = new DoubleSupplier1("IT", null);
		IntSupplier js1 = j1::getCost;
		js1.getAsInt();
	}

}
