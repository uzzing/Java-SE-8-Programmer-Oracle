import java.nio.file.Path;
import java.nio.file.Paths;

public class Path2 {
	public static void main(String[] args) {
		Path p1 = Paths.get("/Pics/MyPic.jpeg");
		System.out.print(p1.getNameCount()+ ":" 
		+ p1.getName(0) + ":" 
		+ p1.getFileName());
	}
}
