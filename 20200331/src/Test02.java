import java.util.logging.LogManager;

public class Test02 {
	public static void main(String[] args)
	{
		//������
		
		//1. ��� ������ (+,-,*,/,%)
		System.out.println("10 + 20 = " + (10 + 20));
		System.out.println("10 - 20 = " + (10 - 20));
		System.out.println("10 * 20 = " + (10 * 20));
		System.out.println("10 / 20 = " + (10 / 20d));
		System.out.println("10 % 20 = " + (10 % 20));
		
		//���� 25���� �ѻ��ڿ� 5���� ���� ������ ���ڸ� ����ؼ�
		//�����Ϸ��� �Ѵ�. �̶� �ʿ��� ������ ������
		int fruit = 25;
		int sizeOfBox = 5;
		System.out.println("�ʿ��� ������ ���� : " + (fruit / sizeOfBox) + "��");
		
		int num = 458;
		//����
		num /= 100;
		num *= 100;
		//400
		System.out.println(num);
		
		num = 817;
		System.out.println(num/10 * 10 + 1);
		
		//2. �񱳿�����
		// ==,!= ,<, >, <=, >=
		// * �񱳿����� ����� �׻� boolean Ÿ���̴�.
		
		//A == B : A�� B�� ������?
		//A != B : A��B�� �ٸ���?
		//A < B : A���� B�� ū��?
		//A > B : A���� B�� ������?
		//A <= B : A���� B�� ũ�ų� ������?
		//A >= B : A���� B�� �۰ų� ������?
		// => '=' ���� �����ڷ� �������� �����͸� �������� �����ϴ� ����
		//�Ǽ��� ������ 3.123, 2.111�� �����ϴ� ������ ������ �񱳿����� ����� ���
		double f1 = 3.123;
		double f2 = 2.111;
		System.out.println("f1 == f2 : " + (f1 == f2));
		System.out.println("f1 != f2 : " + (f1 != f2));
		System.out.println("f1 < f2 : " + (f1 < f2));
		System.out.println("f1 > f2 : " + (f1 > f2));
		System.out.println("f1 <= f2 : " + (f1 <= f2));
		System.out.println("f1 >= f2 : " + (f1 >= f2));
		
		
		//3. ���Կ�����
		// A = B : ������ ������ �����ʿ��� �������� ����
		// + ��������� : ���� ���� ������
		// (+=, -=, *=, /=, %=)
		// A += B <=> A = A + B
		// A -= B <=> A = A - B
		// A *= B <=> A = A * B
		// A /= B <=> A = A / B
		// A %= B <=> A = A % B
		
		int a1 = 10;
		System.out.println(a1 += 20);
		System.out.println(a1 -= 20);
		System.out.println(a1 *= 20);
		System.out.println(a1 /= 20);
		System.out.println(a1 %= 20);
		
		//4. ����������(���׿�����)
		// ++A, A++, --A, A++
		// -> ������ ��, �ڿ� �پ 1����, 1���� ����
		int A = 100;
		System.out.println("A : " + A);
		A++;
		System.out.println("A : " + A);
		++A;
		System.out.println("A : " + A);
		
		A = 100;
		System.out.println("A++ : " + (A++));
		System.out.println("A : " + A);
		System.out.println("++A : " + (++A));
		
		//++A ���� ������, A++ ���� ������
		//���� �����ڴ� ���� A�� ������ �� ���� / ����
		//���� �����ڴ� ���� A�� ����ϰ� ���� / ����
		
		System.out.println("--A : " + (--A));
		System.out.println("--A : " + (--A));
		System.out.println("A : " + A);
		
		//5. ����������
		// &&, ||, !
		// => boolean Ÿ���� �����͸� ����� ����
		//<����ǥ>
		// A	B	&&	||
		// T	T	T	T
		// T	F	F	T	
		// F	T	F	T
		// F	F 	F	F
		boolean T = true;
		boolean F = false;
		System.out.println("T && T = " + (T&&T));
		System.out.println("T && F = " + (T&&F));
		System.out.println("F && T = " + (F&&T));
		System.out.println("F && F = " + (F&&F));
		
		System.out.println("T || T = " + (T||T));
		System.out.println("T || F = " + (T||F));
		System.out.println("F || T = " + (F||T));
		System.out.println("F || F = " + (F||F));
		
		String name = null;
		System.out.println((4<2) && name.length() ==4);
		//System.out.println((4>2) && name.length() ==4);
		//���� �߻�
		//=> ���� ������ ����ؼ� ȿ������ ����� �����ϴ� 
		
		// ��Ʈ������ (& | ^ ~)
		
		//6. ���� (����) ������
		// ���ǽ� ? ��1 : �� 2
		// if�� ���� �ӵ��� ������

		System.out.println((100 > 200) ? "100�� ũ��" : "200�� ũ��");
		// ���� ���� �����ڸ� ����ؼ� ��� ������ �Ǻ��Ͻÿ�
		double data =-100.44;
		System.out.println(data > 0 ? "���": "����� �ƴϴ�");
		System.out.println(data < 0 ? "����": "������ �ƴϴ�");
		// data ���� ���� ������ �Ǻ��Ͻÿ�
		System.out.println((data>0)? "���" : (data<0)? "����" : "0");
		System.out.println(data - (int)data == 0 ? "����" : "������ �ƴϴ�");
		
		//���� 107�� , ���ڿ��� ������ 5���� ���� ����
		//�ʿ��� ������ ������ ? (��, ���ڸ� 5���� ä��� ���� ������ ���� ��� ���ο� ���ڸ� ����ؼ� ��´�)
		int fruit1 = 107;
		int sizeOfBox1 = 5;
		System.out.println(fruit1 % sizeOfBox1 ==0 ? fruit1 / sizeOfBox1 : fruit1 / sizeOfBox1 + 1);
	}
}