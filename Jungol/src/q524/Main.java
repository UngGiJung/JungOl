package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		boolean c = (a+b != 0);
		boolean d = (a*b != 0);
				
		System.out.print(d + " ");
		System.out.print(c);
		sc.close();
	}
}
