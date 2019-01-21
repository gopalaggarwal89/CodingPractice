package info.learn.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapWithValues {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "GOPAL");
		map.put("2", "ABHISHEK");
		map.put("3", "ABHISHEK");
		map.put("4", "ROHIT");
		map.put("5", "SAMEER");
		
		//Converting Entry Set to List
		List<Entry<String,String>> list = new ArrayList<Entry<String,String>>(map.entrySet());
		
		//Sorting list w.r.t values in map
		Collections.sort(list, new Comparator<Entry<String,String>>() {			
			@Override
			public int compare(Entry<String,String> obj1, Entry<String,String> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}		
		});
		
		//Method to create sorted map using LinkedHashMap (It maintains insertion order)
		//Print map
		printMap(getSortedMap(list));
		
	}
	
	private static Map<String,String> getSortedMap(List<Entry<String,String>> list){
		Map<String,String> sortedMap = new LinkedHashMap<String,String>();
		for(Entry<String,String> records : list) {
			sortedMap.put(records.getKey(), records.getValue());
		}
		return sortedMap;
	}
	
	private static void printMap(Map<String,String> map) {
		for(String key : map.keySet()){
			System.out.println(key +" : "+map.get(key));
		}
	}
}
