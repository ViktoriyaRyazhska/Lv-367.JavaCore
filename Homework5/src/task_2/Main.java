package task_2;


public class Main {


	public static void main(String[] args) {
		Employee [] emp= new Employee[6];
		emp[0]= new Salaried_employee(1000,"123221","Jack",4123);
		emp[1]= new Salaried_employee(3600,"939431","Kate",4124);
		emp[2]= new Salaried_employee(25600,"654431","Lora",4125);
		emp[3]= new Contract_employee(45,20.5,"Olena",4123);
		emp[4]= new  Contract_employee(20,34.5,"Pavlo",1543);
		emp[5]= new  Contract_employee(40,124.3,"Ivan",3256);
		
		for(int i=0;i<emp.length;i++)
		{		
			System.out.println(emp[i]);
		}
		System.out.println();
		System.out.println(" ******************* Ordered by salary **************************");
		Employee emp1;
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].salary< emp[j].salary) {
					emp1 = emp[i];
					emp[i] = emp[j];
					emp[j] = emp1;
				}
			}
			System.out.println(emp[i]);
		}
		
	}

}
