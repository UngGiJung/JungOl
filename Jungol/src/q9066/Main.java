package q9066;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			//우철이 풀이
//	      char alphabet[] = new char[26];
//	      
//	      for (int i = 0; i < alphabet.length; i++) {
//	         alphabet[i] = (char) (i+65);
//	      }
//	      for (int i = alphabet.length-1; i >= 0; i--) {
//	         System.out.print(alphabet[i] + " ");
//	      }
//	      
//	   }
//	}

		char a[] = new char[25];

		for (int i = 0; i <= 1; i++) {
			for (char j = 65; j <= 90; j++) {
				a[i] = j;
				System.out.print(a[i] + " ");
				for (int b = 25; b >= 0; b--) {
					System.out.print(a[b] + " ");
				}
			}
		}
	}
}
