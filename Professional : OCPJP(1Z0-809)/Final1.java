
final class IceCream {
	public void prepare() {}
}

class Cake {
	public final void bake(int min, int temp) {}
	public void mix() {}
}

class Bread extends Cake {
	public void bake(int min, int temp) {}
	public void addToppings() {}
}

public class Final1 {
		private Cake c = new Cake();
		private final double discount = 0.25;
		public void makeReady() {
			c.bake(10, 120);
		}
}
