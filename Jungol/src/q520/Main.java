package q520;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		int a = x++;
		int b = ++x;
		
		System.out.println(a);
		System.out.println(b);
	}

}
