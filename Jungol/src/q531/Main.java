package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
//		System.out.println(x); // 검수
		
		
		
		if (x <= 50.80) {
			System.out.println("Flyweight");
		} else if (x <= 61.23) {
			System.out.println("Lightweight");
		} else if (x <= 72.57) {
			System.out.println("Middleweight");
		} else if (x <= 88.45) {
			System.out.println("Cruiserweight");			
		}  else {
			System.out.println("Heavyweight");
		}
		sc.close();
		
	}

}
