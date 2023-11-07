
public class MainClass {
	public static void main(String[] args) {
		/*
			switch : 
				조건문에 해당한다.
				값이 명확해야 한다. (범위를 설정할 수 없다)
				소수값은 사용 불가
				
			형식 : 
				switch (변수){
					case 값1:  <--변수와 값1 이 같을때 (변수>값1 이렇게 못씀)
						처리1
						break;
					case 값2:
						처리1
						break;
					case 값3:
						처리1
						break;
					...
					default:  <-- else 와 같은 역할, 생략가능
						아무값과도 동일하지 않을때
						위의 처리가 되지 않은 경우
						break;
				}
			
		 */
		
		int number = 2;
		
		switch (number) {
		case 1: { //if(number == 1)
			System.out.println("number는 1입니다.");
			break;
		}
		case 2: { //if(number == 2)
			System.out.println("number는 2입니다.");
//			break;   //브레이크가 없다면 뒤의 case 까지 진행된다
		}
		case 3: { //if(number == 3)
			System.out.println("number는 3입니다.");
			break;
		}
		default: //else
			System.out.println("number는 ?입니다.");
			break; //크게의미는 없지만 붙이기
		}
		
		// < > <= ! 사용못함
		char c = '가';
		
//		switch (c) {
//			case '가'>:
//			case !'가':
//		}
		
		// 소수 사용못함
		double d = 123.1;
//		switch (d) {
//		}
		
		String str = "ABC"; //c언어에는 문자열 안됨
		switch (str) {
			case "ABC": {
				System.out.println("ABC~");
				break;
			}
		}
		
	}
}
