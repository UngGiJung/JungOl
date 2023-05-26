package q196;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String A[] = new String[3];
		String I = null;


			String n = sc.nextLine();
			String t = sc.nextLine();
			String a = sc.nextLine();

			
			System.out.println(n +" \n"+ t + " \n" + a);
			sc.locale();
			
			A[0] = n;
			A[1] = t;
			A[2] = a;
			

		
		if (A[0].charAt(0) < A[1].charAt(0)) {
			I = A[0];
		}
		if (A[1].charAt(0) < A[2].charAt(0)) {
			I = A[1];
			
		} else {
			I = A[2];
			
		}
	}
}

//	private static void person(String I) {
//		
//	}
//
//	class Main2 {
//
//		String name;
//		String tel;
//		String addr;
//
//		public String person(String q, String w, String e) {
//
//			name = q;
//			tel = w;
//			addr = e;
//			
//			return q+w+e;
//		} 
//	}
//}
