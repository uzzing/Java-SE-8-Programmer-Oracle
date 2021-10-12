import java.util.ArrayList;
import java.util.List;

public class Painting {
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		String s = "";
//		
//		if (sb.toString().equals(s.toString())) {
//			System.out.print("true");
//		}
		
//		String str = " ";
//		str.trim();
//		System.out.println(str.equals("") + " " + str.isEmpty());
		
		Painting o1 = new Painting();
		Painting o2 = new Painting();
		
		o1.setType(null);
		o2.setType("babo");
		
		System.out.print(o1.getType() + o2.getType());
		
		String[][] arr = new String[5][];
		arr[0] = new String[3];
		arr[1] = new String[5];
		System.out.print(arr.length);
		
		List<Integer> arr1 = new ArrayList<>();
		
		String color = "Teal";
		
		switch(color) {
		case "Y" : 
		case "B" :
		case "Teal" :
			System.out.print("3");
		default :
			System.out.print("4");
		}
		
		
	}

}
