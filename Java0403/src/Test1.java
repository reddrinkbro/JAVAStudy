import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//�б⹮ if -> �ϳ��� ������ �����Ҷ� �����ϴ� �ڵ�
		
		//if - else��
		/*if(���ǹ�){
			���ǹ��� ����� ���϶� ����
		}else{
			���ǹ��� ����� ���� �ƴҶ� ����
		}*/
		
		// ������Ÿ���� ���� ������ 123�̶�� �ϴ� ���ͷ����� ����
		// ������ ���� Ȧ��/¦�� �Ǻ�
		int a = 123;
		if(a % 2 == 1)
		{
			System.out.println("Ȧ�� �Դϴ�");
		}
		else{
			System.out.println("¦�� �Դϴ�");
		}
		
		//���밪 ���
		int num = -150;
		if(num < 0){
			num = -num; 
		}
		num = (num > 0)? num : -num ;
		Math.abs(num);
		System.out.println(num);
		
		//������ ���� �����ΰ��� �Ǵ�
		if (num > 0){
			System.out.println("��� �Դϴ�");
		}
		else if(num < 0){
			System.out.println("���� �Դϴ�");
		}
		else{
			System.out.println("0 �Դϴ�");
		}
		//�������� ���ǹ��� �ذ� �Ҷ��� �׻� else ������ �Բ� ����ؼ�
		//ó���ϴ� ���� ������ ������ó�� ����̴�.
		
		//������ �����ϴ� ���� score ����
		//���� �Է� 88 ��
		//90 ~ 100 => A
		//80 ~ 89 => B
		//70 ~ 79 => C
		//60 ~ 69 => D
		//�׿� ������ => F
		//������ ���� �˸��� ������ ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		//score = Integer.parseInt(args[0]);
		if(score >= 90 && score <= 100) System.out.println("A");
		else if(score >= 80 && score <= 89) System.out.println("B");
		else if(score >= 70 && score <= 79) System.out.println("C");
		else if(score >= 60 && score <= 69) System.out.println("D");
		else System.out.println("F");

		//Ű���� �� �Է��ϱ�(��ĳ��)
		scan.nextLine(); // ���۸� ����ָ� �ؿ� ��ĳ�ʰ� �����Ѵ�
		String input = scan.nextLine();
		
		System.out.println(input);
		
		
	}

}