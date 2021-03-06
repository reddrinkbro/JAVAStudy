import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		//switch ~ case
		//각 케이스에서 break문을 만나면 종료된다
		//해당 케이스에 break문이 없을 경우 다음 break문을 찾을때까지 모든 코드를 실행시킨다(해당 케이스가 아니어도 실행된다)
		//default문 / 마지막 케이스를 만나면 종료
		//정수식 : 정수형변수, 값, 문자형(char), 문자열(한글/영어)
		/*switch (정수식) {
		case 값1:
			실행문;
			[break;]
		case 값2:
			실행문;
			[break;]
		default:
			실행문;
			break;
		}
		*/
		int num = 10;
		switch (num) {
		case 8:
			System.out.println("8");
			break;
		case 9:
			System.out.println("9");
			break;
		case 10:
			System.out.println("10");
			break;
		default:
			System.out.println("해당사항 없음");
			break;
		}
		System.out.println("-----------------------------------------");
		char ch = 'g';
		switch (ch) {
		case 'a':
			System.out.println("A");
			break;
		case 'g':
			System.out.println("B");
			break;
		case 'h':
			System.out.println("C");
			break;
		case 'z':
			System.out.println("D");
			break;
		default:
			System.out.println("해당사항 없음");
			break;
		}
		System.out.println("-----------------------------------------");
		
		String value = "한국";
		switch (value) {
		case "한국":
			System.out.println("한국입니다.");
			break;
		case "미국":
			System.out.println("미국입니다.");
			break;
		case "중국":
			System.out.println("중국입니다.");
			break;
		default:
			break;
		}
		System.out.println("-----------------------------------------");
		//키보드 입력해서 점수를 입력
		//학생의 학점을 출력하는 프로그램 생성
		// switch case 사용
		// 100~ 90(a),89~ 80(b),79~ 70(c),69~ 60(d),59~ 0(e),나머지 (에러)
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(0<=score && score <=100){
			
		}
		/*switch ((score >= 90 && score <=100)? 1:(score >= 80 && score <=89)? 2:(score >= 70 && score <=79)? 3:
			(score >= 60 && score <=69)? 4:(score >= 0 && score <=50)? 5:0) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		case 5:
			System.out.println("F");
			break;
		default:
			System.out.println("에러");
			break;
		}*/
		switch ((int)score /10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("F");
			break;
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("에러");
			break;
		}
		
		
	}

}
