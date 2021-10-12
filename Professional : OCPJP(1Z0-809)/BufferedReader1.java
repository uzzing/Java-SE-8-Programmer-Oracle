import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("Enter GDP: ");
		int GDP = Integer.parseInt(br1.readLine());
		
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {
			br.lines().forEach(c -> System.out.println(c));
			brCopy = br;
		} 
		
		//byCopy.ready();
	}

}
