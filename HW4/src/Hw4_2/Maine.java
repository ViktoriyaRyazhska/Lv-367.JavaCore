package Hw4_2;

import Hw4_1.Http;

public class Maine {

	public static void main(String[] args) {
		Breed breed;
		Dog dog0 = new Dog("Layka", "Layka", 5);
		Dog dog1 = new Dog("Rex", "Vivchrka", 6);
		Dog dog2 = new Dog("Layka", "Layka", 8);
		
		if(dog0.getName()==dog1.getName()) {
			System.out.println(dog0+" "+dog1);
		}
		else if(dog0.getName()==dog2.getName()) {
			System.out.println(dog0+" "+dog2);
		}
		else {
			System.out.println(dog1+" "+dog2);
		}
		
		System.out.println();
		
		if(dog0.getAge()>dog1.getAge() && dog0.getAge()>dog2.getAge()) {
			System.out.println(dog0.getName());
			
		}
		else if(dog1.getAge()>dog2.getAge() && dog1.getAge()>dog0.getAge()) {
			System.out.println(dog1.getName());
			
		}
		else {
			System.out.println(dog2.getName());
		}

	}

}
