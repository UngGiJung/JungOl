package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int count = 0;
		
		while (true) {
			int a = sc.nextInt();
			if (a <= 100 && a >= 0) {
			b += a;
			count++;
			} else {
				break;
			}

		}
		sc.close();
		System.out.println("sum : "+b);
		System.out.printf("avg : %.1f",(double)b/count);
	}
}
