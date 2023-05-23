package q574;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.print(Max(a, b, c));
	}
//	class Main2 {

	public static int Max(int q, int w, int e) {
		int max = q;

		if (q < w) {
			max = w;
		}
		if (w < e) {
			max = e;
		}
		return max;
	}
}
