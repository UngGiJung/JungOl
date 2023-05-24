package q195;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String q = sc.next();
		String w = sc.next();
		String e = sc.next();

		MainExample info = new MainExample();
		info.person(q, w, e);

		sc.close();
		System.out.println("name : " + info.name);
		System.out.println("tel : " + info.tel);
		System.out.println("addr : " + info.addr);

	}

}

class MainExample {
	String name;
	String tel;
	String addr;

	void person(String a, String b, String c) {
			name = a;
			tel = b;
			addr = c;
	}
}