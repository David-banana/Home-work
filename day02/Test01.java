/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		match(str);
	}
	public static void match(String str) {
		//-?\d+
		String REGEX = "^-?\\d+$";
		//(-?\d+)(\.\d+)?
		String REGEX1 = "^(-?\\d+)(\\.\\d+)?$";
		if(str.matches(REGEX) == true) {
			int num = Integer.parseInt(str);
			System.out.println(num / 10); 
	}else if(str.matches(REGEX1) == true) {
		float num1 = Float.parseFloat(str);
		System.out.println(num1/5); 
		}else {
			System.out.println("不是数字");
		}
	}
	
	
}
