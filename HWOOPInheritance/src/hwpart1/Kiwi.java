package hwpart1;

public class Kiwi extends NonFlyingBird {

	public Kiwi(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	void fly() {
		System.out.println("Kiwi's can't fly!");		
	}

}
