import java.util.Set;
import java.util.TreeSet;

class Vehicle  implements Comparable<Vehicle> {
	int vno;
	String name;
	
	public Vehicle(int vno, String name) {
		this.vno = vno;
		this.name = name;
	}
	
	public String toString() {
		return vno + ":" + name;
	}
	
	@Override
	public int compareTo(Vehicle v1) {
		int num = this.vno > v1.vno ? 1 : 0;
		return num;
	}

}


public class TreeSet1 {

	public static void main(String[] args) {
		
		Set<Vehicle> vehicles = new TreeSet<>();
		vehicles.add(new Vehicle(10123, "Ford"));
		vehicles.add(new Vehicle(10124, "BMW"));
		System.out.println(vehicles);

	}
}
