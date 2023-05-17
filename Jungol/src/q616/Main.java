package q616;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();	
		double x3 = sc.nextInt();
		double y3 = sc.nextInt();
		
//		System.out.printf("(%.1f, %.1f)",(x1+x2+x3)/3,(y1+y2+y3)/3);
				
		//호출
		Main2 o = new Main2(x1,y1,x2,y2,x3,y3);

		System.out.printf("(%.1f, %.1f)",(o.q + o.e + o.t)/3,( o.w + o.r + o.y)/3);
		sc.close();
		
	}

}

class Main2 {
	
	
	//필드
	double q;
	double w;
	double e;
	double r;
	double t;
	double y;

	
	
	//생성자
	Main2(double z, double x, double c, double v, double b, double n){
		 q = z;
		 w = x;
		 e = c;
		 r = v;
		 t = b;
		 y = n;

	}
	
}
