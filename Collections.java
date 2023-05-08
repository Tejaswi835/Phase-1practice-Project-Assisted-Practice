package implicit;

import java.util.*;

public class Collections {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("c");
		arrayList.add("python");
		arrayList.add("java");
		System.out.println("ArrayList: " + arrayList);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(23);
		linkedList.add(02);
		linkedList.add(33);
		System.out.println("LinkedList: " + linkedList);
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("violet");
		hashSet.add("Black");
		hashSet.add("Blue");
		System.out.println("HashSet: " + hashSet);
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		System.out.println("HashMap: " + hashMap);
	}
}
