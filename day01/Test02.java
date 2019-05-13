package day03;

public class Demo01{
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("大家好！");
		str.append("我是程序员！");
		System.out.println(str.toString());
		str.insert(6, "优秀的");
		System.out.println(str.toString());
		str.replace(6, 9, "牛牛的");
		System.out.println(str.toString());
		str.delete(0, 4);
		System.out.println(str.toString());
	}
}
