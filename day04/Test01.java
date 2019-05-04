import java.util.LinkedList;

public class DeMO01 {
	public static void main(String[] args) {
		LinkedList<String> c1 = new LinkedList<String>();
		LinkedList<String> c2 = new LinkedList<String>();
		c1.add("one");c1.add("two");c1.add("three");
		c2.add("four");c2.add("five");c2.add("six");
		c1.addAll(c2);
		LinkedList<String> c3 = new LinkedList<String>();
		c3.add("one");c3.add("five");
		System.out.println(c1.containsAll(c3));
		c1.remove("two");
		System.out.println(c1);
	}
}