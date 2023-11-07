
public class MainClass {
	public static void main(String[] args) {
		/*
			break : (loop)탈출
					단독으로는 사용하지 않는다
					for, while, do while 와 사용
					
			for(int i = 0; i<100; i++){
				if(i == 25){
					break;
				}
			}
		 */
		
		for(int i = 0; i<100; i++){
			System.out.println("i="+i);
			if(i==18) {				
				break;
			}
		}
		
		//문자 C였을때 탈출
		char arr[] = {'A','B','C','D','E'};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] == 'C') {
				break;
			}
		}
		
		int numArr[] = {2,5,7,1,-6,8,9};
		for(int i =0 ;i<numArr.length;i++) {
			System.out.println("numArr["+i+"] = " + numArr[i]);
			if(numArr[i]<0) {
				break;
			}
		}
		
		//while
		int a=0;
		while (a<10) {
			System.out.println("a:"+a);
			if(a==5) {
				break;
			}
			a++;
		}
		
		//2중 for문 탈출
		for(int i=0; i< 10; i++) {
			System.out.println("i="+i);
			for(int j = 0; j<5; j++) {
				System.out.println("\tj="+j);
				
				if(i==5 && j==3) {
					break; //브레이크 1개당 하나의 loop문 탈출
				}
			}
		}
		
		//1.탈출방법
		boolean b = false;
		for(int i=0; i< 10; i++) {
			System.out.println("i="+i);
			for(int j = 0; j<5; j++) {
				System.out.println("\tj="+j);
				if(i==5 && j==3) {
					b = true;
				}
				if(b) break; //j for문 탈출
			}
			if(b) break; //i for문 탈출
		}
		
		//2.탈출방법 : for문에 별명주기
		loopOut: for(int i=0; i< 10; i++) {
			System.out.println("i="+i);
			for(int j = 0; j<5; j++) {
				System.out.println("\tj="+j);
				
				if(i==4 && j==2) {
					break loopOut; //별명으로 불러서 바로 탈출하기!
				}
			}
		}
	}
}
