
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
		// 오른쪽 실행 결과는 int타입이며 int의 범위보다 큰값이 나오기때문에 잘못된 값이 입력된다
		System.out.println("l : " + l);
		//기본형 타입이 아닌 연산이 필요한 경우(long, float, double)
		// 연산시 데이터중에 하나 이상 해당 타입이면 자동으로 변경되서 연산됨
		
		float ff = 0.1f;
		double dd = 0.1d;
		System.out.println(ff== dd);
		boolean result = ff==dd;
		System.out.println(result);
		
		//자바는 실수데이터를 정확하게 표현하지 않는다
		//float, double 연산시 double을 float 형태로 변경하는게 좋음
		//기본형 실수형 타입의 데이터는 정밀한 계산 사용에는 부적합
		
		int num = 23;
		// 변수 num 보다 크면서 가장 가까운 10의 배수에서 
		// 변수 num값을 뺀 나머지를 계산
		// 10 - num%10
		System.out.println("결과 : "+ ((num / 10 + 1) * 10 - num));
		
		ch = '0'; 
		boolean bool;
		// 변수 ch값이 영어 대문자 일때 true 값 출력
		//bool = ch <= 'Z'? ((ch >= 'A')? bool = true :  false ) : false;
		//bool = (ch - 'A') <= 25 && (ch - 'A') >= 0;
		//bool = (('A' <= ch) && (ch <= 'Z'));
		//bool = (('A' <= ch) && (ch <= 'Z')) || (('a' <= ch) && (ch <= 'z'));
		// 숫자 추가
		bool = (('A' <= ch) && (ch <= 'Z')) || (('a' <= ch) && (ch <= 'z')) || (('0' <= ch) && (ch <= '9'));
		System.out.println("bool : " + bool);
		
		//입력된 변수의 값이 대문자이면 -> 소문자
		// 소문자 라면 -> 그대로
		ch = 'g';
		char value = (('A' <= ch) && (ch <= 'Z'))? (char)(ch - 'A' + 'a') : (('a' <= ch) && (ch <= 'z')? (char)(ch - 'a' + 'A') : ch);
		
		System.out.println("ch : " + ch);
		System.out.println("연산 후 ch : " + value);
	}
}
