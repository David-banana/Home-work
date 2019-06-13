

import java.io.*;
import java.util.Scanner;


public class Test09 {
    public static void main(String[] args) {
        File file = new File("note.txt");
        PrintWriter pw = null;
        {
            try {
                pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("note.txt"), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                System.out.println("不支持的编码方式");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        Scanner console = new Scanner(System.in);
        String str = null;
        while((str = console.nextLine()) != null){
            if(str.equals("exit")){
                break;
            }
            pw.println(str);
            pw.flush();
        }
        pw.close();
        console.close();
    }
}
