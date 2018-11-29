import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Car {
	private String mark;
	private String type;
	
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	private int year_of_production;
	private double engine_capacity;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear_of_production() {
		return year_of_production;
	}

	public void setYear_of_production(int year_of_production) {
		this.year_of_production = year_of_production;
	}

	public double getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(double engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	

	public String toString() {
		return "Car [Mark= " +type + ", Type=" + mark + ", year_of_production="
				+ year_of_production + ", engine_capacity=" + engine_capacity
				+ "]";
	}

	public Car(String type, String mark, int year_of_production,
			double engine_capacity) {
		
		this.type = type;
		this.mark = mark;
		this.year_of_production = year_of_production;
		this.engine_capacity = engine_capacity;
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] car = { new Car("Skoda","Sedan", 1998, 2.0), new Car("Ford","Picap", 2008, 4.5),
				new Car("Renault","Universal", 2010, 1.6),
				new Car("Porshe","Crossover", 2015, 2.1),
				new Car("Opel","Universal", 2017, 1.6), new Car("Seat","Sedan", 2015, 4.0),
				new Car("Mitsubishi","Universal", 2015, 1.9)};
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		System.out.println("***********************************************");
		int car_year;
		System.out.println("Please enter  year of the car : ");
		car_year = Integer.parseInt(br.readLine());
		System.out.println("Cars of "+car_year+" year:");
		for (int i = 0; i < car.length; i++) {
			
			if (car_year==car[i].getYear_of_production())
			{
				System.out.println(car[i]);
			}
		}
		
		
		
		System.out.println(" ");
		System.out.println(" **************** Ordered by Year of production ******************");
		Car car1;
		for (int i = 0; i < car.length; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].year_of_production < car[j].year_of_production) {
					car1 = car[i];
					car[i] = car[j];
					car[j] = car1;
				}
			}
			System.out.println(car[i]);
		}
	}
}
