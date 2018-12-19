package hwpart1;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	void fly() {
		System.out.println("Penguins can't fly!");
	}

}
