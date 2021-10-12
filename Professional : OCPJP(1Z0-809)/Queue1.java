import java.util.ArrayDeque;
import java.util.Deque;

public class Queue1 {

	public static void main(String[] args) {
		
		Deque<String> queue = new ArrayDeque<>();
		queue.add("Susan");
		System.out.println(queue);
		queue.add("Allen");
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.push("David");
		System.out.println(queue);
		
		System.out.println(queue.pop());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
	}
}
