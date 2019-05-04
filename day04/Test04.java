import java.util.LinkedList;

public class DeMO01 {
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);
	list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
	LinkedList<Integer> list1 = new LinkedList<Integer>();
	list1.addAll(list.subList(3, 7));
	for(int i = 0;i < list1.size();i++) {
		list1.set(i,list1.get(i) * 10);
	}
	System.out.println(list1);
	LinkedList<Integer> list2 = new LinkedList<Integer>();
	list2.addAll(list.subList(7, 10));
	list.removeAll(list2);
	System.out.println(list);
}
}