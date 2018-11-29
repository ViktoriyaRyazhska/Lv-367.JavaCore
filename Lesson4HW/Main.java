package homeworkl4;

public class Main {
	
	public static void main(String args[]) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		Dog.Breed breed = null;
		
		dog1.setName("Tuzik");
		dog1.setAge(4);
		dog1.setBreed(breed.Haski);
		
		dog2.setName("Mynchik");
		dog2.setAge(2);
		dog2.setBreed(breed.Laika);
		
		dog3.setName("Simba");
		dog3.setAge(3);
		dog3.setBreed(breed.Akita);
		
		if(dog1.getName().equals( dog2.getName())) {
			System.out.println("Dog1 and Dog2 has the same name");
			
		}
		if(dog1.getName().equals( dog3.getName())) {
			System.out.println("Dog1 and Dog3 has the same name");
			
		}
		if(dog2.getName().equals( dog3.getName())) {
			System.out.println("Dog2 and Dog3 has the same name");
			
		}
		if(dog1.getAge()>dog2.getAge() && dog1.getAge()>dog3.getAge()) {
			System.out.println(dog1);
		}
		if(dog2.getAge()>dog1.getAge() && dog2.getAge()>dog3.getAge()) {
			System.out.println(dog2);
		}
		if(dog3.getAge()>dog2.getAge() && dog3.getAge()>dog1.getAge()) {
			System.out.println(dog3);
		}
		
	}
}
