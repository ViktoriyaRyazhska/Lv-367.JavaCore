package homeworkl6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many birds we have?");
		int birdsnum = Integer.parseInt(br.readLine());
		Bird[] birds = new Bird[birdsnum];
		System.out.println("How many Chicken we have");
		int chicken = Integer.parseInt(br.readLine());
		System.out.println("How many Eagle we have");
		int eagle = Integer.parseInt(br.readLine()) + chicken;
		System.out.println("How many Penguin we have");
		int penguin = Integer.parseInt(br.readLine()) + eagle;

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
