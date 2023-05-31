package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 1; i < (h * n) + 1; i++) {
			System.out.print(i + " ");
			if (i % n == 0) {
				System.out.println();

			}

		}
		sc.close();
	}

}
