import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01 {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		String str = temp.toString();
		String datestr = str.substring(6, 14);
		System.out.println(datestr);
		StringBuilder datestr1 =new StringBuilder(datestr);
		datestr1 = datestr1.insert(4, "-");
		datestr1 = datestr1.insert(7, "-");
		String datestr2 = datestr1.toString();
		System.out.println(datestr1);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = sdf.parse(datestr2);
		long time = date.getTime();
		time = time + 20 * 365l * 24 * 60 * 60 * 1000;
		String birthday = sdf.format(time);
		Date date2 = new Date(time);
		System.out.println("20岁生日日期是" + birthday);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date2);
		cal.set(Calendar.DAY_OF_WEEK,4);
		date = cal.getTime();
		String date1 = sdf.format(date);
		String thatday = date1.toString();
		System.out.println("20岁生日那周星期三是" + thatday);
	}
}