import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		//입력 >> 숫자+문자
		//암호화, 복호화 함수
		
		
		
		
		String src = input();
		String result = encode(src);
		String result2 = decode(result);
		
		System.out.println("src : "+src);
		System.out.println("암호화 : "+result);
		System.out.println("복호화 : "+result2);
		
		//2차원 > 1차원배열
		int arr[][] = {
				{1,552,43},
				{4,5,16}
		};
		
		int arrResult[] = ArrayToArray(arr);
		System.out.println(Arrays.toString(arrResult));
	}
	
	
	//입력
	static String input() {
		Scanner scanner = new Scanner(System.in);
		
		allLoop: while (true) {
			System.out.print("암호화 할 문자를 입력하세요 >> ");
			String str = scanner.next();
			
			for(int i=0; i<str.length(); i++) {
				if((str.charAt(i)<48 || str.charAt(i)>57) && (str.charAt(i)<97 || str.charAt(i)>122)) {
					System.out.println("잘못입력하셨습니다.");
					continue allLoop;
				}
			}
			return str;
		}
	}
	
	//암호화
	static String encode(String src) {
		// abcdefghijklmnopqrstuvwxyz - 26자
		char[] abcCode =
		{ '`','~','!','@','#','$','%','^','&','*', '(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String result ="";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			int chNum = (int)ch;
			if(chNum>=48 && chNum<=57) { //숫자일때
				result += numCode[chNum-48];
			}else if(chNum>=97 && chNum<=122) { //알파벳일때
				result += abcCode[chNum-97];
			}
		}
		return result;
	}
	
	static String decode(String src) {
		// abcdefghijklmnopqrstuvwxyz - 26자
		char[] abcCode =
		{ '`','~','!','@','#','$','%','^','&','*', '(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String result ="";
		
		//복호화
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			boolean flag = false;
			
			for(int j=0; j<abcCode.length;j++) {
				if(ch == abcCode[j]) {
					flag = true;
					result += (char)(j+97);
					break;
				}
			}
			if(!flag) {
				for(int j=0; j<numCode.length;j++) {
					if(ch == numCode[j]) {
						flag = true;
						result += (char)(j+48);
						break;
					}
				}
			}
		}
		return result;
	}
	
	static int[] ArrayToArray(int array2[][]) {
		int array[] = new int[ array2.length * array2[0].length ];
		int count = 0;
		
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j< array2[i].length; j++) {
				array[count] = array2[i][j];
				count++;
			}
		}
		
		return array;
	}
	
}
