

class Vehicle3 {
	int distance;
	
	Vehicle3(int x) {
		this.distance = x;
	}
	
	public void increSpeed(int time) {
		int timeTravel = time;
		
		class Car {
			int value = 0;
			
			public void speed() {
				value = distance / timeTravel;
				
				System.out.print("Velocity with new speed" + value + "kmph");
			}
		}
		
		new Car().speed();
	}
}

public class Object2 {

	public static void main(String[] args) {
		
		Vehicle3 v = new Vehicle3(100);
		v.increSpeed(60);
	}

}


interface Doable {
	public void doSomething(String s);
}

class Work implements Doable {
	public void doSomething(Integer i) {}
}