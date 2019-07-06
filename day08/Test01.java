import java.io.*;

public class Test01 {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("myfile");
        FileOutputStream fos = new FileOutputStream("myfile");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bs =new byte[1024];
        int len = -1;
        while(true){
            try {
                if (!((len = bis.read(bs)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                bis.close();
            }
            try {
                bos.write(bs,0,len);
            } catch (IOException e) {
                e.printStackTrace();
            }bos.close();
        }
    