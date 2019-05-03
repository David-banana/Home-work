import java.util.Date;

public class Demo01 {
public static void main(String[] args) {
	Date date = new Date();
	long time = date.getTime();
	System.out.println("当前时间是：" + time);
	time = time + 3l * 24 * 60 * 60 * 1000;
	System.out.println("三天后的时间是：" + time);
}
}