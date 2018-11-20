package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	public static void main(String[] args) throws IOException {
		String name,adress;
		System.out.println("What is your name?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		System.out.println("Where are you live, " + name + "?");
		adress = br.readLine();
		System.out.println("Name: " + name +";");
		System.out.println("Adress: " + adress + ";");
	}
}
