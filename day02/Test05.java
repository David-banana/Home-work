import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
public class Demo01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String str = temp.toString();
		String REGEX = "[a-zA-Z0-9_]+.jpg";
		if(str.matches(REGEX) != true) {
			System.out.println("文件命名格式错误，请重新输入");
		}else {
			StringBuilder str2 = new StringBuilder(str);
			Date date = new Date();
			long time = date.getTime();
			str2.replace(0, str2.length() - 4,String.valueOf(time));
			System.out.println(str2);
		}
	}
}