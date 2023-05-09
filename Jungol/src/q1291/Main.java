package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if ( x < 2 || x > 9 || y < 2 || y > 9) {
				System.out.print("INPUT ERROR!");
				continue;	
			}

		if (x < y && x > 1) {
			for (int m1 = 1; m1 <= 9; m1++) {
				for (int n1 = x; n1 <= y; n1++) {
					System.out.printf(n1 + " * " + m1 + " = %2d", (n1 * m1));
					System.out.printf("   ");
				}
				System.out.println();
			}
		} else if (x > y && y > 1) {
			for (int m2 = 1; m2 <= 9; m2++) {
				for (int n2 = x; n2 >= y; n2--) {
					System.out.printf(n2 + " * " + m2 + " = %2d", (n2 * m2));
					System.out.printf("   ");
				}
				System.out.println();
			}
		} //else {
//			System.out.println("INPUT ERROR!");
//		}
		sc.close();
	}
}
}
