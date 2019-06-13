


import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Test10 {
    public static void main(String[] args) throws Exception {
        ArrayList<Object> list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        for(int i = 0;i < 5; i ++) {
            String str = console.nextLine();
            String[] infor = str.split(",");
            Emp emp = new Emp();
            emp.name = infor[0];
            emp.age = Integer.valueOf(infor[1]);
            emp.gender = infor[2];
            emp.salary = Integer.valueOf(infor[3]);
            emp.hiredate = Date.valueOf(infor[4]);
            list.add(emp);
            String str1 = emp.toString();
            FileOutputStream fos = new FileOutputStream(emp.name+".txt");
            fos.write(str1.getBytes());
            fos.flush();
        }
    }
}
