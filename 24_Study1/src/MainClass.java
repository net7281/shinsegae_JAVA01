
public class MainClass {
	public static void main(String[] args) {
		/*
			제어문
			
			조건문
				if
				if else
				if else if else
				
				switch case break
			
			반복문
				for
				while
				do while
			
			제어자
				break
				continue
		 */
		
		int number = 5;
		if(number == 5) {
			System.out.println("number 는 5입니다");
		}
		if(number > 0 && number <= 10) {
			System.out.println("number는 1부터 10사이의 수 입니다");
		}
		if(number < 0 || number > 3 ) {
			System.out.println("number는 0보다 작거나 3보다 큽니다");
		}
		if(number != 0) {
			System.out.println("number 는 0이 아니다");
		}
		
		boolean b = false;
		if(!b) {
			System.out.println("b는 false입니다");
		}
		if(b == false) {
			System.out.println("b는 false입니다");
		}
		
		//else : 둘중 하나는 무조건실행
		if(number >5) {
			System.out.println("5보다크다");
		}else {
			System.out.println("5와 같거나 작습니다");
		}
		
		number = 92;
		
		if(number >= 95) {
			System.out.println("A+");
		}else if(number >= 90) {
			System.out.println("A");
		}else if (number >= 80) {
			System.out.println("B");
		}else if(number >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		number =2;
		
		//switch
		switch (number) {
		case 1 : //number == 1
			 System.out.println("number=1");
			 break; 
		case 2 : //number == 1
			 System.out.println("number=2");
			 break; 
		default :
			 System.out.println("number=?");
			 break; 
		}
		
		//반복문
		for(int i = 0; i<10; i++) {
			System.out.println("i="+i);
		}
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("sum="+sum);
		
		int arr[] = {11,22,33,44,55,66,77,88,99};
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			if(arr[i] == 66) {
				System.out.println("66을 찾았어요");
			}
		}
		for(int num : arr) {
			if(num == 44) {
				System.out.println("44을 찾았어요");
				break;
			}
		}
		
		
		//while
		int w;
		w=0;
		while (w<10) {
			System.out.println("w="+w);
			w++;
		}
		
		String arrStr[] = {"hi", "hello", "world"};
		w=0;
		while (w<arrStr.length) {
			System.out.print(arrStr[w]+" ");
			if(arrStr[w].equals("world")) {
				System.out.println("더월드");
			}
			w++;
		}
		
		//break(for,while)
		int []arrNum = {12,34,56,78,-23,18};
		for(int i=0;i<arrNum.length;i++) {
			System.out.println(arrNum[i]);
			if(arrNum[i]<0) {
				break;
			}
		}
		
		//continue
		for(int i=0;i<arrNum.length;i++) {
			if(arrNum[i]<0) {
				continue;
			}
			System.out.println(arrNum[i]);
		}
		
	}
}
