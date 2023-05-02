package q9030;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		sc.close();
		
		System.out.println(x);
		
		if (x > 10)
			System.out.print("10보다 큰 수를 입력하셨습니다.");
	}

}
