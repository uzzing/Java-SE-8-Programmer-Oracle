import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File {

	public static void main(String[] args) throws IOException {
		
		Path file = Paths.get("./sports/info.txt");
		Stream<String> fc = Files.lines(file);
		fc.forEach(s -> System.out.println(s));
		

	}

}
