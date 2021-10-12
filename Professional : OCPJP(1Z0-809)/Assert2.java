

public class Assert2 {
	
	public double applyDiscount(double price) {
		assert (price > 0) : "negative";
		return price * 0.50;
	}

	public static void main(String[] args) {
		Assert2 a = new Assert2();
		
		double newPrice = a.applyDiscount(Double.parseDouble(args[0]));
		System.out.println("New Price: " + newPrice);

	}

}
