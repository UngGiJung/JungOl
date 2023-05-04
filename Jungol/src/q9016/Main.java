package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요. ");
		double x = sc.nextDouble();
		
		
		System.out.print("몸무게를 입력하세요. ");
		double y = sc.nextDouble();


		System.out.print("이름을 입력하세요. ");
		String z = sc.next();

		
		System.out.printf("키 = %.0f\n",x);
		System.out.printf("몸무게 = %.1f\n",y);
		System.out.printf("이름 = %s",z);
		
		sc.close();
	}
}
