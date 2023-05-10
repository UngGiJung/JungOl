package q595;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//스트링 배열 사용
//		String [] x = { "H","o","n","g"," ","G","i","l"," ","D","o","n","g"};
//				
//		System.out.print(x[3]);
//		System.out.print(x[4]);
//		System.out.print(x[5]);
//		System.out.println(x[6]);
		
        //서브 스트링 함수 사용
//	 	System.out.println(x.substring(3,7));
		
		String x = "Hong Gil Dong";
		for (int i = 3; i <= 6; i++) {    
			System.out.print(x.charAt(i));
		}
	}
}
