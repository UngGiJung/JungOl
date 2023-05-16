package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char str[] = new char[100];
		String word = sc.next();

		for (int i = 0; i <= word.length() - 1; i++) {
			str[i] = (word.charAt(i));

			if (str[i] >= 65 && str[i] <= 90) {
				System.out.print((char) str[i]);
			} else if (str[i] >= 92 && str[i] <= 122) {
				System.out.print((char) (str[i] - 32));
			} else {

			}
		}
		sc.close();
	}
}
