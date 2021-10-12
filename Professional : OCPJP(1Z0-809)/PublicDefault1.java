
interface Moveable<Integer> {
	
	public default void walk(Integer distance) {
		System.out.println("walking");
	}
	
	public void run(Integer distance);

}


public class PublicDefault1 {

	public static void main(String[] args) {
	
		Moveable<Integer> animal1 = n -> System.out.print("Running" + n);
		animal1.run(100);
		animal1.walk(200);
		
//		Moveable<Integer> animal2 = n -> n + 10;
//		animal2.run(100);
//		animal2.walk(200);
//		
//		Moveable animal3 = (Integer n1, Integer n2) -> n1 + n2;
//		animal2.run(100);
//		animal2.walk(200);

	}

}
