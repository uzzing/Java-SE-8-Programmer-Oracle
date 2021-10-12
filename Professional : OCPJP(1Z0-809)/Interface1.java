
class Bird {
	String name;
	Bird(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.print(name + "is eating");
	}
}

interface BirdInt {
	Bird getBird(String name);
}

public class Interface1 {

	public static void main(String[] args) {
		
		BirdInt b1 = Bird::new;
		Bird b = b1.getBird("Peacook");
		b.eat();

	}

}
