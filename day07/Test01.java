import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myfile.txt");
        FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
        byte[] bs =new byte[100];
        int len = -1;
        while((len = fis.read(bs)) != -1){
            fos.write(bs,0,len);
        }
        fis.close();
        fos.close();
    }
}