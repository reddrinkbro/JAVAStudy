import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//���ǽ� �����
		//1) int�� ���� x�� 10���� ũ��, 20���� ������ true x>10 && x < 20
		//2) char�� ���� ch�� 'x' �Ǵ� 'X'�϶� true ch == 'x' || ch == 'X'
		//3) char�� ���� ch�� �������϶� ture(�빮��) ch >= 'A' && ch <= 'Z'
		//4) int�� ���� y�� 400���� ������ �������ų� �Ǵ� 4�� ���� ��������, 100���� ������ �������� ������  true (y % 400 == 0 || y % 4 == 0) && y % 100 != 0
		//5) boolean�� ���� powerOn false�϶� true  !powerOn
		
		int sum = 0;
		//1~20���� ���� �߿��� 2�� ��� �Ǵ� 3�� ����� �ƴ� ���� ������ ���
		for (int i = 1; i <=20; i++) {
			if(i%2== 0 ||i % 3 == 0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("\n================================================");
		sum = 0;
		//�� ���� �ֻ��� ������, ���� ���� 6�� �Ǵ� ����� ���� ���
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + " + " + j +" = " + (i + j));
					sum ++;
				}
			}
		}
		System.out.println("�� : "+ sum +"��");
		System.out.println("\n================================================");
		//������ 2x + 4y = 10�� �����ϴ� ��� �ظ� ���Ͻÿ� 
		//��, x,y�� ���� (0<=x<=10, 0<=y<=10) 
		System.out.println("�������� �ش� ");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if(i * 2 + j * 4 == 10) {
					System.out.println("(" + i +", "+j + ")");
					
				}
			}
		}
		System.out.println("\n================================================");
		//�Ǻ���ġ ����
		// 1 1 2 3 5 8 13 21 34 55 ....
		int num = 1;
		int num2 = 1;
		System.out.print(num +", ");
		System.out.print(num2 +", ");
		
		for (int i = 2; i < 10; i++) {
			sum = num + num2;
			if (i != 9) System.out.print(sum + ", ");
			else System.out.println(sum);
			num = num2;
			num2 = sum;
		}
	}

}