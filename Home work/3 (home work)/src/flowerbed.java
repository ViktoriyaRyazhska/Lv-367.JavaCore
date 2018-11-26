import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flowerbed {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int radius = Integer.parseInt(br.readLine());
	double perimeter = 2*Math.PI*radius;
	double area = perimeter*Math.pow(radius, 2);
	System.out.println("perimeter: " + (perimeter));
	System.out.println("area: " + (area));
}
}
