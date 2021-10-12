
public class UpCast {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.print(); // Child
		
		Child child = (Child) parent; // downcasting
		child.print(); // Child
		
		Parent parent2 = new Child2();
		parent2.print(); // Child2
		
		Child child2 = new Child2();
		child2.print(); // Child2
		
		parent2 = (Child) child2; // child2
		

	}

}
