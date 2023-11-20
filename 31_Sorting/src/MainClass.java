import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			sorting : 	정렬
						숫자의 크기에 따라서 순번대로 배치하는 처리
						오름차순(큰값이 뒤로), 내림차순(작은 값이 뒤로)
						입사순위			 연봉순위
						
						선택 버블 합병 퀵
		 */
		
//		int numArr[] = {2,4,3,5,1};
//		int temp; //swap용 변수
//		
//		for(int i=0; i< numArr.length - 1;i++) {
//			for(int j = i+1 ; j<numArr.length; j++) {
//				if(numArr[i] > numArr[j]) {
//					temp = numArr[i];
//					numArr[i] = numArr[j];
//					numArr[j] = temp;
//				}
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(numArr));
	
		
		int myArr[] = {1,2,3,4,5};
		int yorArr[] = {3,6,9,12,15};
		
		//이렇게 바꾸면 원본이 바뀐다 (배열의 길이에 따라 여러번바꿔야함)
//		int tmp;
//		for(int i=0; i< myArr.length; i++) {
//			tmp = myArr[i];
//			myArr[i] = yorArr[i];
//			yorArr[i] = tmp;
//			
//		}
		
		//원본데이터는 바꾸지 않고, 복사arr를 바꿈(속도도 빠름)
		//복사 데이터의 데이터를 바꿔도 원본데이터 바꿈
		int mArr[] = myArr;
		int yArr[] = yorArr;
		
		int tmp[] = mArr;
		mArr = yArr;
		yArr = tmp;
		
		//원본 데이터
		System.out.println(Arrays.toString(myArr));
		System.out.println(Arrays.toString(yorArr));
		
		//복사 데이터
		System.out.println(Arrays.toString(mArr));
		System.out.println(Arrays.toString(yArr));
		
		
		
		
		//Sorting
		
		//선언부
		Scanner scanner = new Scanner(System.in);
		int count, tmep;
		boolean upDown = true;
		
		//입력
		//몇개를 정렬?
		System.out.print("몇개를 정렬하시겠습니까? >>");
		count = scanner.nextInt();
		
		int Arr[] = new int[count];
		
		//숫자들을 입력
		for(int i=0; i<count; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요. >>");
			Arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(Arr));
		
		//정렬처리
		//오름/내림
		System.out.print("오름차수로 정렬 1, 내림차수로 정렬 2 >>");
		int ud = scanner.nextInt();
		if(ud==2) upDown = false;
		
		if(upDown) { // 오름차순
			for(int i =0 ; i<Arr.length-1;i++) {
				for(int j=i+1; j<Arr.length;j++) {
					if(Arr[i] > Arr[j]) {				
						tmep=Arr[i];
						Arr[i] = Arr[j];
						Arr[j] = tmep;
					}
				}
			}
		}else { // 내림차수
			for(int i =0 ; i<Arr.length-1;i++) {
				for(int j=i+1; j<Arr.length;j++) {
					if(Arr[i] < Arr[j]) {				
						tmep=Arr[i];
						Arr[i] = Arr[j];
						Arr[j] = tmep;
					}
				}
			}
		}
		
		//결과출력
		System.out.println(Arrays.toString(Arr));
	}
}
