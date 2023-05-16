package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Korea";
		String b = "USA";
		String c = "Japan";
		String d = "China";
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("1. " + a + "\n" + "2. " + b + "\n" + "3. " + c + "\n" + "4. " + d + "\n");
			System.out.println("number? ");
			int e = sc.nextInt();
			if (e == 1) {
				System.out.println("Seoul\n");
			} else if ( e == 2 ) {
				System.out.println("Washington\n");
			} else if ( e == 3 ) {
				System.out.println("Tokyo\n");
			} else if ( e == 4 ) {
				System.out.println("Beijing\n");
			} else {
				System.out.println("none");
				sc.close();
				break;
			} 
		} 
	}
}
