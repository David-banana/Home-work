import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */

public class Test03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str1 = str.toString();
		String[] str2 = str1.split("\\.");
		for(int i = 0;i < str2.length;i ++) {
			System.out.println(str2[i]);
		}
		}
}