package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		//swap
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println(x + " * " + y +" = " + (x*y));
		System.out.printf(x +" / " + y+ " = " + "%d",(x/y));
		
		
	}

}