
import java.util.Iterator;
import java.util.LinkedList;

public class DeMO01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");list.add("$");list.add("2");list.add("$");list.add("3");list.add("$");list.add("4");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a);
			if(a.equals("$")) {
				it.remove();
			}
		}
		while(it.hasNext()) {
			String b = it.next();
			System.out.println(b);
		}
	}
}