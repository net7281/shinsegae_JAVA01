import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		//과제19
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("영문자를 입력하세요 : ");
		
		//한글자의 경우
//		char enChar = scanner.next().charAt(0);
//		if(Character.isUpperCase(enChar) == true) {
//			enChar = Character.toLowerCase(enChar);
//		}else {
//			enChar = Character.toUpperCase(enChar);
//		}
//		System.out.println(enChar);
		
		//단어일 경우
//		String text = scanner.next();
//		String result = "";
//		for(int i=0; i<text.length();i++) {
//			char oneLetter = text.charAt(i);
//			if(Character.isUpperCase(oneLetter) == true) {
//				oneLetter = Character.toLowerCase(oneLetter);
//			}else {
//				oneLetter = Character.toUpperCase(oneLetter);
//			}
//			result += oneLetter;
//		}
//		System.out.println(result);
		
		//선생님의 풀이 : 아스키코드 사용
		String str = scanner.next();
		char c= str.charAt(0);
		System.out.print(c+" -> ");
		
		// 대문자/소문자 판정
		int charNum = (int)c;
		System.out.print("아스키코드="+charNum);
		
		int upper = 0;
		if(charNum >= 65 && charNum <= 90) { //대문자
			upper=1;
		}else if(charNum >= 97 && charNum <= 122) { //소문자
			upper=2;
		}else {
			upper=3;
		}
		
		//32 = 대문자 아스키코드와 소문자 아스키코드의 차이
		switch (upper) {
		case 1: //대문자 -> 소문자
			charNum = charNum + 32;
			System.out.println(" -> "+(char)charNum);
			break;
		case 2: //소문자 -> 대문자
			charNum = charNum - 32;
			System.out.println(" -> "+(char)charNum);
			break;
		default:
			System.out.println(" -> 영문자가 아닙니다");
			break;
		}
		
		
		//과제20
		int sum =0;
		for(int i = 1; i<=20; i++) {
			if(i%2 != 0 && i%3 != 0) {
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
		
		
		//선생님풀이
		sum =0;
		for(int i=1; i<=20; i++) {
			if(i%2 == 0 || i%3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		
		//과제21
		
		int n = 10; // 피보나치 수열의 길이 (원하는 항 수)
        
        int a = 1; // 첫 번째 항
        int b = 1; // 두 번째 항

        System.out.println("피보나치 수열 (첫 " + n + "항):");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int fiboSum = a + b;
            a = b;
            b = fiboSum;
        }
        
        System.out.println();
		
		int len = 100;
		
		long fiboSum=0L;
		long pre=1L, next=1L;
		
		for(int i=1; i<=len;i++) {
			System.out.print(pre+ " ");
			long tmp = (next + pre);
			pre = next;
			next = tmp;
			fiboSum += pre;
		}
		System.out.println("\n총합="+fiboSum);
		
		//선생님 풀이
		// 0 1 1 2 3 5 8 13 24 34
		// a b c
		//   a b c
		//     a b c
		
		long a1,b1,cc;
		long arr[] =new long[100];
		
		a1=0;
		b1=1;
		
		arr[0] = a1;
		arr[1] = b1;
		
		int w=0;
		
		while (w<98) {
			cc = a1+b1;
			arr[2+w] = cc;
			
			a1=b1;
			b1=cc;
			
			w++;
		}
		System.out.println(arr[99]);
	}
}
