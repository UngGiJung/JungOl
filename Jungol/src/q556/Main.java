package q556;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x [] = new int [10];
		
		//배열문
//		x [0] = 1;
//		x [1] = 2;
//		x [2] = 3;
//		x [3] = 4;
//		x [4] = 5;
//		x [5] = 6;
//		x [6] = 7;
//		x [7] = 8;
//		x [8] = 9;
//		x [9] = 10;
//		
//		System.out.print(x[0]+" ");
//		System.out.print(x[1]+" ");
//		System.out.print(x[2]+" ");
//		System.out.print(x[3]+" ");
//		System.out.print(x[4]+" ");
//		System.out.print(x[5]+" ");
//		System.out.print(x[6]+" ");
//		System.out.print(x[7]+" ");
//		System.out.print(x[8]+" ");
//		System.out.print(x[9]+" ");

		//for 반복문
		for (int i = 0; i < x.length; i++) {
			x[i] = i+1;
//			System.out.printf("%d",x[i]);
			
		//마지막 자리 '?' 가리기
			System.out.printf("%d", x[i]);
			if (i < x.length - 1) {
				System.out.printf("?");
			}
		}
	}

}
