mport java.io.*;


public class Test02 {
    public static void main(String[] args) throws IOException {
       FileInputStream fis = new FileInputStream("myfile.txt");
       FileOutputStream fos = new FileOutputStream("myfile_cp2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bs = new byte[1024];
        int len = -1;
        while((len = bis.read(bs)) != -1){
            fos.write(bs,0,len);
        }
        bis.close();
        bos.close();
    }
}