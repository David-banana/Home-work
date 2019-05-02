public class Test04 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("123abc456def789ghi");
		str.replace(3, 6, "char");
		str.replace(10, 13, "char");
		str.replace(17, 21, "char");
		System.out.println(str);
	}
}