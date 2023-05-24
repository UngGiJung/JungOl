package q573;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		MainExam q = new MainExam();
		q.sc(a);
	}
}

class MainExam {
	void sc (int a) {
		for (int i = 1; i <= (a*a); i++) {
			System.out.print(i+" ");
			if (i % a*i == 0) {
			System.out.println();
			}
		}
	}
}

