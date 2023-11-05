import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//과제5
//		int num1, num2;
//		
//		System.out.print("첫번째 수를 입력해주세요 : ");
//		num1 = scanner.nextInt();
//		System.out.print("두번째 수를 입력해주세요 : ");
//		num2 = scanner.nextInt();
//		
//		System.out.println();
//		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
//		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
//		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
//		System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
//		System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		
		//과제6
		double meter;
		
		System.out.print("미터를 입력해주세요 : ");
		meter = scanner.nextDouble();
		
		System.out.println();
		double inch = meter/0.0254;
		double yard = meter/0.9144;
		double mile = meter/1609.3;
		
		System.out.printf("%f m = %.10f inch\n",meter,inch);
		System.out.printf("%f m = %.10f yard\n",meter,yard);
		System.out.printf("%f m = %.10f mile",meter,mile);
		
		//과제7
		int x,y,z;
		
		System.out.print("x : ");
		x = scanner.nextInt();
		System.out.print("y : ");
		y = scanner.nextInt();
		System.out.print("z : ");
		z = scanner.nextInt();
		
		System.out.println((double)(x-y)/(z-y));
		
	}
}
