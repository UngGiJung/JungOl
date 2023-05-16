package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
		int b = sc.nextInt();
		
		if (a>b) {
		  int c = a - b;
			System.out.print(c);
		} else {
			int c = b - a ;
			
			System.out.print(c);
		}	
		sc.close();
	}
}
