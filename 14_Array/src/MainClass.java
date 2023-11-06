
public class MainClass {
	public static void main(String[] args) {
		/*
			Array : 배열
					같은 자료형의 변수들의 묶음
					변수의 확장기능
					관리를 용이하게 하기 위한 목적
					index(번호)로 접근 및 관리
					
			int num1, num2, num3, num4...
			
			형식 : 자료형 (배열)변수명[] = new 자료형[배열의 갯수]
								     동적할당 <-> 정적할당
				  변수명[0 ~ (배열의 갯수-1)]
			동적으로 할당해서 정적으로 사용
			
			//c언어 포인터와 같다
			pointer
			int *po;
			int arr[];
		 */
		
		int num1=1, num2=2, num3=3;
		
		
//		int arrNum[] = new int[5];
//		int []arrNum = new int[5];
		int[] arrNum = new int[5]; //3개가 동일
		
		int arr[];
		arr = new int[5];//할당을 나중에 해도된다
		
		System.out.println(arr); //[I@1ee0005 주소
		
		
		arrNum[0]=1;  //0 : index number, 0 번지
		arrNum[1]=2;
		arrNum[2]=3;
		arrNum[3]=4;
		arrNum[4]=5;
		
		//예전에는 delete[] arrNum; 으로 데이터를 삭제해야했음
		//현재 자바는 가비지 콜렉터로 자동삭제
		
		//배열의 초기화
		int arrNums[] = null; //0은 안된다
		int numArr[] = {0,1,2,3,4,5}; //바로 할당
		
		System.out.println(numArr[2]);
		
		//arrNums = {0,1,2,3,4,5}; (X)
		arrNums = new int[6];
		arrNums[0] = 1; //... 이렇게 넣어야함

		//배열의 길이
		System.out.println("numArr.length : "+numArr.length);
		
		//배열 별명(alias)
		int aNum[] = numArr;
		System.out.println(aNum[0]);
		System.out.println(aNum[1]);
		System.out.println(aNum[2]);
		System.out.println(aNum[3]);
		System.out.println(aNum[4]);
		
		aNum[3] = 33; //배열별명은 배열의 복제이지만, 원본과 연결
		//배열이 있는 위치를!!! 복사해서 넣은것
		System.out.println(numArr[3]);
		
		
	}
}
