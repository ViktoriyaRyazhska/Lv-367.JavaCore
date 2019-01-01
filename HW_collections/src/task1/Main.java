package task1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Set<String> testSet1 = new HashSet<>();
		Set<String> testSet2 = new HashSet<>();
		
		testSet1.add("Alina");
		testSet1.add("Arthur");
		testSet1.add("Andy");
		
		testSet2.add("Alina");
		testSet2.add("Andrii");
		testSet2.add("Andy");
		
		union(testSet1,testSet2);
		
		intersect(testSet1,testSet2);
		
	}

	public static void printSet(Set<String> set) {
		for(String entry : set) {
			System.out.println(entry);
		}
		System.out.println();
	}
	
	public static void union(Set<String> set1, Set<String> set2) {
		set1.addAll(set2);
		printSet(set1);
		
	}
	
	public static void intersect(Set<String> set1, Set<String> set2) {
		set1.retainAll(set2);
		printSet(set1);
	}
	
	/* ??
	public <String> void unionParameterized(Set<String> set1, Set<String> set2) {
		set1.addAll(set2);
	}
	*/
	
}
