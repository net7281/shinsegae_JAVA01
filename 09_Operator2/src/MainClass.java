
public class MainClass {

	public static void main(String[] args) {
		//논리 연산자(true/false)
		/*
			&&	and		a 그리고 b
			||	or		a 또는 b
			!	not		...아닌
			
			제어문과 같이 사용하는 경우가 많다.
			(if, while)
			
			> < >= <= == 비교 연산자
		*/
		
		int number = 0;
		// AND
		/*
			false false => false
			false true => false
			true false => false
			true true => true
			둘다 참이 되어야한다
		*/
		System.out.println(number >= 0 && number < 10);
		System.out.println(number > 0 && number < 10);
		
		// OR
		/*
			false false => false
			false true => true
			true false => true
			true true => true
			둘중 하나만 참이 되어도 된다
		*/
		System.out.println(number > 0 || number < 10);
		System.out.println(number > 0 || number > 10);
		
		// NOT
		/*
			true => false
			false => true
		*/
		System.out.println(number == 0);
		System.out.println(number != 10);
		System.out.println(number != 0);
		
		//둘은 동일한 식으로 위의 식으로 사용하지 말고, 밑으로 바꿔서쓰는게 좋다
		System.out.println(!(number > -5 && number < 0));
		System.out.println(number <= -5 || number >= 0);
		
		//부등호는 ! 안된다
		//System.out.println(number <! -5); (X)
		System.out.println(!(number < -5)); //왠만하면.. 부호를 >=로 바꿔서 쓰자!
		
		
		// 삼항연산자 (항이 3개라 삼항연산자)
		/*
			조건에 따라서 값을 대입
			값 = (조건) ? "값1" : "값2"
		*/
		char c;
		c = (number > 0) ? 'Y' : 'N';
		System.out.println("c : " + c);
		
		int n;
		n = (number % 2 == 0 ) ? 2 : 1;
		System.out.println("n : " + n);
		
		String answer;
		answer = (number >=3) ? "3보다 크거나 같다" : "3보다 작다";
		System.out.println(answer);
		
		
		int a =5;
		int b =8;
		System.out.println("스왑 전 - a : " + a + ", b : " + b);
		
		b = swap(a,a=b);
		System.out.println("스왑 후 - a : " + a + ", b : " + b);
		
	}
	
	public static int swap(int a, int b) {
		return a;
	}
	
}
