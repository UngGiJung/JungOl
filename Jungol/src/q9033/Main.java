package q9033;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. ");
		int x = sc.nextInt();
		sc.close();
		
		if (90 < x && x <= 100) {
			System.out.println('A');			
		} else if (x >= 80) {
			System.out.println('B');
		} else if (x >= 70) {
			System.out.println('C');
		} else if (x >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	} 

	}
