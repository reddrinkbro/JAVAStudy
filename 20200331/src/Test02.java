
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
		

		
	}
}
