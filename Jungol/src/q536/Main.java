package q536;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. for문
		for(int i=1;i<=15;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. while문
		int j = 1;
		while (j < 16) {
			System.out.print(j++ + " ");
			//j++
		}
		System.out.println();
		
		
		
		// 3. do ~ while 문
		int k = 1;
		do {
			System.out.print(k++ + " ");
		}while(k < 16);
		
	}

}
