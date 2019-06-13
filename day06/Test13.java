import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

public class Test13 {
	public static void main(String[] args) throws IOException, ParseException {
		File file = new File(Test13.class.getClassLoader().getResource("day06/emp.dat").getFile());
		RandomAccessFile rf = new RandomAccessFile(file,"rw");
		LinkedList<Emp> list = new LinkedList<Emp>();
		byte[] bs = new byte[32];
		int len = -1;
		String name;
		int age;
		String gender;
		int salary;
		Date hiredate;
		while((len = rf.read(bs)) != -1){
			name = new String(bs,"UTF-8");
			age = rf.readInt();
			bs = new byte[10];
			rf.read(bs);
			gender = new String(bs,"UTF-8");
			salary = rf.readInt();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			bs = new byte[30];
			rf.read(bs);
			hiredate = sdf.parse(new String(bs,"UTF-8"));
			list.add(new Emp(name,age,gender,salary,hiredate));
			bs = new byte[32];
		}
		Collections.sort(list, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.age-o2.age;
			}
		});
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
