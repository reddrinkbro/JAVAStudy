import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		//switch ~ case
		//�� ���̽����� break���� ������ ����ȴ�
		//�ش� ���̽��� break���� ���� ��� ���� break���� ã�������� ��� �ڵ带 �����Ų��(�ش� ���̽��� �ƴϾ ����ȴ�)
		//default�� / ������ ���̽��� ������ ����
		//������ : ����������, ��, ������(char), ���ڿ�(�ѱ�/����)
		/*switch (������) {
		case ��1:
			���๮;
			[break;]
		case ��2:
			���๮;
			[break;]
		default:
			���๮;
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
			System.out.println("�ش���� ����");
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
			System.out.println("�ش���� ����");
			break;
		}
		System.out.println("-----------------------------------------");
		
		String value = "�ѱ�";
		switch (value) {
		case "�ѱ�":
			System.out.println("�ѱ��Դϴ�.");
			break;
		case "�̱�":
			System.out.println("�̱��Դϴ�.");
			break;
		case "�߱�":
			System.out.println("�߱��Դϴ�.");
			break;
		default:
			break;
		}
		System.out.println("-----------------------------------------");
		//Ű���� �Է��ؼ� ������ �Է�
		//�л��� ������ ����ϴ� ���α׷� ����
		// switch case ���
		// 100~ 90(a),89~ 80(b),79~ 70(c),69~ 60(d),59~ 0(e),������ (����)
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
			System.out.println("����");
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
			System.out.println("����");
			break;
		}
		
		
	}

}