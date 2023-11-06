
public class MainClass {
	public static void main(String[] args) {
		/*
			기본문법 (절차지향)
			
			함수(function)화
			
			객체(object)화
			변수 + 함수(기능) => 클래스
			
			Wrapper class
			일반자료형(char, int ...)들을 클래스화 해 놓은 것
			String
			
			일반자료형		Wrapper class
			--------------------------------
			boolean		Boolean
			
			byte		Byte
			short		Short
			int			Integer		*
			long		Long
			
			float		Float
			double		Double		*
			
			char		Character
			chat[]		String		*
			
		 */
		
		
		// Wrapper class = 일반변수 + '기능'
		Integer iobj = 123;
		System.out.println(iobj);
		
		iobj = iobj * 2;
		System.out.println(iobj);
		
		// 숫자 -> 문자열
		// valueOf
//		String str = iobj + "";
		String str = iobj.toString();
		System.out.println(str);
		
		//문자열 -> 숫자
		String strNum = "2345";
		int number = Integer.parseInt(strNum);
		System.out.println(number*2);
		
		String strD = "123.4567";
		double dNum = Double.parseDouble(strD);
		System.out.println(dNum);
		
		
		int i = 127;
		//10진수를 2진수로
//		String binary = Integer.toBinaryString(i);
		String binary = Integer.toString(i,2);
		System.out.printf("10진수를 2진수로 %d -> %s\n",i, binary);
		
		//2진수를 10진수로
		int dec1 = Integer.parseInt(binary,2);
		System.out.printf("2진수를 10진수로 %s -> %d\n",binary, dec1);
		
		//10진수를 16진수로
//		String hex = Integer.toHexString(i); 
		String hex = Integer.toString(i,16); 
		System.out.printf("10진수를 16진수로 %d -> 0x%s\n",i, hex);
		
		//16진수를 10진수로
		int dec2 = Integer.parseInt(hex,16);
		System.out.printf("16진수를 10진수로 0x%s -> %d\n",hex, dec2);
	}	
}
