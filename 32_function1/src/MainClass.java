import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		/*
			function:	함수
						처리자(processor)
			목적 :
				코드의 간략화
				동일한 처리 코드를 집약적으로 설정
	
				
			형식 :					매개변수(parameter)=인수=인자
				return값의변수형 함수명(자료형 가상인수이름, 자료형 가상인수이름){
					처리
					return 값;
				}
				
				return 값이 없는 경우 : void (return을 가질수도 있다)
				
		 */
		
//		function();
//		functionOne(5);
//		functionTwo("안녕", 123.456);;
//		double d1 = functionThree();
//		int a = functionFour('a');
		
		int array[] = {1,2,3};
		
		//return 받지 않고 함수만 실행
		functionFive(array);
		//그런대두 값은 functionFive의 연산은 적용된다
		//array의 주소값이 전달되어서 가기때문에~
		
		System.out.println(Arrays.toString(array));
		
		
		
		//value의 의한 할당
		int number = 1;
		functionValue(number);
		System.out.println("number : "+number);
		
		//address의 의한 할당
		int arr[] = {1};
		functionAddress(arr);
		System.out.println("arr : "+ Arrays.toString(arr));
		
		
		char arrChar[] = {'h','e','l','l','o'};
		UpperChar(arrChar);
		System.out.println(Arrays.toString(arrChar));
		
	}
	
	static void function() {
		System.out.println("function() 호출");
	}
	
	static void functionOne(int n) {
		System.out.println("functionOne(int n) 호출");
		System.out.println("외부 매개변수를 통해서 전달된 값 : "+n);
	}
	static void functionTwo(String str, double d) {
		System.out.println("functionTwo(String str, double d) 호출");
		System.out.println("str : "+str + " / d : " + d);
	}
	static double functionThree() {
		System.out.println("functionThree() 호출");
		return 456.545;
	}
	static int functionFour(char c) {
		System.out.println("functionFour(char c) 호출");
		System.out.println("c :" + c);
		return 33;
	}
	
	static int[] functionFive(int arr[]) {
		System.out.println("functionFive(int arr[]) 호출");
		for(int i =0; i<arr.length;i++) {
			arr[i] = arr[i] * 2;
		}
		return arr;
	}
	
	static void functionValue(int num) {
		System.out.println("functionValue(int num) 호출");
		num = 2;
		System.out.println("함수 안의 number : "+num);
	}
	static void functionAddress(int num[]) {
		System.out.println("functionAddress(int num[]) 호출");
		num[0] = 2;
		System.out.println(Arrays.toString(num));
	}
	
	static void UpperChar(char arrChar[]) {
		System.out.println("UpperChar(char arrChar[]) 호출");
		for(int i=0; i<arrChar.length; i++) {
			int asc = arrChar[i];
			asc = asc - 32;
			arrChar[i] = (char)asc;
		}
	}
	
}
