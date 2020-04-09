

public class test2 {

	public static void main(String[] args) {
		// 제어문 활용(분기문, 반복문)
		//1~10 홀수, 짝수의 합을 각각계산후 출력 for
		int sumEven =0;
		int sumOdd =0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1){
				sumOdd += i;
			}
			else{
				sumEven += i;
			}
		}
		System.out.println("홀수의 합 : " + sumOdd + " 짝수의 합 : " + sumEven);
		System.out.println("\n========================================");
		//이중 for문
		/*for(초기식;조건식;증감식){
			for(초기식;조건식;증감식){	
			}
		}*/
		/*for (int i = 2; i <= 9; i++) {
			System.out.println("구구단 " + i +"단 ");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}	*/
		//별그리기
		//1. 세로로 5개
		
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		//2. 가로로 5개
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println("\n========================================");
		//3. 5x5 별 그리기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n========================================");
		//4. 삼각형 만들기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				if(i > j) System.out.print("*");
			}
			
			System.out.println("*");
		}
		System.out.println("\n========================================");
		//역삼각형
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j)System.out.print("*");
			}
			System.out.println();
		}
		//90도 회전 삼각형
		System.out.println("\n========================================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				if(i > j) {
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println(num + " ");
			num++;
		}
		num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j){
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println();
		}
		/*long a = 1000000000l;
		int b = 10;
		while(b>0)
		{
			a--;
			if(a<0){
				System.out.println(b);
				b--;
				a = 1000000000l;
			}
		}*/
		for (int i = 1; i < 11; i++) {
			if(i%3 == 0)break;
			System.out.println(i + " ");
		}
		System.out.println("\n========================================");
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if(j % 3 == 0) break;
				System.out.println("i : "+ i +", j : " + j);
			}
		}
		//레이블을 사용하여 원하는 위치의 반복문을 탈출
		for (int i = 1; i < 11; i++) {
			if(i%3 == 0)break;
			System.out.println(i + " ");
		}
		System.out.println("\n========================================");
		
		exit_for:
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if(j % 3 == 0) 
					break exit_for;
				System.out.println("i : "+ i +", j : " + j);
			}
		}
		
		//무한루프 (무한 반복문)
		/*for (;;) {	
		}
		for (;true;) {
		}
		while(true){}
		do{}while(true);*/
	}

}
