import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Files1 {

	public static void main(String[] args) {
		int maxDepth = 2;
		try {
			Stream<Path> paths = Files.find(Paths.get("./sports"), maxDepth, 
					(path, attr) -> path.getFileName().toString().endsWith("txt"), 
					FileVisitOption.FOLLOW_LINKS);
			
			
			System.out.print(paths.collect(Collectors.toList()));
			Long fCount = paths.count();
			System.out.print(fCount);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				

	}

}
