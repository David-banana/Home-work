import java.io.File;

public class HomeWork {
	public static void main(String[] args) {
		String path = IODemo01.class.getClassLoader().getResource("day11/myfile.txt").getFile();
		File file = new File("path");
		System.out.println(file.getName());
		System.out.println(file.lastModified());
	}
}