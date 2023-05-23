package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//내풀이
//		Scanner sc = new Scanner(System.in);
//		int n1[] = new int[10];
//		int max = 0;
//		int n2[] = new int[10];
//		int n3[] = new int[10];
//
//		for (int i = 0; i <= n1.length; i++) {
//			n1[i] = sc.nextInt();
//			
//			
//			if (max <= n1[i]) {
//				n2[i] = max;
//				max = n1[i];
//			} else {
//				n3[i] = max;
//			}
//			for (int j = n1.length-1; j <= 0; j--) {
//				System.out.print(j + " ");
//			}
//		}
//	}
//}

		
		//강사님 풀이
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		System.out.println();

		for (int j = 0; j < ar.length; j++) {
			int max = Integer.MIN_VALUE;
			int idx = 0;
			for (int i = 0; i < ar.length; i++) {
				if (max < ar[i]) {
					max = ar[i];
					idx = i;
				}
			}
			System.out.print(max + " : ");
			ar[idx] = -1;

//			for (int k = 0; k < ar.length; k++) {
//				System.out.print(ar[k] + " ");
//			}
//			System.out.println();
		}
	}
}




	//병권이형 풀이

//Scanner sc= new Scanner(System.in);
//int num[]=new int[10];
//int temp=0;
//
//
//for(int i =0; i<num.length;i++) {
//   num[i]=sc.nextInt();
//}
//sc.close();
//for(int i=0;i<num.length;i++) {
//   for(int j=0;j<num.length;j++) {
//      if(num[i]>=num[j]) {
//         temp=num[i];
//         num[i]=num[j];
//         num[j]=temp;
//      }
//   }
//}
//for(int i=0;i<num.length;i++) {
//   System.out.print(num[i]+" ");
//}
//
//}
//
//}