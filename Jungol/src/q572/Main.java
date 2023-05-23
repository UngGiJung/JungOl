package q572;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		Main2 b = new Main2();
		b.N1(a);
	}
}

class Main2 {
	void N1 (double a) {
		System.out.printf("%.2f",(a*a*3.14));
		
	}
}