package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		//내 풀이
//		if(a > b && b >= c || a > b && b <= c) {
//			System.out.print(1+" ");
//		}
//		if (a == b && b == c ){
//			System.out.print(0+" ");
//		} 
//		if (a < b && b < c || a > b && b > c) {
//			System.out.print(0+" ");
//		}
//		if (a > b && b == c || a < b && b == c) {
//			System.out.print(0+" ");
//		}
//		if (b == c) { 
//			System.out.print(1+" ");
//		}
//		
//		if (b != c) {
//			System.out.print(0+" ");
//		}
		
		//강사님풀이
		
		if(a > b && a > c) {
			System.out.print(1+" ");
		} else {
			System.out.print(0+" ");
		}
		if(a == b && b == c) {
			System.out.print(1+" ");
		} else {
			System.out.print(0+" ");
		}
		
		sc.close();
	}

}

