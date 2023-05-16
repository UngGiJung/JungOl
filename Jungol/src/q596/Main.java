package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int ind = sc.nextInt();	
		char q [] = new char[100];
		
		for (int i = 0; i <= word.length()-1; i++) {
			q[i] = word.charAt(word.length()-1-i);
		}	
		if (ind > word.length()) {
			ind = word.length();
		}
		for (int i = 0; i < ind; i++) {
			System.out.print(q[i]);
			
		}
		sc.close();
		//오답노트
//		for (int i = word.length() - 1; i >= 0; i--) {
//			if (word.length()-1 >= ind - 1) {
//				5입력 : 4; >= 3-1 : 2; 4 >= 2
//				System.out.print(word.charAt(i));
//			} else if (word.length() < ind) {
//				for (int j = word.length() - 1; j >= 0; j--) {
//					System.out.print(word.charAt(j));
//				}
//
//			}
//		}
	}
}
