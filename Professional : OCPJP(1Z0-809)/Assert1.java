
class Engine {
	double fuelLevel;
	Engine(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	public void start() {
//		assert fuelLevel > 0 : "Impossible fuel";
		//assert fuelLevel < 0 : System.exit(0);
		System.out.print("Started");
	}
	
	public void stop() {
		System.out.print("Stopped");
	}
	
}

public class Assert1 {

	public static void main(String[] args) {
		
//		Engine e = new Engine(-1);
		Engine e = new Engine(1);
		e.start();
		e.stop();
		
	}

}
