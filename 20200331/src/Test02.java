import java.util.logging.LogManager;

public class Test02 {
	public static void main(String[] args)
	{
		//연산자
		
		//1. 산술 연산자 (+,-,*,/,%)
		System.out.println("10 + 20 = " + (10 + 20));
		System.out.println("10 - 20 = " + (10 - 20));
		System.out.println("10 * 20 = " + (10 * 20));
		System.out.println("10 / 20 = " + (10 / 20d));
		System.out.println("10 % 20 = " + (10 % 20));
		
		//과일 25개를 한상자에 5개씩 저장 가능한 상자를 사용해서
		//포장하려고 한다. 이때 필요한 상자의 개수는
		int fruit = 25;
		int sizeOfBox = 5;
		System.out.println("필요한 상자의 개수 : " + (fruit / sizeOfBox) + "개");
		
		int num = 458;
		//연산
		num /= 100;
		num *= 100;
		//400
		System.out.println(num);
		
		num = 817;
		System.out.println(num/10 * 10 + 1);
		
		//2. 비교연산자
		// ==,!= ,<, >, <=, >=
		// * 비교연산의 결과는 항상 boolean 타입이다.
		
		//A == B : A와 B가 같은가?
		//A != B : A와B가 다른가?
		//A < B : A보다 B가 큰가?
		//A > B : A보다 B가 작은가?
		//A <= B : A보다 B가 크거나 같은가?
		//A >= B : A보다 B가 작거나 같은가?
		// => '=' 대입 연산자로 오른쪽의 데이터를 왼쪽으로 전달하는 역할
		//실수형 데이터 3.123, 2.111를 저장하는 변수를 생성후 비교연산의 결과를 출력
		double f1 = 3.123;
		double f2 = 2.111;
		System.out.println("f1 == f2 : " + (f1 == f2));
		System.out.println("f1 != f2 : " + (f1 != f2));
		System.out.println("f1 < f2 : " + (f1 < f2));
		System.out.println("f1 > f2 : " + (f1 > f2));
		System.out.println("f1 <= f2 : " + (f1 <= f2));
		System.out.println("f1 >= f2 : " + (f1 >= f2));
		
		
		//3. 대입연산자
		// A = B : 연산의 방향이 오른쪽에서 왼쪽으로 실행
		// + 산술연산자 : 복합 대입 연산자
		// (+=, -=, *=, /=, %=)
		// A += B <=> A = A + B
		// A -= B <=> A = A - B
		// A *= B <=> A = A * B
		// A /= B <=> A = A / B
		// A %= B <=> A = A % B
		
		int a1 = 10;
		System.out.println(a1 += 20);
		System.out.println(a1 -= 20);
		System.out.println(a1 *= 20);
		System.out.println(a1 /= 20);
		System.out.println(a1 %= 20);
		
		//4. 증감연산자(단항연산자)
		// ++A, A++, --A, A++
		// -> 변수의 앞, 뒤에 붙어서 1증가, 1감소 연산
		int A = 100;
		System.out.println("A : " + A);
		A++;
		System.out.println("A : " + A);
		++A;
		System.out.println("A : " + A);
		
		A = 100;
		System.out.println("A++ : " + (A++));
		System.out.println("A : " + A);
		System.out.println("++A : " + (++A));
		
		//++A 전위 연산자, A++ 후위 연산자
		//전위 연산자는 변수 A를 실행할 때 증가 / 감소
		//후위 연산자는 변수 A를 사용하고 증가 / 감소
		
		System.out.println("--A : " + (--A));
		System.out.println("--A : " + (--A));
		System.out.println("A : " + A);
		
		//5. 논리연산자
		// &&, ||, !
		// => boolean 타입의 데이터를 사용한 연산
		//<논리표>
		// A	B	&&	||
		// T	T	T	T
		// T	F	F	T	
		// F	T	F	T
		// F	F 	F	F
		boolean T = true;
		boolean F = false;
		System.out.println("T && T = " + (T&&T));
		System.out.println("T && F = " + (T&&F));
		System.out.println("F && T = " + (F&&T));
		System.out.println("F && F = " + (F&&F));
		
		System.out.println("T || T = " + (T||T));
		System.out.println("T || F = " + (T||F));
		System.out.println("F || T = " + (F||T));
		System.out.println("F || F = " + (F||F));
		
		String name = null;
		System.out.println((4<2) && name.length() ==4);
		//System.out.println((4>2) && name.length() ==4);
		//에러 발생
		//=> 논리 연산을 사용해서 효율적인 계산이 가능하다 
		
		// 비트연산자 (& | ^ ~)
		
		//6. 삼항 (조건) 연산자
		// 조건식 ? 값1 : 값 2
		// if문 보다 속도가 빠르다

		System.out.println((100 > 200) ? "100이 크다" : "200이 크다");
		// 삼항 조건 연산자를 사용해서 양수 인지를 판별하시오
		double data =-100.44;
		System.out.println(data > 0 ? "양수": "양수가 아니다");
		System.out.println(data < 0 ? "음수": "음수가 아니다");
		// data 값이 정수 인지를 판별하시오
		System.out.println((data>0)? "양수" : (data<0)? "음수" : "0");
		System.out.println(data - (int)data == 0 ? "정수" : "정수가 아니다");
		
		//과일 107개 , 상자에는 과일을 5개씩 저장 가능
		//필요한 상자의 개수는 ? (단, 상자를 5개씩 채우고 남는 과일이 있을 경우 새로운 상자를 사용해서 담는다)
		int fruit1 = 107;
		int sizeOfBox1 = 5;
		System.out.println(fruit1 % sizeOfBox1 ==0 ? fruit1 / sizeOfBox1 : fruit1 / sizeOfBox1 + 1);
	}
}
