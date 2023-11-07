
public class MainClass {
	public static void main(String[] args) {
		/*
			continue :  skip(생략)
						loop문 안의 처리 생략
						단독으로 사용 불가
						loop문과 같이 사용함
						for, while
			
			for(int i; i<10;i++){
				처리 1
				처리 2
				if(i == 4) continue;
				처리 3
				처리 4
			} //i가 4일때 1,2 / 5일때 1,2,3,4
			skip
		 */
		
		for(int i=0; i<5; i++) {
			System.out.println(i+ "--------------------------");
			System.out.println("\t처리1");
			System.out.println("\t처리2");
			
			if(i==3) continue;
			//i가 3일때 처리 3,4 생략
			System.out.println("\t처리3");
			System.out.println("\t처리4");
		}
	}
}
