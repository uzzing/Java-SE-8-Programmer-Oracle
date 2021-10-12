
public class StringTrim {

	public static void main(String[] args) {
		
		String s = "Java Duke";
		int len = s.trim().length();
		System.out.println(len);
		
		String s1 = s.replace(" ", "");
		String s2 = s.concat(s);
		System.out.println(s2);

	}

}
