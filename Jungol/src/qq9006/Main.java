package qq9006;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("수를 출력할 때는 따옴표를 생략합니다.");
		System.out.println("123");
//		System.out.println("6.500000");
		
		double x = 6.500000;
		
		System.out.printf("%.3f\n",x);
	}
}

// printf 에서 %f = 는 실수 표현해줄때 쓰이는 명령어, 그리고 %f.3은 소숫점 3번째까지 표현하라는 명령어
// *printf는 표현방법에 서식을 걸때 쓰는 명령어임.