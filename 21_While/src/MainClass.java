
public class MainClass {
	public static void main(String[] args) {
		/*
			while : 루프
			do while
			
			형식:
				(루프용)변수 선언
				변수 초기화
				while(조건){
					처리
					연산식
				}
				
				(루프용)변수 선언
				변수 초기화
				do{
					처리
					연산식
				}while(조건); //세미콜론 필수
				
				
				조건이 안맞을 경우!
				while문은 한번도 처리x
				do while문은 맨처음 단 한번 처리
				
				
				initialize(초기화)
				loop(main)-while
				release(해방)
		 */
		
		int w;
		w = 0;//초기화
		while (w < 10) { //조건식
			System.out.println("w="+w);
			w++; //연산식
		}
		
		int w1=0, w2=0;
		//이 경우 안의 while문은 1번만 돈다! : 이유 초기화가 밖에있어서!!!
		while (w1<5) {
			System.out.println("w1="+w1);
			while (w2<3) { //초기화가 없다!
				System.out.println("\tw2="+w2);
				w2++;
			}
			w1++;
		}
		
		w=0;
		do {
			w++;
			System.out.println("w="+w);
		}while(w<10);
		
		//무한루프
		while(true) {
			System.out.println("무한이지롱");
		}
	}
}
