import java.util.*;
public class Test1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		/*int i;
		int j;
		i = 20;
		j = 30;	
		System.out.println(i + j);
		int key = 2;
		switch (key) {
			case 1:
				System.out.println("옵션1");
				break;
			case 2:
				System.out.println("옵션2");
				break;
			case 3:
				System.out.println("옵션3");
				break;
			default:
				System.out.println("옵션4");
				break;
		}*/
		//두 정수의 합을 출력하는 코드를 작성
	/*	int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1 + " + " + num2 +" = "+ (int)(num1+num2));*/
		
		//직사각형 안의 점
		
/*		int numX;
		int numY;
		
		numX = scan.nextInt();
		numY = scan.nextInt();
		if((numX>=50 && numX <=100) && (numY >=50 && numY <=100)){
			System.out.println("사각형 내에 있다");
		}
		else{
			System.out.println("사각형 밖에 있다");
		}*/
		
		//키보드 입력을 통해서 참, 거짓의 값을 입력, 논리연산("and","or")
		//논리 연산을 진행하려고 할때 해당 동작을 구현하시오
		/*boolean b1 = scan.nextBoolean();
		boolean b2 = scan.nextBoolean();
		scan.nextLine();
		String s = scan.nextLine();
		
		switch (s) {
		case "and":
		case "AND":
			System.out.println(b1 && b2);
			break;
		case "or":
		case "OR":
			System.out.println(b1 || b2);
			break;
		default:
			break;
		}*/
		//정수데이터(돈), 입력받은 돈을 각각의 단위로 바꿔서 출력
		//5만원, 1만원, 5천원, 1천원, 500원, 100원, 10원, 1원
		//65245원 (금액 변환 조건 : 항상 상위권종에 대해서 처리가 끝난후 다음으로 처리)
		
		int money = scan.nextInt();
		
		
		
		int[] moneyArr = {50000,10000,5000,1000,500,100,10,1};
		int[] num = new int[8];
		for (int i = 0; i < moneyArr.length; i++) {
			if(money / moneyArr[i] > 0){ 
				num[i] = (int)(money / moneyArr[i]);
				money -= (int)(money / moneyArr[i]) * moneyArr[i];
			}
			else num[i] = 0;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}
