

import java.io.*;
import java.util.Scanner;


public class Test07 {
	public static void main(String[] args) throws IOException {
	Scanner console = new Scanner(System.in);
	String name = console.nextLine();
	String path = Test04.class.getClassLoader().getResource("name").getFile();
	File file = new File(path);
	copy1(name);
	copy2(name);
	}

	public static void copy1(String name) throws IOException {
		FileInputStream fis = new FileInputStream(name);
		String lastname = name.substring(name.length()-4,name.length());
		name = name.substring(0,name.length()-4);
		FileOutputStream fos = new FileOutputStream(name + "_copy" + lastname);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = -1;
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		bis.close();
		bos.close();
	}

	public static void copy2(String name) throws IOException {
		FileInputStream fis = new FileInputStream(name);
		String lastname = name.substring(name.length()-4,name.length());
		name = name.substring(0,name.length()-4);
		FileOutputStream fos = new FileOutputStream(name + "_copy" + lastname);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] bs = new byte[1024];
		int len = -1;
		while((len = bis.read(bs)) != -1){
			bos.write(bs,0,len);
		}
		bis.close();
		bos.close();
	}
}
