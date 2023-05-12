package q613;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main i = new Main();

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int c = sc.nextInt();

		sc.close();
		
		System.out.println(i.q+" : "+a);
		System.out.println(i.w+" : "+b);
		System.out.println(i.e+" : "+c);
		
	}

}
