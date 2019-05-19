import java.util.Iterator;
import java.util.Stack;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);stack.add(2);stack.add(3);stack.add(4);stack.add(5);
		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}