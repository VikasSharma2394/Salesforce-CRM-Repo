package PracticeTestNG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("A", 34);
	map.put("B", 334);
	map.put("C", 847);
	System.out.println(map);
	int value = map.remove("B");
	System.out.println(value);
	System.out.println(map.containsValue(34));
	System.out.println(map.replace("C", 847, 2334));
	System.out.println(map);
	System.out.println(map.entrySet());
	TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
	tree.put(1, "One");
	tree.put(2, "Two");
	tree.put(5, "Five");
	tree.put(4, "Four");
	System.out.println(tree.get(2));
	for(Map.Entry<Integer, String>entry:tree.entrySet()) {
		System.out.println("*******Iteration******* "+entry.getKey()+"="+entry.getValue());
	}
	System.out.println(tree);
	System.out.println(tree.keySet());
	System.out.println(tree.values());
	System.out.println(tree.size());
	System.out.println(tree.replace(3, "Two","TwoTwo"));
	System.out.println(tree.replace(2, "TwoTwo"));
	System.out.println(tree.entrySet());
	System.out.println(tree.pollFirstEntry());
	System.out.println(tree.pollLastEntry());
	ArrayList<String> list = new ArrayList<String>();
	list.add("Test");
	list.add("12");
	for(int i=0; i<list.size(); i++) {
		System.out.println("Array List Iteration "+ list.get(i));
		
	}
	for(String s:list) {
		System.out.println(s);
	}
	System.out.println(list);
	System.out.println(list.get(1));
	
}
}
