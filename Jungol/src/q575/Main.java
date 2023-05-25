package q575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();	
		int n3 [] = new int[n2];
		
		
		for (int i =0; i < n3.length; i++) {
			n3[i] = n1;
			int n4 = n3[i]*n3[i+1];
		}
	}
}
