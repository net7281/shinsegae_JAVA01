import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws IOException {
		/*
			input -> console
			출력 = println(변수, 값) < 값을 바로 출력가능
			
			입력 = 입력을 받은 값을 '변수'에 저장을 해야한다!
		*/
		
		int number = 123;
		System.out.println(number + " " + 121);
		
		//스캐너 모듈 추가! import
		Scanner sc = new Scanner(System.in);
		
		//boolean
//		boolean b;
//		System.out.print("b = ");
//		b = sc.nextBoolean();
//		System.out.println(b);
		
		//int
//		int age;
//		System.out.print("당신의 나이는? : ");
//		age = sc.nextInt();
//		System.out.println(age);
		
		
		//double
//		double height;
//		System.out.print("당신의 키는? : ");
//		height = sc.nextDouble();
//		System.out.println(height);
		
		//String
//		String name;
//		System.out.print("당신의 이름은? : ");
//		name = sc.next();
//		System.out.println(name);
		//문자열 입력 시 NUL문자(띄어쓰기)를 받을 수 없다
		//ex) 나는 정현정 입니다. >> 나는
		
		//띄어쓰기가 포함된 문장일때는~
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String address;
		System.out.print("주소는 ? : ");
		address = br.readLine();
		System.out.println(address);
	}
}
