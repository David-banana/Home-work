package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        boolean flag = true;
        String str1 = null;
        while(true) {
            Scanner console = new Scanner(System.in);
            String[] str = console.nextLine().split(",");
            if ((str[0].length() < 1 || str[0].length() > 20) && str[0].matches("[a-zA-Z]+") == false) {
                System.out.println("输入有误,请重新输入");
                flag = false;
            }
            if (Integer.valueOf(str[1]) > 100 || Integer.valueOf(str[1]) < 0) {
                System.out.println("输入有误,请重新输入");
                flag = false;
            }
            if (str[2].equals("男") && str[2].equals("女")) {
                System.out.println("输入有误,请重新输入");
                flag = false;
            }
            if(flag == true){
                str1 = console.nextLine();
                break;
            }
        }
        String path = Test01.class.getClassLoader().getResource("day08/emp.dat").getFile();
        try {
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("emp.dat")));
            pw.write(str1);
            System.out.println("成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
