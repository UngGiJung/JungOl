package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int min = 10000;
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] >= max && a[i] < 100) {
				if (a[i] > max) {
					max = a[i];
				}
			} else if (a[i] <= min && a[i] >= 100) {
				if (a[i] <= min) {
					min = a[i];
				}
			}

		}
		if (min == 10000) {
			min = 100;
		}
		
		if (max == 0) {
			max = 100;
		}
		System.out.print(max + " ");
		System.out.print(min + " ");
	}
}

//			// 100 > 88 || 123 > 88
//
//			if (100 > a[i]) {
//				for (int j = 0; j < i; j++) {
//					if (a[i] > a[j]) {
//						min = a[i];
//					}
//				}
//			}
//		}
