package q523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		//오답
//		if (a > b) {
//			System.out.println(a+ " > " + b + " --- " + false);
//		} else if (a < b) {
//			System.out.println(a+ " < " + b + " --- " + true);
//		} else if (a >= b) {
//			System.out.println(a+ " >= " + b + " --- " + false);
//		} else if (a <= b) {
//			System.out.println(a+ " <= " + b + " --- " + true);
//		}
		
		//강사님 풀이 1
		
		System.out.println(a+ " > " + b + " --- " + (a>b));
		System.out.println(a+ " < " + b + " --- " + (a<b));
		System.out.println(a+ " >= " + b + " --- " + (a>=b));
		System.out.println(a+ " <= " + b + " --- " + (a<=b));
		
		System.out.println();
		
		//강사님 풀이 2 if else
		if (a > b) {
		System.out.println(a+ " > " + b + " --- " + true);
		} else {
			System.out.println(a+ " > " + b + " --- " + false);
		} 
		
		if (a < b) {
		System.out.println(a+ " < " + b + " --- " + true);
		} else {
			System.out.println(a+ " > " + b + " --- " + false);
		}
		
		if (a >= b) {
		System.out.println(a+ " >= " + b + " --- " + true);
		} else {
			System.out.println(a+ " >= " + b + " --- " + false);
		}
		
		if (a <= b) {
		System.out.println(a+ " <= " + b + " --- " + true);
		} else {
			System.out.println(a+ " <= " + b + " --- " + false);
		}
		
		System.out.println();
		
		//강사님 풀이 3 삼항연산자
		System.out.print(a+ " > " + b + " --- ");
		boolean c = (a>b) ? true : false;
				System.out.println(c);
				
		System.out.print(a+ " < " + b + " --- ");
		boolean d = (a<b) ? true : false;
				System.out.println(d);
				
		System.out.print(a+ " >= " + b + " --- ");				
		boolean e = (a>=b) ? true : false;
				System.out.println(e);
				
		System.out.print(a+ " <= " + b + " --- ");
		boolean f = (a<=b) ? true : false;
				System.out.println(f);
				
		
		
	}
	

}
