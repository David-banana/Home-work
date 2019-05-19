import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Demo01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);queue.add(2);queue.add(3);queue.add(4);queue.add(5);
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}