

public class Test2 {
	//���� ����
	
	public static void hello() {
		System.out.println("�ȳ��ϼ��� ȫ�浿 �Դϴ�.");
	}
	public static void sumNumber(int num){
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void inputNumber(int num){
		System.out.println("�Է°� : " + num);
	}
	public static void chNumber1(int num){
		if(num > 0) System.out.println("���");
		else if(num < 0) System.out.println("����");
		else System.out.println("0");
	}
	public static void chNumber2(int num){
		if(num % 2 == 1) System.out.println("Ȧ��");
		else System.out.println("¦��");
	}
	public static void absNumber(int num){
		if(num < 0) num = -num;
		System.out.println(num);
	}
	public static double APlusB(double a, double b){
		return a + b;
	}
	public static void myInfo(String name, int num, int ipnum)
	{
		System.out.println(name + "���� "+ num + "�����忡 x.x.x." +ipnum +"�� �ڸ��� �ֽ��ϴ�.");	
	}
	public static void main(String[] args) {
		// "�ȳ��ϼ��� ȫ�浿�Դϴ�"
		//����ϴ� �޼��� ����
		//public static
		//���� Ÿ�� x, �������� x => �޼��� ���
		hello();
		System.out.println("------------------------------------------------");
		//public static, ����Ÿ�� x, ������ Ÿ���� ������ 1���� �ʿ�� �ϴ� �޼���
		//inputNumber() => ������ ���� ������ִ� �޼��� "�Է°� : 00"
		inputNumber(123);
		//public static, ����Ÿ�� x, ������ Ÿ���� ������ 1���� �ʿ�� �ϴ� �޼���
		// chNumber1(): ���� ���� ���� ���/���� �Ǻ� 
		// chNumber2(): ���� ���� ���� Ȧ�� / ¦�� �Ǻ�
		chNumber1(-123);
		chNumber2(12);
		//public static, ����Ÿ�� x, ������ Ÿ���� ������ 1���� �ʿ�� �ϴ� �޼���
		//sumNumber 1~������ ���ڱ����� ��
		sumNumber(10000);
		//public static, ����Ÿ�� x, ������ Ÿ���� ������ 1���� �ʿ�� �ϴ� �޼���
		//absNumber �ش��Է¹��� ������ ���밪�� ���
		absNumber(114);
		//public static, ���� : ������ ��� , �Ǽ��� Ÿ���� ������ 2���� �Է��ؼ�
		//�ΰ��� ���� ���� ����ϴ� �޼��� APlusB() -> ���
		System.out.println(APlusB(15.34,13.567));
		//public static, ����Ÿ�� x , ������ 3���� �Է��ؼ�
		// MyInfo(), ������� �̸�, ������ ��ȣ, �ڽ��� ��ġ
		myInfo("ȫ�浿",6,20);
		//public static, ���� : ���� ������ ����� ���� , ������ 3���� �Է��ؼ�
		//sumSubject ���� ���� 3���� ���� �����ϴ� �޼��� ����
		//avgSubject ���� ���� 3���� ����� �����ϴ� �޼��� ����
		System.out.println("3������ �� :"+ sumSubject(100,50,68));
		System.out.println("3������ ���:" + avgSubject(100,50,68) );
		
	}
	public static int sumSubject(int subject1, int subject2, int subject3){
		return subject1 + subject2 + subject3;
	}
	
	public static double avgSubject(int subject1, int subject2, int subject3){
		// �ݿø����ϱ�
		// return (int)(sumSubject(subject1, subject2, subject3)/3.0 *10 +0.5)/10.0;
		return (double)(subject1 + subject2 + subject3)/3;
	}

}