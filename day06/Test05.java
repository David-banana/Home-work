import java.io.File;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String filename = console.nextLine();
        File file = new File("C:\\Users\\cdw\\Desktop\\1" + File.separator + filename);
        System.out.println("C:\\Users\\cdw\\Desktop\\1" + File.separator + filename);
        filedelet(file);
    }
    public static void filedelet(File file){
        if(file.isFile() || file.length() == 0){
        file.delete();
        }if(file.isDirectory()){
            System.out.println("1");
            File[] fs = file.listFiles();
            for(File f2 : fs){
                if(f2.isFile()){
                    f2.delete();
                }else{
                    filedelet(f2);
                }
            }
            file.delete();
        }
    }
    }