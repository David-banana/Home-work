import java.util.LinkedList;

public class DeMO01 {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("one");list.add("two");list.add("three");list.add("four");
	String a = list.get(1);
	System.out.println(a);
	list.set(2, "3");
	list.add(1, "2");
	list.remove(2);
	System.out.println(list);
}
}
