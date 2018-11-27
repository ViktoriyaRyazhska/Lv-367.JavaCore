package Lesson4;

public class Maine {

	public static void main(String[] args) {

		int[] array = { 6, 2, 4, 1, -3, -4, -5 };
		int max = 0;
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {

				max = array[i];
			}
		}
		System.out.println(max);

		System.out.println();

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>0){
				
				sum += array[i];
			}
			

		}
		System.out.println(sum);
		
		System.out.println();
		
		int sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<0){
				
				sum2 += array[i];
			}
			

		}
		System.out.println(sum2);
	}

}
