import java.nio.file.Path;
import java.nio.file.Paths;

public class Path3 {
	
	public static void main(String[] args) {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log"); 
		Path n = path1.normalize();
		System.out.println(res1); // /app/./sys/log
		System.out.println(n);
		
		Path path2 = Paths.get("/server/exe/");
		Path res2 = path1.resolve("/readme/"); // = /readme
		System.out.println(res2); // /readme
	}
}
