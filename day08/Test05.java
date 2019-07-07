import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Test05 {
    public static void main(String args[]) throws IOException, ParseException {
        File file = new File(Test01.class.getClassLoader().getResource("day08/emp.dat").getFile());
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile(file,"rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            rf.close();
        }
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