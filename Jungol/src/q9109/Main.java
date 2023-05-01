package q9109;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//풀이 1
		Scanner sc = new Scanner (System.in);
//		String x = sc. nextLine();
//		sc.close();
//		
//		System.out.print(x);
		
		//풀이 2
		String str = "";
		while(true) {
//			char c = sc.next().charAt(0);
			String inp = sc. next();
			char c = inp.charAt(0);
			
			if(('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
				str += c;
			} else {
				break;
			
			}				
		}
		System.out.println(str);
		sc.close();
		
		
		
	}

}
