import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo01 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine().toString();
	int a = str.indexOf("@");
	String str1 = str.substring(0,a);
	System.out.println(str1);
	}
}