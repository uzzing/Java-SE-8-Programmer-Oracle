import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Path4 {
	public static void main(String[] args) throws Exception {
		Path source = Paths.get("./sports/info1.txt");
		Path target = Paths.get("./sports/cricket/players.txt");
		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
//		Files.delete(source);
		
	}
}
