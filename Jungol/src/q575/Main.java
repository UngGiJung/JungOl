package q575;

//import java.util.Scanner;

//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3[] = new int[n2];
//		int n4 = 0;
//		sc.close();
//
//		if (n2 == 0) {
//			System.out.println(1);
//		} else {
//
//			for (int i = 0; i < n3.length; i++) {
//				n3[i] = n1;
//				n4 = n3[1] * n3[i];
//				int temp = n4;
//				n3[1] = temp;
//			}
//			System.out.println(n4);
//		}
//
//	}
//}

import java.util.Scanner;

public class Main {
	static int n3[];
	static int n4 = 0;

	public static int qwe(int n1, int n2) {
		if (n2 == 0) {
			n4 = 1;
		} else if (n2 == 1) {
			n4 = n1;
		} else {
			for (int i = 0; i < n3.length; i++) {
				n3[i] = n1;
				n4 = n3[1] * n3[i];
				int temp = n4;
				n3[1] = temp;
			}
//         System.out.println(n4);
		}

		return n4;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		sc.close();
		n3 = new int[n2];

		int r = qwe(n1, n2);
		System.out.println(r);

	}
}

//강사님 풀이

//import java.util.Scanner;
//
//public class Main {
//	public static int qwe(int p1, int p2) {
//		int ret = 1;
//		for (int i = 0; i < p2; i++) {
//			ret *= p1;
//		}
//
//		return ret;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		sc.close();
//
////		System.out.println(n1 + " " + n2);
//		int r = qwe(n1, n2);
//		System.out.println(r);
//	}
//}