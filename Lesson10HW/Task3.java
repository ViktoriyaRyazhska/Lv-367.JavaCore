package homeworkl10;

public class Task3 {
	public static Thread th1, th2, th3;

	public static void main(String[] args) {

		th1 = new Thread() {
			public void run() {

				th2.start();
			}
		};
		th2 = new Thread() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread number two");
				}
				th3.start();
			}
		};
		th3 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number three");
				}

			}
		};
		th1.start();

	}

}
