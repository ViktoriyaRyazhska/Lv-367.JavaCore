package homeworkl5;

public class MonthDay {
	public static void checkmonth(int num) {
		int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		switch (num) {
		case 1:
			System.out.println("It`s January. There are " + days + " days");
			break;
		case 2:
			System.out.println("It`s February. There are " + days + " days");
			break;
		case 3:
			System.out.println("It`s March. There are " + days + " days");
			break;
		case 4:
			System.out.println("It`s April. There are " + days + " days");
			break;
		case 5:
			System.out.println("It`s May. There are " + days + " days");
			break;
		case 6:
			System.out.println("It`s June. There are " + days + " days");
			break;
		case 7:
			System.out.println("It`s July. There are " + days + " days");
			break;
		case 8:
			System.out.println("It`s August. There are " + days + " days");
			break;
		case 9:
			System.out.println("It`s September. There are " + days + " days");
			break;
		case 10:
			System.out.println("It`s October. There are " + days + " days");
			break;
		case 11:
			System.out.println("It`s November. There are " + days + " days");
			break;
		case 12:
			System.out.println("It`s December. There are " + days + " days");
			break;
		default:
			System.out.println("There is now  month with this number!");
			break;
		}
	}
}
