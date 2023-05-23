package q571;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		Main2.Q(c);
		
		sc.close();
	}
}

class Main2 {
	static void Q (int b) {
		String a = "~!@#$^&*()_+|";
		for (int i = 0; i < b; i++) {
			System.out.println(a);
		}
	}	 	
}