import java.util.Arrays;
import java.util.Collections;

public class MainClass {
	public static void main(String[] args) {
		
		//과제1
//		int num1[] = {1, 2, 3, 4, 5};
//		getDouble(num1);
//		System.out.println(Arrays.toString(num1));
		
		//과제2
//		int num1 = 18, num2 = 8;
//		int result;
//		int tag[] = new int[1];
//		result = getResult(num1, num2, tag);
//		System.out.println("result = "+result+", tag = "+tag[0]);
		
		//과제3
		System.out.println(getDistance(1,1,2,2));
		
		//과제4
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
		//과제5
//		int[] data = {3,2,9,4,7};
//		System.out.println(java.util.Arrays.toString(data));
//		System.out.println("최대값:"+max(data));

		//과제6
		System.out.println((int)'0' +" " + (int)'9');
		
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		
	}
	
	//과제1
	static void getDouble(int arr[]) {
		for(int i = 0; i<arr.length ; i++) {
			arr[i] = arr[i]*2;
		}
	}
	
	//과제2
	static int getResult(int num1, int num2, int tag[]) {
		
		int result = num1/num2;
		tag[0] = num1%num2;
		return result;
	}
	
	//과제3
	static double getDistance(int x, int y, int x1, int y1) {
		double result =  Math.sqrt(Math.pow((y1-y), 2) + Math.pow((x1-x), 2));
		return result;
	}

	//과제4
	static int[] shuffle(int[] arr) {
		int result[] = new int[arr.length];
		result = arr.clone();
		int ran1 = 0, ran2 = 0, tmp = 0;
		
		for(int i=0; i<10000; i++) {
			ran1 = (int) (Math.random()*arr.length);
			ran2 = (int) (Math.random()*arr.length);
			tmp = result[ran1];
			result[ran1] = result[ran2];
			result[ran2] = tmp;
		}
		return result;
	}
	
	//과제5
	static int max(int[] arr) {
		int maxNum = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(maxNum < arr[i]) maxNum = arr[i];
		}
		return maxNum;
	}
	
	//과제6
	//utility 함수
	static boolean isNumber(String str) {
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)<48 || str.charAt(i)>57) {
				return false;
			}
		}
		return true;
	}
}
