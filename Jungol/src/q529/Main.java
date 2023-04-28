package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
//		System.out.print(x);
//		System.out.print(y);
		
		
		int z = y+100-x;
		
		System.out.println(z);
		
		if (z > 0) {
			System.out.printf("Obesity");
		}

	}
}
