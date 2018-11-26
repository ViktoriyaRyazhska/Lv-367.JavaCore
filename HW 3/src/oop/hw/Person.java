package oop.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int birthYear;
	
	public Person() {
		
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int ageCounter() {
		return 2018 - birthYear;
	}	
	
	public void inputPersonsInformation(String name, int birthYear) throws IOException {

		this.name = name;
		this.birthYear = birthYear;
	
	}
	
	public void outputPersonsInformation() {
		System.out.println("The person's name is " + name);
		System.out.println("The person's age is " + birthYear);
	
	}
	
	public void changePersonsName(String name) {
		this.name = name;
	}
}
