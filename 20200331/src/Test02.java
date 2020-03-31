
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
		
	}
}
