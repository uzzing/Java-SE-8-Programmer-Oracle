import java.nio.file.Path;
import java.nio.file.Paths;

public class Path1 {
	public static void main(String[] args) {
		
		Path path1 = Paths.get("/software/././sys/readme.txt");
		Path path2 = path1.normalize();
		System.out.println(path2); // /software/sys/readme.txt
		
		Path path3 = path2.relativize(path1);
		System.out.println(path3); // ../../././sys/readme.txt
	}
}
