import java.io.*;
import java.util.Scanner;

public class Test02 {
	public static void main(String args[]){
	    File file = new File("note.txt");
	    Scanner console = new Scanner(System.in);
	    String str = console.nextLine();
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file,true),"GBK"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pw.println(str);
		pw.flush();
    }
}