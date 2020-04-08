import java.util.*;
public class Homework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double input1 = scan.nextDouble();
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
		}
	}

}
