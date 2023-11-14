
public class MainClass {
	public static void main(String[] args) {
		
		//과제33
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("sum="+sum);
		
		
		//과제34
//		int[][] arr = {
//				{ 5, 5, 5, 5, 5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				};
//		int total = 0;
//		float average = 0;
//		int count = 0;
//
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				total += arr[i][j];
//				count++;
//			}
//		}
//		average = (float)total/count;
//		System.out.println("totat="+total);
//		System.out.println("average="+average);
		
		
		//과제35
		
		// abcdefghijklmnopqrstuvwxyz - 26자
		char[] abcCode =
		{ '`','~','!','@','#','$','%','^','&','*', '(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		
		String src = "abc123";
		String result = "";
		String result2 = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			int chNum = (int)ch;
			if(chNum>=48 && chNum<=57) { //숫자일때
				result += numCode[chNum-48];
			}else if(chNum>=97 && chNum<=122) { //알파벳일때
				result += abcCode[chNum-97];
			}
//			int chNum = ((int)ch) - 97;
//			result += abcCode[chNum];
		}
		System.out.println((int)'a' + " "+ (int)'z');
		System.out.println((int)'0' + " "+ (int)'9');
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		//복호화
		for(int i=0; i < result.length();i++) {
			char ch = result.charAt(i);
			boolean flag = false;
			
			for(int j=0; j<abcCode.length;j++) {
				if(ch == abcCode[j]) {
					flag = true;
					result2 += (char)(j+97);
					break;
				}
			}
			if(!flag) {
				for(int j=0; j<numCode.length;j++) {
					if(ch == numCode[j]) {
						flag = true;
						result2 += (char)(j+48);
						break;
					}
				}
			}
		}
		System.out.println("result2:"+result2);
		
		
	}
}
