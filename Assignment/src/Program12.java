import java.util.*;

public class Program12 {

	public static void main(String[] args) {
	    Map<Integer, String> map = new HashMap<>();
        map.put(12, "ab");
        map.put(23, "bc");
        map.put(34, "cd");
        map.put(45, "de");
        map.put(56, "ef");

        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);

	}

}
