package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int count = 1;
		String mj = sc.nextLine();
//		//System.out.println(mj);
//		
//		String [] array = mj.split(" ");
//		
//		for (int i = 0; i < array.length; i++) {
//			count++;
//		}
//		sc.close();
//		System.out.println(count);
//		
//	}
//}

		for (int i = 0; i < mj.length(); i++) {
			if (mj.charAt(i) == ' ') {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}
}
