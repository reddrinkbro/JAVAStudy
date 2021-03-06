import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//분기문 if -> 하나의 조건이 만족할때 실행하는 코드
		
		//if - else문
		/*if(조건문){
			조건문의 결과가 참일때 실행
		}else{
			조건문의 결과가 참이 아닐때 실행
		}*/
		
		// 정수형타입의 변수 생성후 123이라고 하는 리터럴값을 저장
		// 변수의 값이 홀수/짝수 판별
		int a = 123;
		if(a % 2 == 1)
		{
			System.out.println("홀수 입니다");
		}
		else{
			System.out.println("짝수 입니다");
		}
		
		//절대값 계산
		int num = -150;
		if(num < 0){
			num = -num; 
		}
		num = (num > 0)? num : -num ;
		Math.abs(num);
		System.out.println(num);
		
		//변수의 값이 정수인가를 판단
		if (num > 0){
			System.out.println("양수 입니다");
		}
		else if(num < 0){
			System.out.println("음수 입니다");
		}
		else{
			System.out.println("0 입니다");
		}
		//여러개의 조건문을 해결 할때는 항상 else 구문과 함께 사용해서
		//처리하는 것이 안전한 데이터처리 방법이다.
		
		//점수를 저장하는 변수 score 생성
		//점수 입력 88 점
		//90 ~ 100 => A
		//80 ~ 89 => B
		//70 ~ 79 => C
		//60 ~ 69 => D
		//그외 나머지 => F
		//조건을 보고 알맞은 학점을 출력하시오
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		//score = Integer.parseInt(args[0]);
		if(score >= 90 && score <= 100) System.out.println("A");
		else if(score >= 80 && score <= 89) System.out.println("B");
		else if(score >= 70 && score <= 79) System.out.println("C");
		else if(score >= 60 && score <= 69) System.out.println("D");
		else System.out.println("F");

		//키보드 값 입력하기(스캐너)
		scan.nextLine(); // 버퍼를 비워주면 밑에 스캐너가 동작한다
		String input = scan.nextLine();
		
		System.out.println(input);
		
		
	}

}
