package hwpart1;

public class Main {

	public static void main(String[] args) {
		
		Bird[] b = new Bird[4];
		
		b[0] = new Eagle("White","9 months");
		b[1] = new Swallow("Black","1 decade");
		b[2] = new Penguin("What? Crazy..","3 years");
		b[3] = new Kiwi("Strange","2 months");
		
		for (int i = 0; i < b.length; i++) {
			
			b[i].fly();
		}
		
	}

}
