package homeworkl10;


public class Main {

	public static void main(String[] args) {
		Runnable r = new TaskThread("Hello", 1000, 5);
		Runnable r2 = new TaskThread("Kavajamba", 1500, 5);
	

		Thread th = new Thread(r);
		Thread th2 = new Thread(r2);
		Runnable r3 = new TaskThread("Bruno", 1000, 5, th, th2);
		Thread th3 = new Thread(r3);

		th.start();
		th2.start();
		th3.start();
		try {
			th.join();
			th2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
