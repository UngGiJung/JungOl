package q522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if (x == y) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		if (x != y) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}

