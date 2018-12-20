package Tasks;

public class Task1 {
	private int num;
	private String res;

	public Task1(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void calculate() {
		int t1 = 0, t2 = 1, sum;
		res = "Fibonachi = " + String.valueOf(t1) + ", " + String.valueOf(t2);
		for (int i = 1; i <= num; ++i) {

			sum = t1 + t2;
			res = res + ", " + String.valueOf(sum);
			t1 = t2;
			t2 = sum;
		}
	}

	@Override
	public String toString() {
		return  res ;
	}
	
}

