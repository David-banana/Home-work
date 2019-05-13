package day03;

public class Demo01 {
	public static void main(String[] args) {
		boolean flag = true;
		String str = "上海自来水来自海上";
		check(str,flag);
		System.out.println(flag);
	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
	public static boolean check(String str,boolean flag){
		if(str.length() % 2 == 0) {
		for(int i = 0;i < str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i));
			{
				flag = false;
			}
		}
		}else {
			for(int i = 0;i < (str.length() - 1)/2 ;i++) {
				if(str.charAt(i) != str.charAt(str.length() - 1 - i));
				{
					flag = false;
				}
			}
		}
		return flag;
	}
}