import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		//과제 8
		int number =5;
		System.out.println(Integer.toString(number, 2));
		
		number = number<<4; //1번 시프트에 두배씩 커짐! (((5*2)*2)*2)*2
		System.out.println(Integer.toString(number, 2) + " / " + number);
		
		number = number>>3; // (((80/2)/2)/2
		System.out.println(Integer.toString(number, 2) + " / " + number);
		
		number = number<<1; //10*2
		System.out.println(Integer.toString(number, 2) + " / " + number);
		
		
		//과제 9
		byte num1,num2;
		
		//num1 = 128;
		//num2 = 56;
		
		//16진수로 바꾸기
		num1 = 0X7F;
		num2 = 0X38;
		
		num1 = (byte) ((num1 & num2) | (num1 & num2));
			/*  1000 0000		1000 0000
				0011 1000		0011 1000
				0000 0000		0000 0000
			*/
		
		byte a = (byte) ~(num1 ^ num2);
			/*  0111 1111
				0011 1000
				0100 0111 -> xor :71
				1011 1000 -> not :-72
				8421 8421
				b8
			 */
		System.out.printf("num1=%x, num2=%x\n",num1,num2);
		System.out.printf("num1=%d, num2=%d\n",num1,num2);
		System.out.println(a);
		
		//과제 10
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("수를 입력해주세요 : ");
//		int input = scanner.nextInt();
//		
//		String output = input>=0 ? "양수입니다" : "음수입니다";
//		System.out.println(output);
		
		//과제 11
		
		//0~99 / 1개
		int num = (int)(Math.random()*100);
		System.out.println(num);
		
		//11~15 / 1개
		num = (int)(Math.random()*5)+11;
		System.out.println(num);
		
		//1~45 / 6개
		//arr로 하는방법도잇음
		for(int i=0;i<6;i++) {
			num = (int)(Math.random()*45)+1;
			System.out.print(num+" ");
		}
	}
}
