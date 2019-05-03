import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Demo01 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String str = temp.toString();
		Scanner console = new Scanner(System.in);
		int day = console.nextInt(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		long time = date.getTime();
		time = time + day * 24l * 60 * 60 * 1000 - 10l * 24 * 60 * 60 * 1000;
		date.setTime(time);
		String str1 = sdf.format(date);
		System.out.println(str1);
	}
}