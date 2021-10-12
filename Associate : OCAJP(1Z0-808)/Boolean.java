
public class Boolean {

	public static void main(String[] args) {
		
		String stuff = "TV";
		String res = null;
		
		res = stuff.equals("TV") ? stuff.equals("Movie") ? "1" : "2" : "3";
		
		//res = stuff.equals("TV") ? "1" : stuff.equals("TV") ? "2" : "3";
		System.out.println(res);
		

	}

}
