package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a [] = new int[4];
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i <= a.length-1; i++) {
			a[i] = sc.nextInt();
			
//			System.out.print(a[i]+" ");
			sum += a[i];
			avg += a[i];
			
		}
		System.out.println("sum "+sum);
		System.out.print("avg "+avg/a.length);
		sc.close();
	}
}
