import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//조건식 만들기
		//1) int형 변수 x가 10보다 크고, 20보다 작을때 true x>10 && x < 20
		//2) char형 변수 ch가 'x' 또는 'X'일때 true ch == 'x' || ch == 'X'
		//3) char형 변수 ch가 영문자일때 ture(대문자) ch >= 'A' && ch <= 'Z'
		//4) int형 변수 y가 400으로 나누어 떨어지거나 또는 4로 나눠 떨어지고, 100으로 나누어 떨어지지 않을때  true (y % 400 == 0 || y % 4 == 0) && y % 100 != 0
		//5) boolean형 변수 powerOn false일때 true  !powerOn
		
		int sum = 0;
		//1~20까지 정수 중에서 2의 배수 또는 3의 배수가 아닌 수의 총합을 계산
		for (int i = 1; i <=20; i++) {
			if(i%2== 0 ||i % 3 == 0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("\n================================================");
		sum = 0;
		//두 개의 주사위 던져서, 눈의 합이 6이 되는 경우의 수를 계산
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + " + " + j +" = " + (i + j));
					sum ++;
				}
			}
		}
		System.out.println("총 : "+ sum +"개");
		System.out.println("\n================================================");
		//방정식 2x + 4y = 10을 만족하는 모든 해를 구하시오 
		//단, x,y는 정수 (0<=x<=10, 0<=y<=10) 
		System.out.println("방정식의 해는 ");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if(i * 2 + j * 4 == 10) {
					System.out.println("(" + i +", "+j + ")");
					
				}
			}
		}
		System.out.println("\n================================================");
		//피보나치 수열
		// 1 1 2 3 5 8 13 21 34 55 ....
		int num = 1;
		int num2 = 1;
		System.out.print(num +", ");
		System.out.print(num2 +", ");
		
		for (int i = 0; i < 8; i++) {
			sum = num + num2;
			if (i != 9) System.out.print(sum + ", ");
			else System.out.println(sum);
			num = num2;
			num2 = sum;
		}
		System.out.println("\n================================================");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("\n================================================");
		int i1 = 0;
		int j1 = 0;
		while(i1 <= 10){
			while(j1 <= i1){
				System.out.print(" * ");
				j1++;
			}
			System.out.println();
			j1 = 0;
			i1++;
		}
		System.out.println("\n================================================");
		//다음 계산의 결과를 출력하시오
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+..+10)
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 += i;
			sum2 += sum1;
		}
		System.out.println(sum2);
		System.out.println("\n================================================");
		//1 + (-2) + 3 + (-4)
		sum = 0;
		for (int i = 1;;i++) {
			if(i % 2 == 0){
				sum -= i;
			}
			else sum += i;
			if(sum == 100){
				System.out.println("100은 " + i +"일때 된다");
				break;
			}
		}
		System.out.println("\n================================================");
		sum = 0;
		num = 0;
		int s = 1;
		for (int i = 1; sum < 100; i++ ,s=-s) {
			num = i * s;
			sum += num;
		}
		
	}	
	
}
