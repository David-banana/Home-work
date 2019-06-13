import java.io.File;
import java.util.LinkedList;


public class Test06 {
    public static void main(String[] args) {
        String path = Test01.class.getClassLoader().getResource("day06").getFile();
        System.out.println(path);
        File file = new File(path + "test.txt");
        LinkedList<String> filename = new LinkedList<String>();
        File[] fs = file.listFiles();
        for(int i = 0; i < fs.length; i++){
            if(fs[i].isFile()){
                filename.add(fs[i].getName());
            }
        }
        System.out.println(filename);
    }
}
