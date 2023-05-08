package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		int a = x++;
		int b = --y;
		
		System.out.print(x+" ");
		System.out.print(y+" ");
		System.out.print(a*b);
	}

}
