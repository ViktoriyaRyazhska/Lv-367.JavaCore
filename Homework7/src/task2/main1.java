package task2;

import java.util.HashMap;

public class main1 {

	public static void main(String[] args) {
		HashMap<String,String>personMap = new HashMap<String,String>();
		
		personMap.put("Horak", "Orest");
		personMap.put("Petrakova", "Viktoria");
		personMap.put("Khavyk", "Nastya");
		personMap.put("Bychunska", "Kateryna");
		personMap.put("Lozynskyi", "Stepan");
		personMap.put("Krainyk", "Mykola");
		personMap.put("Ludenkov", "Orest");
		personMap.put("Weryk", "Petro");
		personMap.put("Hanyk", "Victor");
		personMap.put("Tomochko", "Vitaliy");
		
		for (String name: personMap.keySet()){
            String key =name.toString();
            String value = personMap.get(name).toString();  
            System.out.println(key + " " + value); 
           
} 
		
		 System.out.println("*******************************"); 
         System.out.println("RESULT"); 
        // personMap.remove( 3,"Orest");
         personMap.values().remove("Orest");
         System.out.println(personMap); 
		
		
	
		


	}

}
