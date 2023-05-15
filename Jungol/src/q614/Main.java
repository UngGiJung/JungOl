package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
//		String scn = "Jejuelementary";
//		String cg = "6";
		
		Main2 s1 = new Main2("Jejuelementary",6); 
		Main2 s2 = new Main2(school,grade);
		Main2 s3 = new Main2();

		
		
		System.out.println(s1.grade + " grade in " + s1.school + " School ");
		System.out.println(s2.grade + " grade in " + s2.school + " School ");
		System.out.println(s3.grade + " grade in " + s3.school + " School ");
		
				
	}

}
 class Main2 {
	
	//필드
	int grade;
	String school;
	
	public Main2 (String b,int a) {
		grade = a;
		school = b;	
		
	}
	
	public Main2 () {	
		school = "Jejuelementary";
		grade = 6;
	}
}
