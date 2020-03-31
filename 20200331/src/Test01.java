
public class Test01 {	
	public static void main(String[] args) {
		//연산시 데이터 형변환
		short s1 = 10;
		short s2 = 20;
		//short + short 연산시 정수의 기본형이 int가 된다
		//연산후에 데이터 형변환을 해준다
		//기본형 타입의 데이터보다 적은 메모리를 사용하는 타입의 경우
		//연산시 메모리 오버플로우로 인해 계산 오류가 발생할 수 있음
		//그래서 기본형타입 int로 바꿔서 처리한다
		//형변환은 연산이 끝난후에 처리해야한다
		
		short s3 = (short)(s1 + s2);
		int a = 8/3;
		double d = 8.0/3d;
		//정수형  / 정수형  -> 정수형
		//실수형 / 실수형 -> 실수형
		System.out.println(d);
	}

}
