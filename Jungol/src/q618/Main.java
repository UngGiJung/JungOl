package q618;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];

		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			int mmg = sc.nextInt();
			double tall = sc.nextDouble();

			p[i] = new Person(name, mmg, tall);
		}
		// sc.close();

		Person min = p[0];
		for (int i = 0; i < 5; i++) {
			if (min.getA() > p[i].getA()) {
				min = p[i];
			}
		}
		for (int j = 0; j < 5; j++) {
			if (min == p[j].getA()) {
				System.out.println();
			}
		}
	}
}
