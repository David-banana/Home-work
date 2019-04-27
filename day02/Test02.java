/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("123,456,789,012");
		String str1 = str.toString();
		String[] str2 = str1.split(",");
		System.out.println(Arrays.toString(str2));
	}
}
