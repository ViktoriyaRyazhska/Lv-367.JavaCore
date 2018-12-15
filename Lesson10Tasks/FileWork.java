package lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWork {

	public static void main(String[] args) {
		String fileName = "mytext.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		BufferedReader br = new BufferedReader(fr);
		List<String> text = new ArrayList<String>();
		String read = null;

		try {
			while ((read = br.readLine()) != null) {
				text.add(read);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		int count = text.size();
		System.out.println("We have " + count + " lines");

		for (int i = 0; i < text.size(); i++) {
			count = i + 1;
			read = text.get(i);
			System.out.println(count + " line has " + read.length() + " symbols;");

		}
		int min = text.get(0).length();
		int max = text.get(0).length();
		int count2 = 0;
		for (int i = 1; i < text.size(); i++) {
			if (text.get(i).length() > max) {

				max = text.get(i).length();
				count = i + 1;

			}
			if (text.get(i).length() < min) {

				min = text.get(i).length();
				count2 = i + 1;

			}

		}
		System.out.println(count + " row is biggest with length " + max);
		System.out.println(count2 + " row is smallest with length " + min);
		String var = "виб";
		int n;
		for (int i = 0; i < text.size(); i++) {
			n = text.get(i).indexOf(var);
			if (n >= 0) {
				count = i+1;
				System.out.println(count + " Row has " + var);
				System.out.println(text.get(i));
			}
		}
	}

}
