import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		HTTPError number; //"The value of the local variable number is not used" why? :'(

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int code = Integer.parseInt(br.readLine());
		
		switch(code) {
		
		case 400:
			number = HTTPError.HTTP400;
			System.out.println("400: Bad Request");
			break;
		case 401:
			number = HTTPError.HTTP401;
			System.out.println("401: Unauthorized");
			break;
		case 402:
			number = HTTPError.HTTP402;
			System.out.println("402: Payment Required");
			break;
		case 403:
			number = HTTPError.HTTP403;
			System.out.println("403: Forbidden");
			break;
		case 404:
			number = HTTPError.HTTP404;
			System.out.println("404: Not Found");
			break;
		case 405:
			number = HTTPError.HTTP405;
			System.out.println("405: Method Not Allowed");
			break;
		default:
			System.out.println("Bad number!");
			System.exit(0);
		
		}
		
		
		
	}

}
