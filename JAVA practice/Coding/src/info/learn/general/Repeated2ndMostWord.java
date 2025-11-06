package info.learn.general;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Repeated2ndMostWord {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		Java
//		My Name is Java
//		how are you
//		Ram
//		Java
//		Java
//		Ram
		File file = new File("C:\\Users\\gkaggarw\\Desktop\\Temp.txt");
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			int count = 0;
			while (scanner.hasNext()) {
				String key = scanner.nextLine();
				if (map.containsKey(key)) {
					count++;
				} else {
					count = 1;
				}
				map.put(key, count);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

		// Converting Entry Set to List
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());

		// Sorting list w.r.t values in map
		Collections.sort(list, Collections.reverseOrder(new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		}));

		System.out.println(list);
		System.out.println(list.get(1).getValue() + " : " + list.get(1).getKey());
	}

}
