package Hw4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Errors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Http http;
		System.out.println("Write errors number");
		int a = Integer.parseInt(br.readLine());
		switch (a) {
		case 404:
			System.out.println(http=Http.NotFound);
			break;
		case 405:
		System.out.println(http=Http.MethodNotAllowed);
		break;
		case 406:
			System.out.println(http=Http.NotAcceptable);
			break;
		case 403:
			System.out.println(http=Http.Forbidden);
			break;
		}
		
	}

}
