import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork {
public static void main(String[] args) {
	Map<String,Integer> grade = new HashMap<String, Integer>();
	grade.put("语文", 99);
	grade.put("数学", 98);
	grade.put("英语", 97);
	grade.put("物理", 96);
	grade.put("化学", 95);
	grade.get("物理");
	grade.replace("化学", 96);
	grade.remove("英语");
	Set<Entry<String,Integer>> gradeentry = grade.entrySet();
	for(Entry<String,Integer>entry : gradeentry) {
		System.out.print(entry.getKey() + "=" + entry.getValue());
	}
}
}