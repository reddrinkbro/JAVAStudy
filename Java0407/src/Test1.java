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
				System.out.println("�ɼ�1");
				break;
			case 2:
				System.out.println("�ɼ�2");
				break;
			case 3:
				System.out.println("�ɼ�3");
				break;
			default:
				System.out.println("�ɼ�4");
				break;
		}*/
		//�� ������ ���� ����ϴ� �ڵ带 �ۼ�
	/*	int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1 + " + " + num2 +" = "+ (int)(num1+num2));*/
		
		//���簢�� ���� ��
		
/*		int numX;
		int numY;
		
		numX = scan.nextInt();
		numY = scan.nextInt();
		if((numX>=50 && numX <=100) && (numY >=50 && numY <=100)){
			System.out.println("�簢�� ���� �ִ�");
		}
		else{
			System.out.println("�簢�� �ۿ� �ִ�");
		}*/
		
		//Ű���� �Է��� ���ؼ� ��, ������ ���� �Է�, ��������("and","or")
		//���� ������ �����Ϸ��� �Ҷ� �ش� ������ �����Ͻÿ�
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
		//����������(��), �Է¹��� ���� ������ ������ �ٲ㼭 ���
		//5����, 1����, 5õ��, 1õ��, 500��, 100��, 10��, 1��
		//65245�� (�ݾ� ��ȯ ���� : �׻� ���������� ���ؼ� ó���� ������ �������� ó��)
		
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