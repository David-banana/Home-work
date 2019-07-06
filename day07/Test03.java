import java.io.*;
import java.util.Scanner;

public class Test03 {
    public static void main(String args[]) throws IOException {
        Scanner console = new Scanner(System.in);
            String empinfor = console.nextLine();
            String[] information = empinfor.split(",");
            String path = Test04.class.getClassLoader().getResource("name.txt").getFile();
            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path),"utf-8"));
            br.write(empinfor);
            br.flush();
            System.out.println("1");

    }
}