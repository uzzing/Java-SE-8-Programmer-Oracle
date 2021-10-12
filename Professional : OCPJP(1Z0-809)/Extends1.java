import java.io.IOException;

class Video {
	public void play() throws IOException {
		System.out.println("Video played");
	}
}

class Game extends Video {
	public void play() throws IOException {
		super.play();
		System.out.print("Game played");
	}
}

public class Extends1 {

	public static void main(String[] args) {
		

		try {
			new Game().play();
		} catch (Exception e) {
			System.out.print(e.getClass());
		}

	}

}
