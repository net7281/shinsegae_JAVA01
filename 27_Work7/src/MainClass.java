import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		//과제22
//		int arr[] = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
//			arr[i] = scanner.nextInt();
//		}
		
//		Arrays.sort(arr);
//		System.out.println("최소값 = "+arr[0]+", 최대값 = "+arr[9]);
		
//		for(int i = 0; i<(arr.length-1);i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int n : arr) {
//			System.out.print(n + " ");
//		}
//		System.out.println("\n최소값 = "+arr[0]+", 최대값 = "+arr[9]);
		
		
		//선생님 풀이
//		int max = arr[0];
//		for(int i=1; i<arr.length;i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//				//max 보다 큰값으로 갱신
//			}
//		}
//		System.out.println("최대값 : " + max);
//		
//		int min = arr[0];
//		for(int i=1; i<arr.length;i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//				//min 보다 작은값으로 갱신
//			}
//		}
//		System.out.println("최소값 : " + min);
		
		//과제23 : 2차원배열
//		int score[][] = new int[5][3];
//		double avg[] = new double[5];
//		
//		String title[] = {"국어","영어","수학"};
//		
//		for(int i = 0; i<score.length; i++) {
//			System.out.print((i+1) + "학생의 국어 성적을 입력해주세요 >> ");
//			score[i][0] = scanner.nextInt();
//			System.out.print((i+1) + "학생의 수학 성적을 입력해주세요 >> ");
//			score[i][1] = scanner.nextInt();
//			System.out.print((i+1) + "학생의 영어 성적을 입력해주세요 >> ");
//			score[i][2] = scanner.nextInt();
			
//			for(int j = 0; j<score[i].length; j++) {
//				String subject = "";
//				if(j == 0) subject = "국어";
//				else if(j == 1) subject = "수학";
//				else if(j == 2) subject = "영어";
//				System.out.print((i+1) + "학생의 "+subject+" 성적을 입력해주세요 >> ");
//				score[i][j] = scanner.nextInt();
//			}
//			System.out.println();
			
			//선생님 풀이
			
			//1번방법
//			System.out.print((i+1) + "학생의 국어 성적을 입력해주세요 >> ");
//			int lang = scanner.nextInt();
//			System.out.print((i+1) + "학생의 수학 성적을 입력해주세요 >> ");
//			int math = scanner.nextInt();
//			System.out.print((i+1) + "학생의 영어 성적을 입력해주세요 >> ");
//			int eng = scanner.nextInt();
//			
//			score[i][0] =lang;
//			score[i][1] =math;
//			score[i][2] =eng;
			
			//2번방법
//			for(int j = 0;j<title.length;j++) {
//				System.out.print((i+1) + "학생의 "+title[j]+" 성적을 입력해주세요 >> ");
//				int chap = scanner.nextInt();
//				score[i][j] = chap;
//			}
//		}
//		System.out.println();
//		
//		for(int i = 0; i<score.length; i++) {
//			int average = 0 ;
//			for(int j = 0; j<score[i].length; j++) {
//				average += score[i][j];
//			}
//			average = average/3;
//			System.out.print((i+1) + "학생의 평균점수는 "+average);
//			
//			if(average>=80) {
//				System.out.println(" -합격-");
//			}else if(average<=60) {
//				System.out.println(" -불합격-");
//			}else {
//				System.out.println();
//			}
//		}
		
		//선생님 풀이
		//1번방법
//		for(int i = 0; i<score.length; i++) {
//			int sum = score[i][0] + score[i][1] + score[i][2];
//			avg[i] = (double)sum / score[i].length;
//			
//			if(avg[i] >= 80) {
//				System.out.println((i+1) + "번 학생은 합격입니다.");
//			}else if(avg[i] < 60) {
//				System.out.println((i+1) + "번 학생은 불합격입니다.");
//			}else {
//				System.out.println((i+1) + "번 학생은 재시험입니다.");
//			}
//		}
		//평균 점수 구하기
//		for(int i = 0; i<score.length; i++) {
//			int chapSum = 0;
//			for(int j=0; j< score[i].length;j++) {
//				chapSum += score[i][j];
//			}
//			avg[i] = (double)chapSum / score[i].length;
//		}
//		//합격 불합격 판정
//		for(int i = 0; i<avg.length; i++) {
//			System.out.printf("평균점수 : %.2f - ",avg[i]);
//			if(avg[i] >= 80) {
//				System.out.println((i+1) + "번 학생은 합격입니다.");
//			}else if(avg[i] < 60) {
//				System.out.println((i+1) + "번 학생은 불합격입니다.");
//			}else {
//				System.out.println((i+1) + "번 학생은 재시험입니다.");
//			}
//		}
		//과제24
//		System.out.print("문자열을 입력하세요 >> ");
//		String text = scanner.next();
//		
//		boolean flag = true;
//		for(int i =0; i<text.length(); i++) {
//			int charNum = text.charAt(i);
//			if(charNum<48 || charNum>58) {
//				flag = false;
//				break;
//			}
//		}
//		System.out.println( flag ? "모두 숫자입니다" : "모두 숫자가 아닙니다");
		
		//과제25
		int a=0, b=0;
		String operator;
		
		String calculation;
		int opIndex;
		String opList[] = {"+","-","/","*","%" };
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
//			System.out.print("첫번째 숫자 >> ");
//			a = scanner.nextInt();
//			System.out.print("연산자 >> ");
//			operator = scanner.next();
//			System.out.print("두번째 숫자 >> ");
//			b = scanner.nextInt();
			
			System.out.println("연산식을 입력하세요 >> ");
			calculation = br.readLine();
			calculation = calculation.replace(" ",""); //공백제거
			operator = calculation.concat(calculation);
			
			for(int i=0; i<opList.length; i++) {
				if(calculation.contains(opList[i])) {
					operator = opList[i];
					opIndex = calculation.indexOf(opList[i]);
					a = Integer.parseInt(calculation.substring(0, opIndex));
					b = Integer.parseInt(calculation.substring(opIndex+1));
				}
			}
			
			switch (operator) {
			case "+": {
				System.out.println(a+operator+b+"=" + (a+b));
				break;
			}
			case "-": {
				System.out.println(a+operator+b+"=" + (a-b));
				break;
			}
			case "*": {
				System.out.println(a+operator+b+"=" + (a*b));
				break;
			}
			case "/": {
				System.out.println(a+operator+b+"=" + ((double)a/b));
				break;
			}
			case "%": {
				System.out.println(a+operator+b+"=" + (a%b));
				break;
			}
			default:
				System.out.println("잘못된 연산자입니다. 다시 입력해주세요!");
			}
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다. 다시 입력해주세요!");
		}
		
		//선생님은 숫자를 string으로 받아오셔서 숫자인지 아닌지 24번과제 코드를 가져와서 테스트하였다.
		
		//과제27
		int d2[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14},
				{15,16,17,18,19},
				{20}
		};
		
		String d1[] = new String[d2.length];
		
//		for(int i=0; i<d2.length;i++) {
//			String tmp="";
//			for(int j =0; j<d2[i].length; j++) {
//				tmp += String.valueOf(d2[i][j]) + " ";
//			}
//			d1[i] = tmp;
//		}
		
		//선생님 풀이
		
		for(String t : d1) {
			System.out.println(t);
		}
	}
}
