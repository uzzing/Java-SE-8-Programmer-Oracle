

class Canvas implements Drawable {
	public void draw() {}
}

abstract class Board extends Canvas {}

class Paper extends Canvas {
	protected void draw(int color) {}
}


class Frame extends Canvas implements Drawable {
	public void resize() {}
	abstract void open();
}

interface Drawable {
	public abstract void draw();
}



public class Extends2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
