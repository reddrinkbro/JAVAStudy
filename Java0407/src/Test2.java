import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//반복문
		//for, while, do-while
		//for (초기식;조건식;증감식){
				//반복할 문장
		//}
		/*for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n-------------------------------------");
		int dan = 2;//scan.nextInt();
		System.out.println("구구단 " + dan +"단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan +" * "+ i + " = " + dan * i);
		}
		System.out.println("\n-------------------------------------");
		//반복문 사용 누적연산
		//1~10까지의 합을 출력하시오
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합 : " + sum);
		System.out.println("\n-------------------------------------");
		//팩토리얼
		int fact = scan.nextInt();
		int result = 1;
		for (int i = 1; i <= fact; i++) {
			result *= i;
		}
		System.out.println(fact +" 팩토리얼 : " + result);*/
		
		//숙제 1
		int input = scan.nextInt();
		int ten = input / 10;
		int one = input % 10;
		if( input <1 || input >99){
			System.out.println("잘못된 값이 입력되었습니다.");
		}
		else{
			if(input >= 10){
				if(ten % 3 == 0 && one % 3 == 0 && input >=10){
					System.out.print("박수 짝짝 (" + input +")");
				}
				else if(ten % 3 == 0 || one % 3 == 0){
						System.out.print("박수 짝 (" + input +")");
				}
				else{
					System.out.print("박수 없음 (" + input +")");
				}
			}
			else{
				if(one % 3 == 0)
					System.out.print("박수 짝 (" + input +")");
				else{
					System.out.print("박수 없음 (" + input +")");
				}
			}
		}

		//숙제 2
		/*double input1 = scan.nextDouble();
		String oper = scan.next();
		double input2 = scan.nextDouble();
		
		switch (oper) {
		case "+":
			System.out.println(input1 + input2);
			break;
		case "-":
			System.out.println(input1 - input2);
			break;
		case "*":
			System.out.println(input1 * input2);
			break;
		case "/":
			if(input2 != 0)
				System.out.println(input1 / input2);
			else
				System.out.println("에러발생 : 0으로 나눌수 없습니다");
			break;
		default:
			System.out.println("입력이 잘못되었습니다");
			break;
		}*/
	}

}

