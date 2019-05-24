import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine().trim();
        File file = new File("test.txt");
        boolean flag = file.exists();
        if(!flag){
            file.createNewFile();
        }else {
            int index = 0;
            while (flag) {
                index++;
                file = new File("test_副本" + index + ".txt");
                flag = file.exists();
            }
            file.createNewFile();
        }
    System.out.println("文件名" + file.getName());
    }
}