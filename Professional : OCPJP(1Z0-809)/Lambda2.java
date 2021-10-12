import java.util.Arrays;

class CheckClass {
	public static int checkValue(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class Lambda2 {

	public static void main(String[] args) {
		String[] str = { "Cat", "Lion", "Rat", "Tiger" };
		Arrays.sort(str, CheckClass::checkValue);
		for (String s : str) {
			System.out.print(s + " ");
		}

	}

}
