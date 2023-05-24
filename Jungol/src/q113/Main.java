package q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int c = (a+5);
		int d = (b*2);
		
		System.out.println("width = "+c);
		System.out.println("length = "+d);
		System.out.println("area = "+(c*d));
	}

}
