package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (true) {
			int a = sc.nextInt();
			if (a != 0) {
				if (a % 3 != 0 && a % 5 != 0) {
					count++;
				}
			} else {
				break;
			}
		}
		sc.close();
		System.out.print(count);
	}

}
