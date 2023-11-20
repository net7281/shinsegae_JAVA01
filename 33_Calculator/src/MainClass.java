import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		//선언부
		int numArr[] = new int[2];
		String oper = input(numArr);

		// calculator
		int result = calculator(numArr[0], numArr[1], oper);
		

		// print
		print(numArr[0], numArr[1], oper, result);
	}
	
	//입력
	static String input(int arr[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print("첫번째 수 = ");
			String numStr1 = sc.next();

			// 숫자인지 검사
			boolean isNum = isNum(numStr1);

			// 문자열 -> 숫자
			if(isNum) { // 정상적으로 숫자가 입력된 경우
				arr[0] = Integer.parseInt(numStr1);
				break;
			}

			System.out.println("정확히 숫자를 입력해 주십시오");
		}
		

		System.out.print("(+, -, *, /) = ");
		String oper = sc.next();

		System.out.print("두번째 수 = ");
		arr[1] = sc.nextInt();
		
		return oper;
	}
	
	//숫자 글자 판단
	static boolean isNum(String numStr) {
		for (int i = 0; i < numStr.length(); i++) {
			int n = numStr.charAt(i);
			if(n < 48 || n > 57) {
				return false;
			}
		}
		return true;
	}
	
	//계산기
	static int calculator(int num1, int num2, String oper) {
		int result = 0;
		
		switch(oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		
		return result;
	}
	
	static void print(int num1, int num2, String oper, int result) {
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
	}
	
}
