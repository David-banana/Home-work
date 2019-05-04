import java.util.LinkedList;

public class DeMO01 {
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);
	list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
	Object[] a = list.toArray();
	for(int i = 0;i <a.length; i++) {
		System.out.println(a[i]);
	}
}
}