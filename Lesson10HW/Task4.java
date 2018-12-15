package homeworkl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		String fileName = "file1.txt", fileName2 = "file2.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
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
		try {
			bw.write("Count = " + count +"\n");
			
		} catch (IOException e) {

			e.printStackTrace();
		}

		int max = text.get(0).length();

		for (int i = 1; i < text.size(); i++) {
			if (text.get(i).length() > max) {

				max = text.get(i).length();
				count = i;

			}

		}
		try {
			bw.write(text.get(count) + "\n");
			bw.write("\n Name - Oleh Zarichnyi \n Date of Birth - 14 February 1996");
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
