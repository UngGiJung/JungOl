package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Ctrl + Shift + 'o' >> import 값을 알맞게 변동시켜줌
		int d = sc.nextInt();
		sc.close();
		
		System.out.println(d);
		if (d < 0) {
			System.out.print("minus");
		
		}
	}
}
