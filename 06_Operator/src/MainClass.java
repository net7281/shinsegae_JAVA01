
public class MainClass {

	public static void main(String[] args) {
		// 연산자
		// + - * / %
		// / : 몫, % : 나머지
		
		int num1, num2;
		int result;
		
		num1 = 25;
		num2 = 7;
		
		result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " +  result);
		System.out.println(num1 + " * " + num2 + " = " +  (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " +  (num1/num2));
		System.out.println(num1 + " % " + num2 + " = " +  (num1%num2));
		
		
		//주의점
		num1 = 3;
		num2 = 0;
		//result = num1/num2; (X)
		//result = num1%num2; (X)
		//분모가 0 이 들어오면 에러!!! > 이 상황을 대처해야한다!
		
		
		//자기자신(변수)의 값을 갱신할 수 있다.
		int number = 1;
		number = number + 1;
		System.out.println(number);
		
		number += 1;
		System.out.println(number);
		
		// increment(증가) ++, decrement(감소) --
		number++; //number = number + 1;
		++number; //number = number + 1;
		System.out.println(number);
		
		number--; //number = number - 1;
		--number; //number = number - 1;
		System.out.println(number);
		
		//주의점
		//일반 연산자와 ++을 같이 사용하는 경우
		number = 1;
		int tag;
		tag = number++;
		//이 경우 !!
		/*
			1. tag = number; 실행
			2. number++ 실행 (number = number + 1)
			결과 tag = 1; number = 2;
		*/
		
		//이 경우도!!! tag = 1; number = 2;
		tag = (number++);
		
	}

}
