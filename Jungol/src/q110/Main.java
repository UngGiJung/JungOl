package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double x = sc.nextDouble();
		sc.close();
		System.out.printf("%.1fyard = ",x);
		
		double y = x*91.44;
		System.out.printf("%.1fcm",y);
	}
}
