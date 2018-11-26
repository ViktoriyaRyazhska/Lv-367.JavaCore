 public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product E1 = new Product("Oranges",12.3,78);
		Product E2 = new Product("Apples",15.3,244);
		Product E3 = new Product("Bananas",19.3,778);
		
		System.out.println(E1);
		
		System.out.println(E1.equals(E2));
		
		System.out.println("The most expensive item is: ");
		if (E1.getPrice() > E2.getPrice()) {
			if (E1.getPrice() > E3.getPrice())
				System.out.println();
		}
		else if (E2.getPrice() > E3.getPrice() ) {
			System.out.println(	E2.getName() + " " + E2.getQuantity() );
		}
		else {
			System.out.println(E3.getName() + " " + E3.getQuantity() );
			}
		
		
		if (E1.getPrice() > E2.getPrice()) {
			if (E1.getPrice() > E3.getPrice())
				System.out.println(E1);
		}
		else if (E2.getPrice() > E3.getPrice() ) {
			System.out.println(	E2 );
		}
		else {
			System.out.println( E3 );
			}
		
		
	}

		
	
}
