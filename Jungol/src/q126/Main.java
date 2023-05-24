package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt1 = 0; //짝수
		int cnt2 = 0; //홀수

		while (true) {
			int a = sc.nextInt();
			
			if (0 < a) {

				if (a % 2 == 0) {
					cnt1++;

				} 
				if (a % 2 != 0) {
					cnt2++;
					
				}
			} else if (0 == a) {
				break;
			}
		}
		sc.close();
		System.out.println("add : "+cnt2);
		System.out.print("even :  "+cnt1);
	}
}
