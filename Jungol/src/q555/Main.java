package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char x [] = new char[10];
		//배열문 풀이
//		x [0] = sc.next().charAt(0);
//		x [1] = sc.next().charAt(0);
//		x [2] = sc.next().charAt(0);
//		x [3] = sc.next().charAt(0);
//		x [4] = sc.next().charAt(0);
//		x [5] = sc.next().charAt(0);
//		x [6] = sc.next().charAt(0);
//		x [7] = sc.next().charAt(0);
//		x [8] = sc.next().charAt(0);
//		x [9] = sc.next().charAt(0);
//		
//		sc.close();
//		
//		System.out.print(x[0]+" ");
//		System.out.print(x[1]+" ");
//		System.out.print(x[2]+" ");
//		System.out.print(x[3]+" ");
//		System.out.print(x[4]+" ");
//		System.out.print(x[5]+" ");
//		System.out.print(x[6]+" ");
//		System.out.print(x[7]+" ");
//		System.out.print(x[8]+" ");
//		System.out.print(x[9]+" ");
		
		//for 반복문 풀이
		for (char i = 0; i< x.length; i++) {
			x [i] = sc.next().charAt(0);
			System.out.printf("%c",x[i]);
			
		
	}
		sc.close();
}
}
