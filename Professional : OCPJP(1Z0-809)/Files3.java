import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Files3 {

	public static void main(String[] args) {
		try {
			Stream<Path> files = Files.walk(Paths.get("./sports"));
			
			files.forEach(fName -> {
				
					try {
						Path aPath = fName.toAbsolutePath();
						System.out.println(fName + " : " 
						+ Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
					} 
					catch (IOException e) {
						e.printStackTrace();
					}
			});

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
