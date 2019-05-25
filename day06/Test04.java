
import java.io.File;

public class Test04 {
    public static void main(String[] args) {
    String path = Test01.class.getClassLoader().getResource("day06").getFile();
    File file = new File(path);
    File[] fs = file.listFiles();
    filenameget(fs);
    }
    public static void filenameget(File[] fs){

        for(int i = 0;i < fs.length;i++){
            if(fs[i].isFile()){
                System.out.println(fs[i].getName());
            }if(fs[i].isDirectory()){
               System.out.println(fs[i].getName() + "目录");
            }
        }
    }
}