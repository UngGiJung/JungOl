package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x < 2 || x > 9 || y < 2 || y > 9) {
				System.out.println("INPUT ERROR!");
				continue;
			} else {
				sc.close();
				break;
			}
			
		}
		
		if (x < y) {
			for (int m1 = 1; m1 <= 9; m1++) {
				for (int n1 = x; n1 <= y; n1++) {
					System.out.printf(n1 + " * " + m1 + " = %2d", (n1 * m1));
					System.out.printf("   ");
				}
				System.out.println();
			}
		} else if (x >= y) {
			for (int m2 = 1; m2 <= 9; m2++) {
				for (int n2 = x; n2 >= y; n2--) {
					System.out.printf(n2 + " * " + m2 + " = %2d", (n2 * m2));
					System.out.printf("   ");
				}
				System.out.println();
			}
		}

	}
}
