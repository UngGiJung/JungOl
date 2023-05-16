package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			char a = sc.next().charAt(0);

			if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
				System.out.println(a);
			} else if (a >= 48 && a <= 57) {
				System.out.printf("%d\n", (int) a);
			} else {
				sc.close();
				break;
			}
		}

	}
}
