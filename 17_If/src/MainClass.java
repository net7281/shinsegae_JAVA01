
public class MainClass {
	public static void main(String[] args) {
		/*
			조건문
			
			논리연산자 &&, || , !
			부등호 : > < >= <= == !=
			
			형식 : 
				if( 조건(true/false) ){
					처리
				}
				
		 */
		
		int number = 1;
		
		if(number == 1) {
			System.out.println("number는 1입니다.");
		}
		
		if( number > 0 && number < 10 && number != 5 ) {
			System.out.println("number는 0보다 크고 10보다 작다.");
		}
		
		if(number<5 || number>10) {
			System.out.println("number는 5보다 작거나 10보다 크다.");
		}
		if(true) {
			System.out.println("무조건 실행");
		}
		
		boolean b = true;
		if(b == true) {
			System.out.println("b는 참입니다.");
		}
		if(b) { //변수의 값이 논리형이라면 논리연산자 생략가능
			System.out.println("b는 참입니다.");
		}
		
		b = false;
		if(b == false) {
			System.out.println("b는 거짓입니다.");
		}
		if(!b) { //이것보단 위의 방식이 명시적
			System.out.println("b는 거짓입니다.");
		}
		
		
		String str = "hello";
		//String msg = "hello";
		String msg = "hell";
		msg += "o";
		
		String a = "";
		
		if(str == msg) { //왜 안나올까? >equals로 비교해야함
			System.out.println("같은 문자열입니다.");
		}
		if(str.equals(msg)) {
			System.out.println("같은 문자열입니다.");
		}
		if(str.length() >= 5) {
			System.out.println("str은 5개의 문자로 이루어져 있습니다.");
		}
		if(!str.equals("")) {
			System.out.println("str은 빈 문자열이 아닙니다.");
		}
		
		/*
			형식:
				if(조건){
					처리1
				}else{
					처리2
				}
		 */
		
		number = 5;
		
		if(number>5) {
			System.out.println("number는 5보다 크다");
		}else {
			System.out.println("number는 5보다 작거나 같다");
		}
		
		//삼항연산자와 비슷하다
		String s = (number > 5) ? "number는 5보다 크다" : "number는 5보다 작거나 같다";
		System.out.println(s);
		
		
		number = 92;
		
		if(number==100) {
			System.out.println("A+");
		}else if(number>=90) {
			System.out.println("A");
		}else if(number>=80) {
			System.out.println("B");
		}else {
			System.out.println("C or C이하");
		}
		
		
		//조건문 안에 조건문
		number = 86;
		
		if(number >= 85 && number < 90) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
		if(number >= 80 && number < 90) {
			if(number>=85) {
				System.out.println("합격입니다");
			}else {
				System.out.println("불합격입니다");
			}
		}
		
		
	}
}
