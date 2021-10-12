import java.util.function.Supplier;

class Bird {
	public void fly() {
		System.out.print("Can fly");
	}
}

class Penguin extends Bird {
	public void fly() {
		System.out.print("Cannot fly");
	}
}

public class Supplier1 {

	public static void main(String[] args) {
		
		fly(() -> new Bird()); // Can fly
		fly(Penguin::new); // Cannot fly

	}
	
	static void fly(Supplier<? extends Bird> bird) {
		bird.get().fly();
	}
	
//	static void fly(Consumer<Bird> bird) {
//		bird.accept().fly();
//	}
	
//	static void fly(Supplier<Bird> bird) {
//		bird.get().fly();
//	}
}
