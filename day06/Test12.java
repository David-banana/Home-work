

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Test12 {
    public static void main(String args[]) throws IOException, ParseException {
        File file = new File(Test12.class.getClassLoader().getResource("day06/emp.dat").getFile());
        RandomAccessFile rf = new RandomAccessFile(file,"rw");
        Map<String,Emp> map = new Hashtable<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String name;
        int age;
        String gender;
        int salary;
        Date hiredate;
        String birthdate;
        byte[] bs = new byte[32];
        int len = -1;
        while((len = rf.read(bs)) != -1){
            name = new String(bs,"UTF-8");
            age = rf.readInt();
            bs = new byte[10];
            rf.read(bs);
            gender = new String(bs,"UTF-8");
            salary = rf.readInt();
            bs = new byte[30];
            rf.read(bs);
            hiredate = sdf.parse(new String(bs,"UTF-8"));
            map.put(name.trim(),new Emp(name,age,gender,salary,hiredate));
            bs = new byte[32];
        }
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
           if(map.containsKey(str) == true){
               System.out.println(map.get(str));
        }
    }
}
