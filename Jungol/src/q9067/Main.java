package q9067;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = new int[10];
				
		for (int i = 0; i <= 9; i++) {
			a[i] = sc.nextInt();
//			System.out.printf(a[2]+" ");
//			System.out.printf(a[4]+" ");
//			System.out.printf(a[9]+" ");
			
		}
		sc.close();
		System.out.printf(a[2]+" ");
		System.out.printf(a[4]+" ");
		System.out.printf(a[9]+" ");
	}
	
}
