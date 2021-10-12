import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Files2 {

	public static void main(String[] args) {
		
		List<String> fc;
		try {
			Path file = Paths.get("./sports/info.txt");
			fc = Files.readAllLines(file);
			System.out.print(Files.list(file));
			fc.stream().forEach(s -> System.out.println(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
