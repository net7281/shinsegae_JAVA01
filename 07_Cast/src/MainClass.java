
public class MainClass {

	public static void main(String[] args) {
		/*
			(자료)형 변환
			
			byte	1
			short	2
			int		3
			long	8
			
			float	4
			double	8
			
			
			auto(자동) 형변환, cast(강제) 형변환
		 */
		
		//자동 형 변환
		short sh = 10000;
		int num;
		
		num = sh; //자동 형 변환
		System.out.println(num);
		
		
		num = 12345;
		// sh = num; 미스매치, 큰 int를 작은 short로 바꿀 수 없다.
		sh = (short) num; //강제 형 변환
		System.out.println(sh);
		
		
		double result;
		result = 3/2; // 1.0
		// 왜? 이미 3/2 에서 int로 계산 = 답 1 > 자동 형 변환으로 double됨 = 1.0
		
		
		result = (double)3/2;
		// 강제로 형변환이 이루워져 답이 1.5
		
		System.out.println(result);
		

		//(용량은 float가 낮지만 우선순위가 long보다 높음)
		long l = 123456789L;
		float f = l; 
		System.out.println(f); //1.23456792E8 끝자리를 보면 오차가 생김
		
		//f = 123456.0f;
		//l = f; 미스매치
		
		
		//
		double d = l;
		System.out.println(d); // 1.23456789E8
		// E8 = 10*8승 = 100000000
		// 1.23456789 * 100000000
		// == 123456789
		
		
		//이율 등을 계산할 때
		double value = 1250.45;
		int money = (int)value; //소수점을 때고 싶을 때
		System.out.println(money);
		
	}

}
