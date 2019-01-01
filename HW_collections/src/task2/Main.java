package task2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> personMap = new HashMap<>();
		
		personMap.put("Olenko","Anna");
		personMap.put("Kondratenko","Alina");
		personMap.put("Rivaldo","Andrey");
		personMap.put("Maxine","Artem");
		personMap.put("Peterson","Andy");
		personMap.put("Malkolm","Anna");
		personMap.put("Estered","Max");
		personMap.put("Okimenko","Peter");
		personMap.put("Opanasenko","Oleg");
		personMap.put("Big","Boss");
		
		
		printMap(personMap);
		
		Set<String> testSet = new HashSet<>();
		testSet.addAll(personMap.values());
		
		System.out.println();
		System.out.println("Are there at least two persons with the same \"firstName\" among these 10 people?");
		if (testSet.size() != personMap.size()) {
			System.out.println("Yes!");
		}
		else {
			System.out.println("No!");
		}
		
		
		for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
								
			if (entry1.getValue() == "Max" ) {
				personMap.remove(entry1.getKey()); 
			}
	
		}
	
		printMap(personMap);
		
	}

	public static void printMap (Map<String,String> mapName) {
		
		for (Map.Entry<String,String> entry : mapName.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
	
}
