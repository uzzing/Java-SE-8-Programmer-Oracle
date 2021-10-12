import java.util.function.UnaryOperator;

public class UnaryOperator3 {

	public static void main(String[] args) {
		
		final String str1 = "Java";
		StringBuffer strBuf = new StringBuffer("Course");
		
		UnaryOperator<String> u = (str2) -> str1.concat(str2);
		UnaryOperator<String> a = (str3) -> str3.toLowerCase();
		
		// System.out.println(u.apply(a.apply(strBuf)));

	}

}
