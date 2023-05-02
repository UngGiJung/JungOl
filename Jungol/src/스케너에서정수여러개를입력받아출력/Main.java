package 스케너에서정수여러개를입력받아출력;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x [] = new int[5];
		//배열만 이용한 풀이
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		x[3] = sc.nextInt();
		x[4] = sc.nextInt();
		
	
//		//for 반복문을 활용한 풀이
//		for (int i = 0; i < x.length; i++) {
//			x[i] = sc.nextInt();
//	}
//			System.out.printf("%d",x[i]);
		sc.close();
		System.out.printf("%d",x[0]);
		System.out.printf("%d",x[1]);
		System.out.printf("%d",x[2]);
		System.out.printf("%d",x[3]);
		System.out.printf("%d",x[4]);
		
	}
	}