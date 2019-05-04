import java.util.LinkedList;
public class Demo01 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < 10; i ++) {
			int j = (int) (Math.random() * 100 + 1);
			list.add(j);
		}
		System.out.println("原链表");
		System.out.println(list);
		for(int i = 0; i < list.size()-1;i ++) {
			 int minindex = i;
			for(int j = i + 1; j < list.size(); j ++) {
				if((list.get(j)) < (list.get(minindex))) {
					minindex = j;
				}
			}
			int tmp = list.get(i);
			list.set(i,list.get(minindex));
			list.set(minindex,tmp);
		}
		System.out.println("选择排序后的单链表");
		System.out.println(list);
	}
}