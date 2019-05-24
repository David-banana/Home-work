import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine().trim();
        File file = new File("test.txt");
        boolean flag = file.exists();
        if(!flag){
            file.mkdir();
        }else {
            int index = 0;
            while (flag) {
                index++;
                file = new File("test_副本" + index + ".txt");
                flag = file.exists();
            }
            file.mkdir();
        }
        System.out.println("文件夹名" + file.getName());
    }
}