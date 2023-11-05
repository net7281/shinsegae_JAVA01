
public class MainClass {
	public static void main(String[] args) {
		//변수의 자료형(그릇) 종류
		
		//숫자형
		
		//정수
		byte by; 
		//1 byte == 8 bit -> 256개
		//127 ~ -128 까지 표현!
		//첫 바이트는 부호!!
		by = -128;
		System.out.println(by);
		
		short sh; //2 byte
		sh = 12345;
		System.out.println(sh);
		
		int i; //4 byte
		i = 12131231;
		System.out.println(i);
		
		long lo;
		lo = 12123121313211231L; //long 에 값을 넣을때는 L 을 마지막에 붙여야한다
		//컴파일 시 읽힘
		
		//소수
		float f;
		f = 123.123121f; //float 에 값을 넣을때는 f 를 마지막에 붙인다
		// 0. 에서 5번째 자리까지 나옴 > 오류가 있다
		
		double d;
		d = 123.123121312131;
		// 실무에서는 double을 많이 사용한다
		
		
		//문자형
		
		//문자
		char c;		// 2 byte (c언어는 1 byte) > 유니코드를 위헤 
		// character의 약자 ASCII code, unicode
		c = 'a';
		c = '한';
		c = '+';
		c = 'A';
		//c = 'ab' (X)
		System.out.println(c);
		
		//문자열
		//String == wrapper class
		//누군가 만들어놓은 함수
		String str; //제일 많이 쓰인다
		str = "hello";
		System.out.println(str);
		
		//논리형
		//(참/거짓) true/false
		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
	}
}
