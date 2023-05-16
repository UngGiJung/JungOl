package q597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if (a.length() <= 20 && b.length() <=20) {
		System.out.print(a.length()+b.length());
	}
		sc.close();
	}
}
