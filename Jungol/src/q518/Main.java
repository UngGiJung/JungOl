package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//스케너 풀이법
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();
		
//		System.out.printf("sum : %d\n",(x+y+z));
//		System.out.printf("avg : "+((x+y+z)/3));
		
		
		//for문 풀이법
//		int [] x = new int[3];
//		for (int i = 0 ; i < x.length; i++) {
//			x [i] = sc.nextInt();
//		}
//		
//		sc.close();
//		
//
//		for (int i = 0; i < x.length; i++) {
////			System.out.print(x[i] + " \n");
//		}
//		
//		int sum = 0;
//				for (int i = 0; i < x.length; i++) {
//					sum += x[i];
//		}
//		System.out.println("sum : " + sum);
//		System.out.println("avg : " + (sum / x.length));

		//while 문 풀이법
	      int cnt = 0;
	      int sum = 0;
	      while (cnt<3) {
	         int inp4 = sc.nextInt();
	         sum += inp4;         
	         cnt++;
	      }
	      System.out.println("sum : "+sum);
	      System.out.println("avg : " + (sum / cnt));
	      sc.close();
		
	}

}
