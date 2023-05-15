package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int min = 1000;

		for (int i = 0; i <= 9; i++) {
			a[i] = sc.nextInt();


			if (a[i] < min) {
				min = a[i];
			}
		}
		sc.close();
		System.out.println(min);

	}
}
