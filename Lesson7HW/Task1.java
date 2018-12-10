package homeworkl7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

	static Set union(Set set1, Set set2) {
		Set toSet = new HashSet();
		toSet.addAll(set1);
		toSet.addAll(set2);
		return toSet;
	}

	static boolean intersect(Set set1, Set set2) {
		return set1.contains(set2);
	}

	public static void main(String[] args) {

		Set set1 = new HashSet<Integer>();
		Set set2 = new HashSet<Integer>();
		Random rand = new Random();
		for (int i = 1; i < 5; i++) {
			set1.add(rand.nextInt(i));
		}
		for (int i = 1; i < 10; i++) {
			set2.add(rand.nextInt(i));
		}
		System.out.println("Set 1 = " + set1);

		System.out.println("Set 2 = " + set2);

		Set unionSet = new HashSet();
		unionSet.addAll(union(set1, set2));

		System.out.println("Set 1 + Set 2 = " + unionSet);

		System.out.println("Intersect of sets is " + intersect(set1, set2));

	}

}
