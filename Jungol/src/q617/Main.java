package q617;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String name = sc.nextLine();
		 int tall = sc.nextInt();
		
		 Main2.class(name,tall);		
	}
}


class Main2 {
	//필드
	String name;
	int tall;
	
	
	//생성자
	Main2 (String a, int b) {
		name = a;
		tall = b;
		
		String name1 [] = new String[5];
		int tall1 [] = new int[5];
		
		for (int i = 0; i < tall1.length; i++) {
			name1[i] = a;
			tall1[i] = b;
		}
	}
}