package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		sc.close();
		int[] a = new int[100];

		for (int i = 0; i <= a.length; i++) {
			a[i] = sc.nextInt();
			System.out.print(a[i] + " ");
			
			if (a[i] == 0) {
				for (int j = a.length; j > 0; j--) {
//					a[j] = sc.nextInt();
					System.out.print(a[j]);
				}
			}
		}
	}
}
