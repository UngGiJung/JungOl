package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min;
		min = a > b ? b : a;
		min = min > c ? c : min;

		sc.close();
		
		System.out.print(min);
		
 	}

}
