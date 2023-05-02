package q9041;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("점수를 입력하세요. ");
			int x = sc.nextInt();

			if (x < 0 || x > 100) {
				sc.close();
				break;
			}
		
		if (80 <= x &&x <= 100) {
			System.out.println("축하합니다. 합격입니다.");
		} else if (x <= 79){
			System.out.println("죄송합니다. 불합격입니다.");
		} 
	}	
	}		
}

