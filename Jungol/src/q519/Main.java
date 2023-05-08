package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		int a = x+100;
		int b = y % 10;
		
		System.out.print(a+" ");
		System.out.println(b);
		
		
	}

}
