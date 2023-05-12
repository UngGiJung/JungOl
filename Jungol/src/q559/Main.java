package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
				
		double cavg [] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
//		System.out.println(cavg[n1-1]);
//		System.out.println(cavg[n2-1]);
		System.out.println(cavg[n1-1]+cavg[n2-1]);
		
//		for (int i = 0; i <= n1-1; i++) {
//
//			System.out.println(cavg[i]);
//		}	
	}
}
