
public class task2 {
private int numb;

public task2(int numb) {
	super();
	this.numb = numb;
	
}


@Override
public String toString() {
	return "";
}

public int getNumb() {
	return numb;
}

public void setNumb(int numb) {
	this.numb = numb;
}




public  void primeFactors() 
{ 
	int p=numb;
	System.out.print(p+"=");
	while (numb%2==0) 
    { 
        System.out.print(2 + "*"); 
        numb /= 2; 
    } 

    // n must be odd at this point.  So we can 
    // skip one element (Note i = i +2) 
    for (int i = 3; i <= Math.sqrt(numb); i+= 2) 
    { 
        // While i divides n, print i and divide n 
        while (numb%i == 0) 
        { 
            System.out.print(i + "*"); 
            numb /= i; 
        } 
    } 

    // This condition is to handle the case when 
    // n is a prime number greater than 2 
    if (numb > 2) 
        System.out.print(numb); 
    
    
} 



}
