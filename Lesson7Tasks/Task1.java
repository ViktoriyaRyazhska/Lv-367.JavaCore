package lesson7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Task1 {
	static class intComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}

	}

	
	public static void main(String[] args) {

		List<Integer> myCollection = new ArrayList<Integer>(10);
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			myCollection.add(rand.nextInt(50));

		}

		List<Integer> newCollection = new ArrayList<Integer>();

		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(i);

			}

		}
		for (int i = 0; i < newCollection.size(); i++) {
			System.out.println(i + " element of newCollection = " + newCollection.get(i));
		}

		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {

			}
		}
		System.out.println();

		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("Position " + i + " Value " + myCollection.get(i));
		}
		System.out.println();
		intComparator comp = new intComparator();
		myCollection.sort(comp);
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("Position " + i + " Value " + myCollection.get(i));
		}
	}
	



}
