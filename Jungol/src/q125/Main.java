package q125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];

		for (int i = 0; i <= b.length - 1; i++) {
			b[i] = i + 1;
			System.out.print(b[i]+" ");
		}
		sc.close();
	}

}
