import java.io.*;


public class Test08 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("raf.txt");
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("raf.txt"),"utf-8"));
        pw.println(Integer.MAX_VALUE);
        pw.println(String.valueOf(Long.MAX_VALUE));
        pw.flush();
        pw.close();
    }
}
