package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("number? ");
			int x = sc.nextInt();
			if (x > 0) {
				System.out.println("positive integer");
			} else if (x < 0) {
				System.out.println("negative number");
			} else if (x == 0) {
				break;
			}
		}
		sc.close();
	}
}
