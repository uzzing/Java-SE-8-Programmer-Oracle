import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> unsortMap = new HashMap<>();
		unsortMap.put(10, "z");
		unsortMap.put(5, "b");
		unsortMap.put(1, "d");
		unsortMap.put(7, "e");
		unsortMap.put(50, "j");

		Map<Integer, String> treeMap = new TreeMap<>((s1, s2) -> s2.compareTo(s1));
		treeMap.putAll(unsortMap);
		
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getValue() + " ");
		}
		
//		new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2.compareTo(o1);
//			}
//		}
	}

}
