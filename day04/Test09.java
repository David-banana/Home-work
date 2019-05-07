import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo02 {
public static void main(String[] args) throws ParseException {
	LinkedList<Object> list = new LinkedList<Object>();
	for(int i = 0;i < 2;i++) {
	Emp emp = new Emp();
	Scanner console = new Scanner(System.in);
	emp.name = console.nextLine();
	emp.age = console.nextInt();
	emp.gender = console.nextLine();
	emp.salary = console.nextInt();
	emp.hiredate = console.nextLine();
	String date1 = emp.hiredate;
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	date = sdf.parse(date1);
	long time = date.getTime();
	time = time + 91l* 60 * 60 * 1000;
	date.setTime(time);
	emp.date = date.toString();
	list.add(emp);
	}
	for(int i = 0;i < list.size();i++) {
		System.out.println(list.get(i).toString());
		Object temp = list.get(i);
	}
}
public static class Emp {
	String name;
	int age;
	String gender;
	int salary;
	String hiredate;
	String date;
	public Emp() {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
		this.date = date;
	}
}
}
