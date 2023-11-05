import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
			편의점
			
			지불해야하는 금액 : 입력받기
			자신이 지불한 금액 : 입력받기
			
			거스름돈
			5000원 : ?장
			1000원 : ?장
			500원 : ?개
			100원 : ?개
			50원 : ?개
			10원 : ?개
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int cost; //지불해야하는 금액
		int pay; //지불한 금액
		int change; //잔돈
		
		System.out.print("지불해야하는 금액 : ");
		cost = scanner.nextInt();
		
		System.out.print("지불한 금액 : ");
		pay = scanner.nextInt();
		
		System.out.println();
		
		if(cost < pay) {
			change = pay - cost;
			
			System.out.println("총 잔돈 : " + change);
			
			//내풀이
			/*
			int cg5000 = change/5000;
			System.out.println("5000원\t" + cg5000 +"장");
			change = change%5000;

			int cg1000 = change/1000;
			System.out.println("1000원\t" + cg1000 +"장");
			change = change%1000;
			
			int cg500 = change/500;
			System.out.println("500원\t" + cg500 +"개");
			change = change%500;
		
			int cg100 = change/100;
			System.out.println("100원\t" + cg100 +"개");
			change = change%100;
			
			int cg50 = change/50;
			System.out.println("50원\t" + cg50 +"개");
			change = change%50;
			
			int cg10 = change/10;
			System.out.println("10원\t" + cg10 +"개");
			change = change%10;
			
			System.out.println("1원\t" + change +"개");
			/**/
			
			//선생님 풀이
			int m5000 = change / 5000;
			int m1000 = (change % 5000) / 1000;
			int m500 = (change % 1000) / 500;
			int m100 = (change % 500) / 100;
			int m50 = (change % 100) / 50;
			int m10 = (change % 50) / 10;
			
			System.out.println("5000원\t" + m5000 +"개");
			System.out.println("1000원\t" + m1000 +"개");
			System.out.println("500원\t" + m500 +"개");
			System.out.println("100원\t" + m100 +"개");
			System.out.println("50원\t" + m50 +"개");
			System.out.println("10원\t" + m10 +"개");
			
			
		}else if(cost == pay) {
			System.out.println("거스름돈이 없습니다");
		}else {
			System.out.println("지불하신 금액이 모자랍니다");
		}
		
		
		
		
		
		
	}
}
