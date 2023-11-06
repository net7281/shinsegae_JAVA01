
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			bit operator
			lower 
			
			처리속도가 빠르다
			bit : 0(false), 1(true)
			
			&	AND
			|	OR
			^	XOR   << 중요, 보안적부분
			<<	Left Shift
			>>	Right Shift
			~	NOT
			
			1100 1010
			C	 A
			
			1248 0000
			1111 0000
			F	 0
			
			
		 */
		
		/*
			AND 연산 : 둘다 참이여야지 참
			1  0 1
			0  0 0 
			   0 1
			
			1100 1010
			1111 0000
			---------
			1100 0000
			C    0 = 192
		 */
		
		int result = 0xCA & 0xF0;
		System.out.println(result);
		System.out.printf("0x%x\n", result); // 16진수로 보는 법
		
		/*
			OR 연산 : 둘중 하나만 참이면 참
			1  1 1
			0  0 1 
			   0 1
			
			1100 1010
			1111 0000
			---------
			1111 1010
			F    A = 250
		*/
		result = 0xCA | 0xF0;
		System.out.println(result);
		System.out.printf("0x%x\n", result);
		
		
		/*
			XOR 연산 : 두 비트가 서로 다를 떄는 1 동일할때 0
			1  1 0
			0  0 1 
			   0 1
			
			1100 1010
			1111 0000
			---------
			0011 1010
			3    A = 250
			
			
			
			1100 1010 (중요데이터)
			1111 0000 (키)
			---------
			0011 1010 > 결과값 (암호화)
			1111 0000 > 다시 연산 (키 값 대입)
			---------
			1100 1010 : 원상복귀!! (복호화)
			
			* 암호화를 할때 많이 쓰인다
			
	 	*/
		result = 0xCA ^ 0xF0;
		System.out.println(result);
		System.out.printf("0x%x\n", result);
		
		// Left Shift  = *2
		byte by1;
		by1 = 0x1 << 1; //1칸밀기
		System.out.println(by1);
		by1 = 0x1 << 2; //2칸밀기
		System.out.println(by1);
		by1 = 0x1 << 3; //3칸밀기
		System.out.println(by1);
		
		by1 = 0x38 << 1; //0x38 = 56
		System.out.println(by1); //112
		
		// Right Shift = /2
		by1 = 0x38 >> 1; //0x38 = 56
		System.out.println(by1); //28
		
		// NOT ~	0 -> 1 ,  1 -> 0
		byte by2 = ~0x2a; 
		// 0010 1010 -> 1101 0101 (D5)
		System.out.printf("0x%x\n", by2);
		
		
	}

}
