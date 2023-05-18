package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		//풀이 1 새로운 배열을 선언하여 저장 후 뽑아내기
//		int z[] = new int[5];
//		int x[] = new int[6];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//		}
//		for (int j = 1; j <= a.length - 5; j++) {
//			x[j] = a[(2 * j) - 1];
//		
//		}
//		
//		System.out.print("sum : " + (x[1] + x[2] + x[3] + x[4] + x[5]) + " ");
//		System.out.println();
//		
//		for (int j = 0; j <= a.length - 6; j++) {
//			z[j] = a[2 * j];
//		}
//		System.out.printf("avg : %.1f", (double) (z[0] + z[1] + z[2] + z[3] + z[4]) / 5);
//		sc.close();
		
//------------------------------
		
		//풀이 2 반복문 및 "+= (연속 덧셈)" 사용하여 풀기
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
		}

		for (int j = 1; j <= a.length - 5; j++) {
			sum += a[(2*j)-1];
			
		}

		System.out.println("sum : "+sum);

		for (int j = 0; j <= a.length - 6; j++) {
			avg += a[2 * j];
		}
		System.out.printf("avg : %.1f", (double) avg / 5);
		sc.close();
	}
}
