import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class DeMO01 {
	public static void main(String[] args) throws ParseException {
		Scanner console = new Scanner(System.in);
		LinkedList<Long> list = new LinkedList<Long>();
		String str1 = console.nextLine();
		String str2 = console.nextLine();
		String str3 = console.nextLine();
		Date date1 = new Date();
		Date date2 = new Date();
		Date date3 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 date1 = sdf.parse(str1);
		 date2 = sdf.parse(str2);
		 date3 = sdf.parse(str3);
		 long time1 = date1.getTime();
		 long time2 = date2.getTime();
		 long time3 = date3.getTime();
		 list.add(time1);list.add(time2);list.add(time3);
			for(int i = 0; i < list.size()-1; i++) {
				for(int j = 0;j < list.size() - 1 - i;j++) {
					if(list.get(j) >list.get(j+1)) {
						long tmp = list.get(j + 1);
						list.set(j+1, list.get(j));
						list.set(j, tmp);
					}
				}
			}
			for(int i = 0 ; i < list.size(); i++) {
				System.out.println(sdf.format(list.get(i)));
			}
	}	
}