import java.util.Iterator;

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
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * (5 - i + 1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
