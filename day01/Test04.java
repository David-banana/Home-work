import java.util.Random;
import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		String str = "";
		Random r = new Random();
		for(int i = 0;i < 5;i++) {
			int temp = r.nextInt(52);
			char c = (char) (temp < 26 ? temp + 97 : (temp % 26) + 65);
			str += c;
		}
		Scanner console = new Scanner(System.in);
		String str1 = console.nextLine();
		if(str1.toLowerCase() == str.toLowerCase()) {
			System.out.println("验证码有效");
		}
	}	
}