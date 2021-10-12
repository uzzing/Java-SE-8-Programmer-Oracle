import java.util.function.ToIntFunction;

public class ToIntFunction1 {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		ToIntFunction<String> indexVal = str::indexOf;
		int x = indexVal.applyAsInt("is");
		
		System.out.println(x);

	}

}
