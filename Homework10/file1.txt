package homework;



public class task1 extends Thread {
	private String text;
	private int pause;

	public task1(String text, int pause) {

		this.text = text;
		this.pause = pause;
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(text);
			try {
				sleep(pause);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		task1 p1 = new task1("Hello world", 1000);
		task1 p2 = new task1("Peace in the peace", 1000);
		task1 p3 = new task1("I study java ", 2000);
		p1.start();
		p2.start();
		
		try {
			p1.join();
			p2.join();
			
			p3.start();
			p3.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}

}
