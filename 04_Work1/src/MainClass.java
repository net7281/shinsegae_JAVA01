import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// 과제1
		System.out.println("=================================================");
		System.out.println("| 이름\t 나이\t\t 전화번호\t\t 주소\t|");
		System.out.println("=================================================");
		System.out.println("| 홍길동\t 20\t\t 010-111-2222\t 경기도\t|");
		System.out.println("| 일지매\t 18\t\t 02-123-4567\t 서울\t|");
		System.out.println("=================================================");
		
		
		// 과제2
		System.out.println("=========================================================");
		System.out.println("\\ name\t\t age\t\t phone\t\t address\\");
		System.out.println("=========================================================");
		System.out.println("\\ \"홍길동\"\t 20\t\t 010-111-2222\t '경기도'\t\\");
		System.out.println("\\ \"일지매\"\t 18\t\t 02-123-4567\t '서울'\t\\");
		System.out.println("=========================================================");
		
		
		// 과제3
		String name;
		int age;
		boolean man;
		String phone;
		double height;
		String address;
		
		System.out.println("==================================================================");
		System.out.println("\\ name\t\t age\t man\t phone\t\t height\t address \\");
		System.out.println("==================================================================");
		
		name = "홍길동";
		age = 20;
		man =true;
		phone = "010-111-2222";
		height = 175.12;
		address = "경기도";
		System.out.println("\\ \""+ name + "\"\t "+ age + "\t "+ man + "\t " + phone +"\t " + height + "\t " +address + "\t \\");
		
		name = "일지매";
		age = 18;
		man =true;
		phone = "02-123-4567";
		height = 180.01;
		address = "서울";
		System.out.println("\\ \""+ name + "\"\t "+ age + "\t "+ man + "\t " + phone +"\t " + height + "\t " +address + "\t \\");
		
		name = "홍길동";
		age = 14;
		man =false;
		phone = "051-345-7590";
		height = 155.78;
		address = "부산";
		System.out.println("\\ \""+ name + "\"\t "+ age + "\t "+ man + "\t " + phone +"\t " + height + "\t " +address + "\t \\");
		
		System.out.println("==================================================================");
		
		
		// 과제4
		int x;
		int y;
		int tmp;
		
		x = 1;
		y = 2;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x = " + x + ", y = "+y);
		
	}

}
