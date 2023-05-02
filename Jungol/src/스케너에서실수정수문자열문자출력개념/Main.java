package 스케너에서실수정수문자열문자출력개념;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//정수		
		int x = sc.nextInt();
//실수		
		double x1 = sc.nextDouble();
//문자열		
		String x2 = sc.next();
//문자		
		char x3 = sc.next().charAt(0);
		sc.close();
		
						
		System.out.println(x);
   	   System.out.printf("%.3f\n",x1);
		System.out.printf("%s\n",x2);
		System.out.printf("%c",x3);

		

	}

}
