import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Demo01 {
public static void main(String[] args) throws IOException {
	Date date = new Date();
	long datetime = date.getTime();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String temp = br.readLine();
	String str = temp.toString();
	String[] a = str.split("-");
	long time = Integer.parseInt(a[0]) * 365l * 24 * 60 * 60 * 1000 + Integer.parseInt(a[1]) * 7l * 24 * 60 * 60 * 1000 + Integer.parseInt(a[2]) * 60l * 60 * 1000;
	datetime = (date.getTime() - time);
	long n = datetime/(7l * 24 * 60 * 60 * 1000);
	System.out.println(n);
}
}