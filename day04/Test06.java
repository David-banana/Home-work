import java.util.LinkedList;

public class DeMO01 {
public static void main(String[] args) {
	String[] a = {"one","two","three"};
	LinkedList<String> list = new LinkedList<String>();
	for(int i = 0;i < a.length; i++) {
		list.add(a[i]);
	}
	System.out.println(list);
}
}