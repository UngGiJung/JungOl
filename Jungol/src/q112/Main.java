package q112;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int a = n1/n2;
		int b = n1%n2;
		
		System.out.printf("%d / %d = %d...%d",n1,n2,a,b);
		
		sc.close();
	}

}
