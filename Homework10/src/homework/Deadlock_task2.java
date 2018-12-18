package homework;

public class Deadlock_task2 {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (first) {
					Thread.yield();
					synchronized (second) {
						System.out.println("Success!");
					}
				}
			}
		};
	}
}
