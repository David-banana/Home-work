import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) throws IOException {
        String path = Test04.class.getClassLoader().getResource("day08/emp.txt").getFile();
        Map<String,Emp> map = new HashMap<String,Emp>();
        BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
        String str = null;
        while((str = br.readLine()) != null){
            String[] str1 = str.split(",");
            Emp emp = new Emp();
            emp.name = str1[0];
            emp.age = Integer.parseInt(str1[1]);
            emp.gender = str1[2];
            emp.salary = Integer.parseInt(str1[3]);
            emp.hiredate = Date.valueOf(str1[4]);
            map.put(emp.name,emp);
        }
        Scanner console = new Scanner(System.in);
        String lookname = console.nextLine();
        boolean flag = true;
        for(Map.Entry<String,Emp>entry: map.entrySet())
        {
            if(entry.getKey().equals(lookname)) {
                System.out.println(entry.getValue().toString());
                flag = false;
                break;
            }
        }
        if(flag == true)
            System.out.println("查无此人");
    }
}