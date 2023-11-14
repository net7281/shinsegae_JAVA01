import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		//과제12
		int sum = 0;
		for(int i=1;i<=1000;i++) {
			sum+=i;
		}
		System.out.println("1~1000 까지의 합은? : "+sum);
		
		//과제13
		int evenSum = 0, oddSum = 0; 
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		System.out.println("1~100 까지 짝수의 합 : "+evenSum+", 홀수의 합 : "+oddSum);
		
		//과제14
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >> ");
		int num = scanner.nextInt();

//		int scope = (num/10) *10;
//		if(num%10 == 0) scope-=10;
//		if(scope==0) {
//			System.out.println((scope+10) +" 보다 작다");
//		}else if(scope>0) {
//			System.out.println(scope+" 보다 크고, " + (scope+10) +" 보다 작거나 같다");
//		}
		
//		int scope = (num/10);
//		if(num%10 == 0) scope-=1;
//		switch (scope) {
//			case 0:
//				System.out.println("입력한 수는 10보다 작거나 같다.");
//				break;
//			case 1:
//				System.out.println("입력한 수는 10보다 크고 20보다 작거나 같다.");
//				break;
//			case 2:
//				System.out.println("입력한 수는 20보다 크고 30보다 작거나 같다.");
//				break;
//			case 3:
//				System.out.println("입력한 수는 30보다 크고 40보다 작거나 같다.");
//				break;
//			case 4:
//				System.out.println("입력한 수는 40보다 크고 50보다 작거나 같다.");
//				break;
//			case 5:
//				System.out.println("입력한 수는 50보다 크고 60보다 작거나 같다.");
//				break;
//			case 6:
//				System.out.println("입력한 수는 60보다 크고 70보다 작거나 같다.");
//				break;
//			case 7:
//				System.out.println("입력한 수는 70보다 크고 80보다 작거나 같다.");
//				break;
//			case 8:
//				System.out.println("입력한 수는 80보다 크고 90보다 작거나 같다.");
//				break;
//			case 9:
//				System.out.println("입력한 수는 90보다 크고 100보다 작거나 같다.");
//				break;
//			default:
//				System.out.println("입력한 수는 100보다 크다.");
//				break;
//		}
		
		//선생님풀이 : 코드효율성 중요!
		//좋은코드는 쉬운코드!
		int n=0;
		for(int i =0; i<10; i++) {
			n =10*i;//
			if(num > n && num <= (n+10)) {
				System.out.println("입력한 수는 "+n+"보다 크고 "+(n+10)+"보다 작거나 같다.");
			}
		}
		
		//과제15
//		System.out.print("단을 입력해주세요 : ");
//		int dan = scanner.nextInt();
//		
//		System.out.println("==== "+ dan + " 단 ====");
//		for(int i=1; i<10;i++) {
//			System.out.println(dan + " x " + i +" : " + (dan*i));
//		}
//		
//		int mul = 1;
//		while (mul<10) {
//			System.out.println(dan + " x " + mul +" : " + (dan*mul));
//			mul++;
//		}
		
		
		//과제16
//		for(int i =1; i<10; i++){
//			System.out.println("==== "+ i + " 단 ====");
//			for(int j =1; j<10 ;j++) {
//				System.out.println(i + " x " + j +" : " + (i*j));
//			}
//			System.out.println();
//		}
		
//		int  danA =1, danB = 1;
//		while (danA<10) {
//			System.out.println("==== "+ danA + " 단 ====");
//			while (danB<10) {
//				System.out.println(danA + " x " + danB +" : " + (danA*danB));
//				danB++;
//			}
//			System.out.println();
//			danB = 1;
//			danA++;
//		}
		
		//과제17
		for(int i = 0; i<9; i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//과제17
		//위
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //아래
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //선생님 풀이
        int len = 0;
        for(int i=0; i<9; i++) {
        	
        	if(i<5) len++;
        	else 	  len--;
        	
        	for(int j=0; j<len; j++) {
        		System.out.print("*");
            }
            System.out.println();
        }
	}
}
