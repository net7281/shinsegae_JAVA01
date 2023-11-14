import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		while (true) {
			System.out.println("\n========================");
			System.out.println("진수 변환 프로그램" );
			System.out.println("1. 10진수를 2진수로 변환");
			System.out.println("2. 2진수를 10진수로 변환");
			System.out.println("3. 10진수를 16진수로 변환");
			System.out.println("4. 16진수를 10진수로 변환");
			System.out.println("5. 2진수를 16진수로 변환");
			System.out.println("6. 16진수를 2진수로 변환");
			System.out.println();
			
			System.out.print("원하는 번호를 입력해주세요 >> ");
			int work = scanner.nextInt();
			System.out.println();
			
			switch (work) {
				case 1: //10진수를 2진수로 변환
				{
						System.out.print("10진수 : ");
					int dec = scanner.nextInt();
					
					String bin = Integer.toBinaryString(dec);
					bin = binText(bin);
					System.out.println("10진수 "+dec + "은 "+ bin +"입니다.");
					
					break;
				}
				case 2: //2진수를 10진수로 변환
				{
					System.out.print("2진수 : ");
					String bin = scanner.next();
					
					int dec = Integer.parseInt(bin,2);
					System.out.println("2진수 "+bin + "은 "+ dec +"입니다.");
					
					break;
				}
				case 3: //10진수를 16진수로 변환
				{
						System.out.print("10진수 : ");
					int dec = scanner.nextInt();
					
					String hex = "0x"+Integer.toHexString(dec);
					System.out.println("10진수 "+dec + "은 "+ hex +"입니다.");
					
					break;
				}
				case 4: //16진수를 10진수로 변환
				{
					System.out.print("16진수 : ");
					String hex = scanner.next();
					
					int dec = Integer.parseInt(hex,16);
					System.out.println("16진수 "+hex + "은 "+ dec +"입니다.");
					
					break;
				}
				case 5: //2진수를 16진수로 변환
				{
					System.out.print("2진수 : ");
					String bin = scanner.next();
					
					int dec = Integer.parseInt(bin,2);
					String hex = "0x"+Integer.toHexString(dec);
					
					System.out.println("2진수 "+bin + "은 "+ hex +"입니다.");
					
					break;
				}
				case 6: //16진수를 2진수로 변환
				{
					System.out.print("16진수 : ");
					String hex = scanner.next();
					
					int dec = Integer.parseInt(hex,16);
					String bin = Integer.toBinaryString(dec);
					
					System.out.println("16진수 "+hex + "은 "+ bin +"입니다.");
					
					break;
				}
				default:
					System.out.println("잘못된 번호를 입력하셨습니다.");
					break;
			}
		}
	}
	
	//2진수 정렬
	public static String binText(String bin) {
		
		if(bin.length()%4 != 0) {// 0 붙이기
			bin = binText("0"+bin);
		}else if(bin.length()>4) { // 띄우기
			String tmp="";
			for(int i = 0 ;i<bin.length()/4; i++) {
				tmp += bin.substring((i*4),((i*4)+4)) + " ";
			}
			bin = tmp;
		}
		return bin;
	}
}
