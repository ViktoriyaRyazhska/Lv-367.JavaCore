public class Main {

	public static void main(String[] args) {
		
		Dog first = new Dog("Shark", Breed.Doge, 16);
		Dog second = new Dog("Shark", Breed.Rex, 17);
		Dog third = new Dog("Peter", Breed.Bars, 14);	
		
		if (first.equals(second) || first.equals(third) ||  second.equals(third)) {
			System.out.println("There IS two dogs with the same name");
		}
		else {
			System.out.println("There`s NO two dogs with the same name!");
		}
		
		if ( (first.getAge() > second.getAge()) && (first.getAge() > third.getAge()) ) {
			System.out.println(first);
		}
		else if (second.getAge() > third.getAge()) {
			System.out.println(second);
			}
		else {
			System.out.println(third);
			}
		
		
		
	}

}
