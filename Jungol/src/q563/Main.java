package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1[] = new int[10];
		int max = 0;
		int n2[] = new int[10];
		int n3[] = new int[10];

		for (int i = 0; i <= n1.length; i++) {
			n1[i] = sc.nextInt();
			if (max <= n1[i]) {
				n2[i] = max;
				max = n1[i];
			} else {
				n3[i] = max;
			}
			for (int j = n1.length-1; j <= 0; j--) {
				System.out.print(j + " ");
			}
		}
	}
}
