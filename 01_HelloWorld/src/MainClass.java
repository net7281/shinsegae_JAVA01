
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GUI
		
		
		//주석 : 컴파일되지 않는 문장 (ctrl + /)
		//코드의 설명이나 내용
		// <- 한줄 주석문
		/*
		 * <- 범위 주석문 (java, css, MySQL)
		 * python """ """
		 * html <!-- -->
		 * JSP <%-- --%>
		 * */  
		
		//println 은 함수
		System.out.println("Hello world");
//		System.out.println("안녕하세요");
		
		
		//코드 주석 편하게 하는법~~
		
		/* <- 이것만 지우면 바로 주석이 풀린다!
		 여기 코드!!
		/**/
		
		
		// 들여쓰기, 띄어쓰기 잘하자!!
		
		
		//ctrl + F11 실행 단축키
		
		// unix -> c언어 (절차지향) -> c++ (객체지향) -> java (어플쪽이 약함) -> c# (자동화기기) ->
		
		//c언어 : 절차지향 -> function(함수), 순서 중심 (유지보수가 안좋은.. 속도는 빠른)
		//java : 객체지향 -> class + function, 설계 중심
		
		//출력
		System.out.println("hello java");
		System.out.print("world ");
		System.out.print("welcome");
		
		//개행(줄바꿈)
		System.out.println();
		System.out.println("hi");
		
		System.out.println("문자열"); //쌍따옴표
		System.out.println('A'); //따옴표
		System.out.println('한');
		System.out.println('1');
		System.out.println(123); // 출력이 되는 순간~~ 문자열로 된다
		System.out.println(123 + 1); // 출력이 되는 순간~~ 문자열로 된다
		System.out.println("123" + 1); // 출력이 되는 순간~~ 문자열로 된다
		
		// printf -> format
		System.out.printf("%s", "안녕");
		System.out.printf("%d", 1024);
		System.out.printf("%c", 'a');
		System.out.printf("%f", 123.456);
		System.out.printf("%.2f", 123.456); //반올림됨
		
		// escape sequence
		// \n (개행)
		// \b (백스페이스)
		// \t (띄어쓰기)
		// \" : " 를 쓰고싶을때
		// \\ " \ 를 쓰고싶을때
		
		System.out.println();
		System.out.println("welcome to \nmy world\b");
		System.out.println("홍길동\t 95");
		System.out.println("춘향\t 10");
		System.out.println("일지매\t 90");
		System.out.println("\"나는 문제없어\" 라고 말했습니다.");
		System.out.println("\\^_^ 하이 반가워");
	}

}
