import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//과제31
		
		/*
			뭐가 필요할지 항목 뽑기!!
			
			user, com
			1. 변수 선언부
			2. 랜덤
			3. 유저 입력
			4. 판정처리
			5. 결과출력
			6. 다시시작
			
			가위바위보 공식
			
			com		user	win
			2	-	0	+2
		 */
		String kind[] = {"가위","바위","보"};
		int win = 0, draw = 0, lose = 0;
		
		GameLoop: while (true) {
			System.out.println();
			//사용자 입력
			System.out.print("가위(0), 바위(1), 보(2) 를 입력 >> ");
			int user = scanner.nextInt();
			
			//컴퓨터 랜덤
			int com = (int) (Math.random()*3);
			
			
			//판단 및 출력
			if(user >=0 && user<=2) { //잘못된 숫자 판별
				
				System.out.println("당신은 " + kind[user] + ", 컴퓨터는 "+kind[com]);
				
				if(user == com) {
					System.out.println("무승부 입니다.");
					draw++;
				}else if((user==0 && com==2) //user가 가위, 컴퓨터가 보
						|| (user==1 && com==0) //user가 바위, 컴퓨터가 가위
						|| (user==2 && com==1)){ //user가 보, 컴퓨터가 바위
					System.out.println("당신이 이겼습니다.");
					win++;
				}else {
					System.out.println("당신이 졌습니다.");
					lose++;
				}
				
				System.out.println(win +"승 "+draw+"무 "+lose+"패");
				
			}else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
			
			System.out.println();
			
			while (true) {
				System.out.print("다시 하시겠습니까? (y/n)");
				char re = scanner.next().charAt(0);
				if(re=='n' || re=='N' || re=='y' || re=='Y') { //y/n 중 입력인지 체크
					if(re=='y' || re=='y') { //y면 다시입력 루프 break; GameLoop 다시 시작
						break;
					}else {
						break GameLoop; //n이면 GameLoop break > 종료
					}
				}else {
					System.out.println("잘못 입력하셨습니다."); //잘못입력경우 다시 입력
				}
			}
		}
		
		
		
		//과제32
//		
//		System.out.print("총 학생 수를 입력 >> ");
//		int count = scanner.nextInt();
//		System.out.println();
//		
//		String studentName[] = new String[count]; //이름
//		int studentScore[][] = new int[count][3]; //점수
//		double studentAvg[] = new double[count]; //평균
//		
//		for(int i=0; i<count ;i++) {
//			System.out.print((i+1)+"번 학생의 이름을 입력하세요 >> ");
//			studentName[i] = scanner.next();
//			
//			System.out.print((i+1)+"번 학생의 국어성적을 입력하세요 >> ");
//			studentScore[i][0] = scanner.nextInt();
//			System.out.print((i+1)+"번 학생의 영어성적을 입력하세요 >> ");
//			studentScore[i][1] = scanner.nextInt();
//			System.out.print((i+1)+"번 학생의 수학성적을 입력하세요 >> ");
//			studentScore[i][2] = scanner.nextInt();
//			System.out.println();
//		}
//		
//		//총점, 평균
//		for(int i=0; i<count ;i++) {
//			int sum=0;
//			for(int j=0; j<studentScore[i].length;j++) {
//				sum += studentScore[i][j];
//			}
//			System.out.printf("%d번 학생 %s의 총점 = %d\n",i+1,studentName[i],sum);
//			
//			double avg = (double)sum/studentScore[i].length;
//			System.out.printf("%d번 학생 %s의 평균 = %.2f\n",i+1,studentName[i],avg);
//			studentAvg[i] = avg;
//			
//			System.out.println();
//		}
//		
//		//최고점, 최하점
//		int maxNum = 0;
//		int minNum = 0;
//		
//		for(int i=1; i<studentAvg.length;i++) {
//			if(studentAvg[maxNum] < studentAvg[i]) {
//				maxNum = i; //max 보다 큰값으로 갱신
//			}
//			if(studentAvg[minNum] > studentAvg[i]) {
//				minNum = i; //max 보다 큰값으로 갱신
//			}
//		}
//		System.out.println();
//		
//		System.out.println("최고점수---------------");
//		System.out.println("이름 : "+ studentName[maxNum]);
//		System.out.println("점수 : "+ studentAvg[maxNum]);
//		
//		System.out.println();
//		System.out.println("최저점수---------------");
//		System.out.println("이름 : "+ studentName[minNum]);
//		System.out.println("점수 : "+ studentAvg[minNum]);
	}
		
}
