import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String str = temp.toString();
		String REGEX = "\\d{3,4}\\-\\d{7,8}";
		if(str.matches(REGEX) == true) {
			System.out.println("输入格式正确");
		}else {
			System.out.println("输入格式错误");
		}
	}
}