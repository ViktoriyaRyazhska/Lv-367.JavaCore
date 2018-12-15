package lesson10;

public class Main {

	public static void main(String[] args) {

		Runnable r = new Task("I study Java", 1000, 10);
		Thread th = new Thread(r);
		th.start();
		System.out.println();
		Runnable r2 = new Task("Hello, world", 2000, 5);
		Runnable r3 = new Task("Peace in the peace", 3000, 5);
		Thread th2 = new Thread(r2);
		Thread th3 = new Thread(r3);
		th2.start();
		th3.start();
		try {
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("My name is Oleh");
	
	}

}
