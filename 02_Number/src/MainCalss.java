
public class MainCalss {

	public static void main(String[] args) {
		/* 
		   	숫자(상수) : 정해진 숫자. 12, 45 ...
				2진수 : 0, 1
				8진수 : 0 ~ 7 -> 8 == 10 => 010
				10진수 : 0 ~ 9 
				16진수 : 0 ~ 9 A B C D E F(15) 앞에 0x 를 붙임 -> 0xf(15), 0xff(255) 
				
				2진수 > 16진수
				1010 1100
				8421 8421
				A    C    => 0xAC
				
				16진수 > 2진수
				0x F     3
				   1111  0011
				
			
			변수(variable) : 변경되는 수 
				별명을 작명해서 그 이름에 값을 넣는다.
				그릇(크기, 자료형)
				변수의 작명은 선택
				
				자료형 변수명;		<- 변수 선언
				변수명 = 값;		<- 대입
				
				int number;
				number = 155;
				
			
		*/
		
		//출력할때 10진수로 바껴서 출력된다
		System.out.println(010); //0이 앞에 붙으면 8진수
		System.out.println(0xAC); //0x이 앞에 붙으면 16진수
		//2진수는 안된다 ㅠㅠ
		
		int number;
		number = 123;
		System.out.println(number);
		
		int num;
		num = 325;
		System.out.println(num);
		
		number = num;
		System.out.println(number);
		
		//변수의 작명 규칙
		//가능하면 변수이름은 의미있는 단어로!~
		//대소문자 구분가능
		int a; int A; 
		
		//예약어는 변수로 쓸 수 없다 (이미 자바에 정의된 이름들)
		//int int; (X)
		
		//첫 글자가 숫자가 되면 안된다.
		//int 2aa; (X)
		//int aa2; (O)
		
		//상수만으로 이루어진 이름은 사용 불가
		//int 111; (X)
		
		//언더바를 붙인 변수는 사용가능, 하지만 -(마이너스) 는 불가능!
		//int _abc; (O)
		//int -abc; (X) <- 연산자는 불가능~
		
		int number_position_char;
		int numPosChar; //대문자로 구분 카멜기법 : 많이사용
		
		//너무 흔한 변수명은 피하는것이 좋다
		//ex) object, length, number, size...

		//한글로 변수이름 가능
		String 모루카;
		모루카 = "귀여웁니다.";
		System.out.println(모루카);

	}

}
