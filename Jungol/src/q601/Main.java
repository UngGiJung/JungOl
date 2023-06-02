package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mj = sc.next();
		mj = mj+mj;
		//System.out.println(mj);
		
//		for (int i = 0; i <= mj.length(); i++) {
//			for (int j = mj.length()-i; j <= 6-i; j--) {
//				
//			}
//		}
		
		
		 // i % (mj.length()/2)-1 == 0
		 //PROGRAMPRO G R A M
		 //012345678910111213
		 //              14 - 8 = 6  < = 14-2 = 12
		
		for (int j = 1; j <= (mj.length()/2); j++) {
		for (int i = mj.length()-((mj.length()/2)+j); i <= mj.length()-(mj.length()-(mj.length()-(1+j))); i++) {
			if (  ) {
				System.out.println();
		}
			System.out.print(mj.charAt(i));
		
		}
		}

		
//		for (int i = mj.length()-9; i <= mj.length()-2; i++) {
//			System.out.print(mj.charAt(i));
//		}
//		
//		System.out.println();
//		
//		for (int i =mj.length()-10; i <= mj.length()-3; i++) {
//			System.out.print(mj.charAt(i));
//		}
//		
//		System.out.println();
//		
//		for (int i =mj.length()-11; i <= mj.length()-4; i++) {
//			System.out.print(mj.charAt(i));
//		}
//		
//		System.out.println();
//		
//		for (int i =mj.length()-12; i <= mj.length()-5; i++) {
//			System.out.print(mj.charAt(i));
//		}
//		
//		System.out.println();
//		
//		for (int i =mj.length()-13; i <= mj.length()-6; i++) {
//			System.out.print(mj.charAt(i));
//		}
//		
//		System.out.println();
//		
//		for (int i = mj.length()-14; i <= mj.length()-7; i++) {
//			System.out.print(mj.charAt(i));
//		}
//		
//		System.out.println();
//		
	}

}



