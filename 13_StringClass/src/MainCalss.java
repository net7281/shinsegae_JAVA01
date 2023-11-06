
public class MainCalss {
	public static void main(String[] args) {
		/*
			String :
				wrapper class
				문자열을 저장, 편집, 정보취득
			
			객체는 동적할당을 해야 사용가능 => 클래스명 변수 = new 클래스명();
			String은 wrapper class이므로 생략가능!
		 */
		
		String str;
		// String == 클래스명, str == 객체(object) == class의 변수
		str = "안녕하세요";
		System.out.println(str);
		
		//정석
		String str1 = new String();
		str1 = "반갑습니다";
		
		//문자열의 길이
		//length(); > 바이트와는 다름, 1글자 2바이트
		System.out.println(str1.length());
		
		
		//문자열 합치기
//		String strConcat = str.concat(str1);
		String strConcat = str + str1;
		System.out.println(strConcat);
		
		//비교함수
		String strA = "hello";
		String strB = "hello";
		
		boolean b = strA.equals(strB);
		System.out.println(b);
		
		//지정문자의 위치 : 0부터 시작
		String str5="안녕하세요 반갑습니다";
		System.out.println(str5.length());//11 -> 빈문자열도 카운트
		
		int num = str5.indexOf("하"); //하 를 찾아서 위치를 출력
		System.out.println(num);
		
		//문자열의 수정
		//replace
		String str6 = "A*B**C";
		String str7 = str6.replace("*", "+");
		//String str7 = str6.replace("*", ""); <-삭제를 원할때
		System.out.println(str7);
		
		//문자열 자르기
		/*
			split : token을 기준으로 문자열을 자를 수 있다.
			hello-my-world -> '-' 토큰
			
			홍길동-24-부산시
			성진-22-서울특별시
			
			홍길동
			24
			부산시
		 */
		String str8 = "홍길동-24-2001/10/12-182.2";
		String splitArr[] = str8.split("-");
		
//		System.out.println(splitArr[0]);
//		System.out.println(splitArr[1]);
//		System.out.println(splitArr[2]);
//		System.out.println(splitArr[3]);
		
		for(String a : splitArr) {
			System.out.println(a);
		}
		
		
		//범위 문자열 자르기
		//substring
		String str9 = "하이 반갑습니다";
		String str10 = str9.substring(0, 2);
		//                         여기부터 여기'전'까지!!
		String str11 = str9.substring(3, 5);
		
		//시작위치만 적으면 시작부터 끝까지!!
		String str12 = str9.substring(3);
		
		System.out.println(str10);
		System.out.println(str11);
		System.out.println(str12);
		
		//대문자, 소문자 (모두)변경
		//to
		String str13 = "abCdEF";
		String upper = str13.toUpperCase();//대문자로
		String lower = str13.toLowerCase();//소문자로
		System.out.println(upper + " " + lower);
		
		//앞뒤 공백을 제거하기
		//trim
		String str14 = "           나는 테디가 좋아요  ";
		String str15 = str14.trim();
		System.out.println(str15);
		
		//탐색 contains : 문자열이 있는지 없는지 boolean형으로 출력
		String str16 = "부산시 수영구";
		boolean b1 = str16.contains("수영");
		System.out.println(b1);
		
		//charAt : 한글자만 가져오기
		String str17 ="hello";
		char c = str17.charAt(1);
		System.out.println(c);
	}
}
