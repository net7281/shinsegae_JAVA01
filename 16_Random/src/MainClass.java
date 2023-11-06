
public class MainClass {
	public static void main(String[] args) {
		/*
			random : 난수, 무작위 <-> pattern
			
			1,2,3,4,5 -> 3, 5
			
		 */
		
		int rNum;
		
		// 0 ~ 4
		rNum = (int)(Math.random() * 5);
		System.out.println(rNum);
		
		// 0 ~ 9
		rNum = (int)(Math.random() * 10);
		System.out.println(rNum);
		
		// 10 20 30 40 50
		rNum = (int)((Math.random() * 5)+1) * 10;
		System.out.println(rNum);
		
		//(int)(Math.random() * (개수)); : 캐릭터 이동 때!!!
		int x = (int)(Math.random() * 3)-1;
		int y = (int)(Math.random() * 3)-1;
		System.out.println(x+ ", "+y);
		
		//과제
		int arr[] = {3,7,9,12,21};
		int num = (int)(Math.random() * arr.length);
		System.out.println(arr[num]);
	}
}
