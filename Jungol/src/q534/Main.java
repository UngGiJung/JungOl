package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		char en = sc.next().charAt(0);
		String en =	sc.next();	
		sc.close();
		
		
		//if , else 문으로 풀기
//		if (en == 'A') {
//			System.out.println("Excellent");
//		} else if (en == 'B') {
//			System.out.println("Good");
//		} else if (en == 'C') {
//			System.out.println("Usually");
//		} else if (en == 'D') {
//			System.out.println("Effort");
//		} else if (en == 'F') {
//			System.out.println("Failure");
//		} else {
//			System.out.println("error");
//		}
		
		
		//switch, case 문으로 풀기 (char 타입)
//		switch (en) {
//		case 'A' :
//			System.out.println("Excellent");
//			break;
//		case 'B' :
//			System.out.println("Good");
//			break;
//		case 'C' :
//			System.out.println("Usually");
//			break;
//		case 'D' :
//			System.out.println("Effort");
//			break;
//		case 'F' :
//			System.out.println("Failure");
//			break;
//		default :
//			System.out.println("error");
//		}
		
		//switch, case 문으로 풀기 (String 타입)
		switch (en) {
		case "A" :
			System.out.println("Excellent");
			break;
		case "B" :
			System.out.println("Good");
			break;
		case "C" :
			System.out.println("Usually");
			break;
		case "D" :
			System.out.println("Effort");
			break;
		case "F" :
			System.out.println("Failure");
			break;
		default :
			System.out.println("error");
		}
		
	}

}
