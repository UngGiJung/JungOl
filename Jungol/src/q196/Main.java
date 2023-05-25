package q196;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String t = sc.nextLine();
		String a = sc.nextLine();
		sc.locale();
		
		String A[] = new String[3];

		A[0] = n;
		A[1] = t;
		A[2] = a;
		
		String i;

		if (A[0].charAt(0) < A[1].charAt(0)) {
			System.out.println(n);
			i = n;
		} 
		if (A[1].charAt(0) < A[2].charAt(0)) {
			System.out.println(t);
			i = t;
		} else {
		System.out.println(a);
			i = a;
	}
		Main2 f = new Main2();
		f.person(i);
}


class Main2 {

	String name;
	String tel;
	String addr;

	void person(String n, String t, String a) {
		
		name = n;
		tel = t;
		addr = a;
	}
}
}