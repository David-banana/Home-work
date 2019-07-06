import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("note.txt"), "Utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str = null;
    while((str = br.readLine()) != null)
        System.out.println(str);
    }
}