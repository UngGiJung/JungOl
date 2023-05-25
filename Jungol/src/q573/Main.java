package q573;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		MainExam q = new MainExam();
		q.sc(a);
	}
}

class MainExam {
	void sc (int a) {
		for (int i = 1; i <= (a*a); i++) {
			System.out.print(i+" ");
			if (i % a*i == 0) {
			System.out.println();
			}
		}
	}
}



//강사님 풀이
//import java.util.Scanner;
//
//public class Main {
////								n = inp; 
//	public static void numberRect(int n) {
//		int num = 1;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(num++ + " ");
//			}
//			System.out.println();
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int inp = sc.nextInt();
//		sc.close();
//
//		System.out.println(inp);
//
//		numberRect(inp);
//	}
//
//}