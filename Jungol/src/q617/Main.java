package q617;

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//
//		String name1[] = new String[5];
//		int tall1[] = new int[5];
//		int min = 300;
//		String fn = null;
//
//		for (int i = 0; i < tall1.length; i++) {
//			name1[i] = sc.next();
//			tall1[i] = sc.nextInt();
//
//			if (tall1[i] < min) {
//				min = tall1[i];
//			}
//		}
//		
//		//min = 155
//		for (int j = 0; j < tall1.length; j++) {
//			if (min == tall1[j]) {
//				System.out.print(name1[j] + " " + min + " ");
//			}
//		}
//	}
//}

//지니지니 승지니형님 풀이
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];

		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();

			p[i] = new Person(name, height);

		}
		sc.close();

//		for (int i = 0; i < p.length; i++) {
//			p[i].print();
//		}

		Person min = p[0];
		for (int i = 0; i < p.length; i++) {
			if(min.getHeight() > p[i].getHeight()) {
				min = p[i];
			}
		}
		min.print();
	}
}