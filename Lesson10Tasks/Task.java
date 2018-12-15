package lesson10;

public class Task implements Runnable {
	private String text;
	private int pause,iter;
	
	public Task(String text, int pause, int iter) {
		
		this.text = text;
		this.pause = pause;
		this.iter = iter;
	}

	public void run() {
		for (int i = 0; i < iter; i++) {
			System.out.println(text);
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}
}
