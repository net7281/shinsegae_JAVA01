
public class MainClass {
	public static void main(String[] args) {
		
		
		/*
		for : loop문, 순환문, 반복문
			  지정된 회수만큼 반복하는 제어문
			  
		형식 :
			for(초기화; 조건; 연산식){ //조건은 하나만!, 연산은 여러개가능!
				조건이 참일때 처리 (거짓이 될때까지)
			}
			
			//number가 10이 될때까지
			int number = 0;
			
			number++;
			number++;
			number++;
			number++;
			number++; ...
			
			
		순서 : 
			for(초기화(1); 조건(2)(5)(8); 연산식(4)(7)){
				처리(3)(6)(9)..
			}
			
		 */
		
		int n;
//		for(n=0; n<10; n++) {
//			System.out.println("n = "+n);
//		}
		
		for(n=1; n<=100; n++){
			System.out.print(n+" ");
		}
		
		for(int i=0; i<10; i++) {
			//for문 초기화에 선언한 i는 for문 안에서만 사용가능
			System.out.println("i = "+ i);
		}
		for(int i=10; i>0;i--) {
			System.out.println("i = "+ i);
		}
		
		//이렇게도 사용은 가능하지만! 이렇게 잘 사용하지않는다.
		int count = 0;
		for( ; count<10; ) {
			System.out.println("connt : " + count );
			count++;
		}
		
		//endless loop(무한루프) <-조심!
//		for(int i=0; ; i++) {
//			System.out.println("i = "+ i);
//		}
		
		//변수,연산식이 2개이상인 경우 -> 조건은 반드시 하나가 되어야한다!
		for(int i=0, j=0; i<10; i++, j+=2) {
			System.out.println("i:"+i+", j:"+j);
		}
		
		//1~10까지 합계를 구하라
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("1~10까지 합계 : "+sum);
		
		sum=0;
		count=1;
		for(int i=0; i<10; i++) {
			sum = sum + count;
			count++;
		}
		System.out.println("합계 : "+sum);
		
		//이중for문 (for문 안에 for문)
		for(int i=0; i<5;i++) {
			System.out.println("i="+i);
			for(int j=0; j<3; j++) {
				System.out.println("\tj="+j);
			}
		}
		
		//for + if 짝수만 출력하기
		for(int i=0; i<10; i++) {
			if(i%2 ==0) {
				System.out.print("i="+i+", ");
			}
		}
		
		//for + if + array
		int arr[] = {11,22,33,44,55};
		
		//for
		for(int i=0; i<arr.length; i++) {
			System.out.print( arr[i] + ", ");
		}
		
		//foreach
		for(int value : arr) {
			System.out.print( value + ", ");
		}
	}
}
