package q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하시오. ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		System.out.printf("%d + %d = %d\n",x,y,(x+y));
		System.out.printf("%d * %d = %d",x,y,(x*y));
		
		
	}

}
