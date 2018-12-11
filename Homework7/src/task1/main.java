package task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		 Set set1 = new HashSet();
		    set1.add("Ian Darwin");
		    set1.add("Bill Dooley");
		    set1.add("Jesse James");
		    set1.add("Abra cadabra");
		    
		    
		    Set set2 = new HashSet();
		    set2.add("Ian Darwin");
		    set2.add("Doolin' Dalton");
		    intersect(set1,set2);
		    union(set1,set2);
	}
	static void  union(Set set1, Set set2) 
	{
		Set union = new TreeSet(set1);
	    union.addAll(set2);    // now contains the union
		System.out.println("union"+union);
	}
	static void  intersect(Set set1, Set set2) 
	{
	
		Set intersect = new TreeSet(set1);
	    intersect.retainAll(set2);	    
	   System.out.println("intersection"+ intersect);
	}
}
