public class Task3 {
	private int dollarCost;
	private int gryvna;
	private int amountOfDollars;
	public int change;
	
	public Task3() {
		
	}
	
	public Task3(int dollarCost, int gryvna) {
		this.dollarCost = dollarCost;
		this.gryvna = gryvna;
	}
		
	public int amountOfDollars() {
		amountOfDollars = gryvna / dollarCost;
		return amountOfDollars;
	}

	public int change() {
		change = gryvna % dollarCost;
		return change;
	}
	
	public void printResults() {
		
		amountOfDollars();
		System.out.println("You can buy " + amountOfDollars + " dollars and ");
		
		change();
		if (change != 0 ) {
			System.out.println("your change will be " + change + " hryvnas!");
		}
		else {
			System.out.println("there's no change for you!");
		}
	}
		

}