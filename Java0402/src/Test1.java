
public class Test1 {
	public static void main(String[] args)
	{
		//기본형 타입
		/*byte - 1byte
		short  - 2byte
		int  - 4byte
		long  - 8byte
		float  - 4byte
		double  - 8byte
		char  - 2byte
		boolean  - 2byte */
		
		byte a = 11;
		byte b = 29;
		byte c = (byte)(a + b);

		//System.out.println("c : " + c);
		
		char ch = 'A';
		ch += 6;
		//ch = ch + 6; 은 오류가 난다 char -> int로 자동 변환이 되지만 int -> char는 자동 변환이 되지 않는다
		ch = (char)(ch + 6);
		System.out.println("ch : " + ch);
		
		char ch2 = 'G';
		//System.out.println("ch2 : " + ch2 - 6);
		// ch2 : 와 ch2 까지 string 형인데 -6을 할려고 하니 string에서는 - 연산이 없기때문에 오류가 발생한다
		System.out.println("ch2 : " + (char)(ch2 - 6));
		
		int ch3 = 'A';
		//자동 형변환
		System.out.println("ch3 : "+ ch3);
		
		float f = 3 / 2f;
		//float f = 3 / 2;
		//정수 끼리 연산을 하고 나서 변수에 저장되기 떄문에 정수끼리의 계산 값이 저장된다
		System.out.println("f : " + f);
		
		float f2 = 3.0f / 2f;
		//float f2 = 3.0 / 2f;
		//3.0에 아무런 표시가 없기 때문에 실수형 기본타입인 double형이되며 float로 형변환이 안된다
		System.out.println("f2 : " + f2);
		
		long l = 3000 * 3000 * 3000l;
		//long l = 3000*3000*3000;
		// 오른쪽 실행 결과는 int타입이며 int의 값보다 큰값이 나오기때문에 잘못된 값이 입력된다
		System.out.println("l : " + l);
	}
}
