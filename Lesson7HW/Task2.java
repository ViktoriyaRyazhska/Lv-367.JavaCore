package homeworkl7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {

		Map personMap = new HashMap<String, String>();
		personMap.put("Zarichnyi", "Oleh");
		personMap.put("Zarichnyi", "Roman");
		personMap.put("Petrenko", "Oleh");
		personMap.put("Panasenko", "Orest");
		personMap.put("Farhan", "Petro");
		personMap.put("Mudriy", "Maryan");
		personMap.put("Pytel", "Andriy");
		personMap.put("Puskiv", "Vova");
		personMap.put("Antonov", "Vova");
		personMap.put("Kunch", "Yaroslav");

		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) i.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		String name = "Orest";
		String index = null;
		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) i.next();
			if (entry.getValue().equals(name)) {
				index = entry.getKey();
			}

		}
		personMap.remove(index);
		System.out.println();
		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) i.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}

}
