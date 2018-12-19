package hwpart2;

public class Main {

	public static void main(String[] args) {
		
		Employee[] workers = new Employee[4];
		
		workers[0] = new SalariedEmployee("Mark", "2d3h328d7", 5, 250, "SSID:439dG3D4");
		workers[1] = new SalariedEmployee("Peter", "y783dh387", 4, 300, "SSID:jd347hf4");
		
		workers[2] = new ContractEmployee("Mr. President", "jf34f4h738", 2400, "TaxId:jdu3i4dh34");
		workers[3] = new ContractEmployee("Mr. BigBoss", "d4df34f343fg", 2100, "TaxId:jd3974h8f4");
		
		
		//which class should be this "temp" object?
		Employee temp = new SalariedEmployee();
		for (int i = 0; i < workers.length; i++) {
			for (int j = 0; j < workers.length; j++) {
				if (workers[i].getWage() > workers[j].getWage()) {
					temp = workers[i];
					workers[i] = workers[j];
					workers[j] = temp;
				}
			}
		}
		
		/* :(
		Employee temp = new SalariedEmployee();
		for (int i = 0; i < workers.length; i++) {
			for (int j = 0; j < workers.length; j++) {
				if (workers[i].equals(workers[j])) {
					temp = workers[i];
					workers[i] = workers[j];
					workers[j] = temp;
				}
			}
		}		
		*/
		
		for (int i = 0; i < workers.length; i++) {
			System.out.println(workers[i]);
		}
		
	}

}
