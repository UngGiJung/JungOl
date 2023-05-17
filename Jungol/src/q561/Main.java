package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a [] = new int[10];
//		int a = sc.nextInt();
		int min = 10000;
		int max = 0;
		
		for (int i = 0; i < a.length; i++) {
			 a[i] = sc.nextInt();
			 //  100 > 88   || 123 > 88 

			 if (100 > a[i]) {
				 for (int j = 0; j < i; j++) {
					 if (a[i] > a[j]) {
						 min = a[i];
					 }
				 }
//				 min = a[i];
//				 System.out.print(a[i]+" ");
//			} else {
//				min =
			}
		}
		
	}

}
