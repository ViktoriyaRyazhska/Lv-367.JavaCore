package task_1;
public class Main {

	public static void main(String[] args) {
		Bird[] b = new Bird[5];
		b[0]= new Kiwi(5);
		b[1]= new Chicken(2);
		b[2]= new Eagle(5);
		b[3]= new Penguin(6);
		b[4]= new Swallow(3);
		for (int i = 0; i < b.length; i++) {
			b[i].print();
			System.out.println(b[i]);
		}
			
	}

}
