import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String str = temp.toString();
		String[] str1 = str.split("\\+");
		int a = Integer.parseInt(str1[0]);
		int b = Integer.parseInt(str1[1]);
		int answer = a + b;
		System.out.println(a + "+" + b + "=" + answer);
	}
}
