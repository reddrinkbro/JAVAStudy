import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//반복문
		//for, while, do-while
		//for (초기식;조건식;증감식){
				//반복할 문장
		//}
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n-------------------------------------");
		for (int i = 1; i <= 10; i+=2) {
			//System.out.print(i + " ");
			//System.out.println((i++)+" ");
			/*System.out.println(i+ " ");
			i++;*/
		}
		for (int i = 1; i <= 10; i++) {
			i++;
			System.out.print(i + " ");
			//System.out.print(++i + " ");
		}
		System.out.println("\n-------------------------------------");
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
		
		
	}

}

