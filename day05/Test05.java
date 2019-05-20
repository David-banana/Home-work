import java.util.HashMap;
import java.util.Map;

public class HomeWork {
	public static void main(String[] args) {
		int num1 = 0;int num2 = 0;int num3 = 0;int num4 = 0;int num5 = 0;
		String str = ("销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice");
		String[] str1 = str.split(";");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < str1.length; i ++) {
			if(str1[i].startsWith("销售"))
				num1++;
			if(str1[i].startsWith("美工"))
				num2++;
			if(str1[i].startsWith("前端"))
				num3++;
			if(str1[i].startsWith("程序"))
				num4++;
			if(str1[i].startsWith("财务"))
				num5++;
		}
		map.put("销售", num1);	map.put("美工", num2);	map.put("前端", num3);	map.put("程序", num4);	map.put("财务", num5);
		System.out.println(map);
	}
}