import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
				
				//선언부
				int count, tmep;
				boolean upDown[] = new boolean[1];
				
				int array[] = inputNumFunc(upDown);
				sortFunc(upDown[0], array);
				outputFunc(array);
				
	}
	
	//입력함수
	static int[] inputNumFunc(boolean upDown[]) {
		Scanner scanner = new Scanner(System.in);
		//입력
		//몇개를 정렬?
		System.out.print("몇개를 정렬하시겠습니까? >>");
		int count = scanner.nextInt();
		
		int array[] = new int[count];
		
		//숫자들을 입력
		for(int i=0; i<count; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요. >>");
			array[i] = scanner.nextInt();
		}
		System.out.print("오름차수로 정렬 1, 내림차수로 정렬 2 >>");
		int ud = scanner.nextInt();
		if(ud==2) upDown[0] = false;
		else	  upDown[0] = true;
		
		System.out.println(Arrays.toString(array));
		return array;
	}
	
	//정렬함수
	static int[] sortFunc(boolean upDown, int[] array) {
		//정렬처리
		//오름/내림
		if(upDown) { // 오름차순
			for(int i =0 ; i<array.length-1;i++) {
				for(int j=i+1; j<array.length;j++) {
					if(array[i] > array[j]) {				
						array[j] = swapFunc(array[i], array[i] = array[j]);
					}
				}
			}
		}else { // 내림차수
			for(int i =0 ; i<array.length-1;i++) {
				for(int j=i+1; j<array.length;j++) {
					if(array[i] < array[j]) {
						array[j] = swapFunc(array[i], array[i] = array[j]);
					}
				}
			}
		}
		return array;
	}
	
	//스왑함수
	static int swapFunc(int a, int b) {
		return a;
	}
	
	
	//출력함수
	static void outputFunc(int array[]) {
		System.out.println(Arrays.toString(array));
	}
	
}
