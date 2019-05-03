import java.util.LinkedList;
import java.util.Scanner;

public class Test08 {
	public  static class employ {
		LinkedList<String> information = new LinkedList<String>();
		String name;
		int age;
		String gender;
		int salary;
		
		public employ() {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
			information.add(this.name);
			information.add(String.valueOf(this.age));
			information.add(this.gender);
			information.add(String.valueOf(this.salary));
		}
	}
		public static void main(String[] args) {
			
			LinkedList<Object> list = new LinkedList<Object>();
			for(int i = 0;i < 10;i++) {
				employ emp = new employ();
				Scanner console = new Scanner(System.in);
				emp.name = console.nextLine();
				emp.age = console.nextInt();
				emp.gender = console.nextLine();
				emp.salary = console.nextInt();
				list.add(emp);
			}
			System.out.println(list);
		}	
}
