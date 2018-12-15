package homeworkl6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many birds we have?");
		int birdsnum = 0;
		try {
			birdsnum = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Bird[] birds = new Bird[birdsnum];
		System.out.println("How many Chicken we have");
		int chicken = 0;
		try {
			chicken = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How many Eagle we have");
		int eagle = 0;
		try {
			eagle = Integer.parseInt(br.readLine()) + chicken;
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How many Penguin we have");
		int penguin = 0;
		try {
			penguin = Integer.parseInt(br.readLine()) + eagle;
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < birds.length; i++) {
			if (i < chicken) {
				birds[i] = new Chicken();
			} else if (i >= chicken && i < eagle) {
				birds[i] = new Eagle();
			} else if (i >= eagle && i < penguin) {
				birds[i] = new Penguin();
			} else {
				birds[i] = new Swallow();
			}
			birds[i].fly();
			System.out.println(birds[i].toString());
		}
	}

}
