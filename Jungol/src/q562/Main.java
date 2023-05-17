package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int sum;
		int avg;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j <= a.length-6; j++) {
			sum = a[2 * j];
//			a[j] = sum;
			System.out.print(sum+" ");
		}

		for (int j = 1; j <= a.length-5; j++) {
			avg = a[(2 * j) - 1];
//			a[j] = avg;
			System.out.print(avg+" ");
		}

	}
}
