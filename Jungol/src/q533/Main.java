package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		int x = sc.nextInt();
		sc.close();
		
		if (s == 'M' && x >= 18) {System.out.println("MAN");
		} else if (s == 'F' && x >= 18) {System.out.println("WOMAN");
		} else if (s == 'M' && x <= 18) {System.out.println("BOY");
		} else if (s == 'F' && x <= 18) {System.out.println("GIRL");}
	}
	//'equals'는 힙에 나오는 결과값이 같을때 쓴다 그리고 "=="은 스택에 나오는 주소값이 같을때 쓴다.

}
