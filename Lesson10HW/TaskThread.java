package homeworkl10;

public class TaskThread implements Runnable {
	private String text;
	private int pause, iter;
	private Thread thread = null, thread2 = null;

	public TaskThread(String text, int pause, int iter) {

		this.text = text;
		this.pause = pause;
		this.iter = iter;
	}

	public TaskThread(String text, int pause, int iter, Thread thread) {

		this.text = text;
		this.pause = pause;
		this.iter = iter;
		this.thread = thread;
	}

	public TaskThread(String text, int pause, int iter, Thread thread, Thread thread2) {

		this.text = text;
		this.pause = pause;
		this.iter = iter;
		this.thread = thread;
		this.thread2 = thread2;
	}

	public void run() {
		if (thread != null) {
			try {
				thread.join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		if (thread != null && thread2 != null) {
			try {
				thread.join();
				thread2.join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		for (int i = 0; i < iter; i++) {
			System.out.println(text);
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {

				System.out.println(e.getMessage());
			}
		}

	}
}
