import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;


public class HomeWork {
public static void main(String[] args) throws ParseException {
	LinkedList<Object> list =new LinkedList<Object>();
	Scanner console = new Scanner(System.in);
	int empnum = console.nextInt();
	for(int i = 0;i < empnum;i++) {
		Emp emp = new Emp();
		emp.name = console.nextLine();
		emp.age = console.nextInt();
		emp.gender = console.nextLine();
		emp.salary = console.nextLong();
		emp.hiredate = console.nextLine();
		list.add(emp);
	}
	for(int i = 0;i < list.size() - 1;i ++) {
		for(int j = 0;j < list.size() - 1 - i;j ++) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Emp temp1 = (Emp) list.get(j);
		Emp temp2 = (Emp) list.get(j + 1);
		Date date1 = sdf.parse(temp1.hiredate);
		Date date2 = sdf.parse(temp1.hiredate);
		Long time1 = date1.getTime();
		Long time2 = date2.getTime();
		if(time1 > time2) {
			Object temp = list.get(j + 1);
			list.set(j + 1, list.get(j));
			list.set(j, temp);
		}
		}
	}
	System.out.println(list);
}
public static class Emp{
	String name;
	int age;
	String gender;
	long salary;
	String hiredate;
	public void Emp() {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this salary = salary;
		this hiredate = hiredate;
	}
}
}