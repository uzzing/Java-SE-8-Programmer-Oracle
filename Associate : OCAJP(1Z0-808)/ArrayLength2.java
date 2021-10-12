
public class ArrayLength2 {
	public static void main(String[] args) {
		int num1[] = new int[5];
		int num2[] = {1,2,3};
		
		num1 = num2;
		
		for (int i : num1) System.out.println(i);
		
		String str1[] = new String[3];
		String str2[] = {"1", "2"};
		
		str1 = str2;
		
		for (String i : str1) System.out.println(i);
	}

}
