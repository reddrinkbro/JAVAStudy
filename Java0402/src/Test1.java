
public class Test1 {
	public static void main(String[] args)
	{
		//�⺻�� Ÿ��
		/*byte - 1byte
		short  - 2byte
		int  - 4byte
		long  - 8byte
		float  - 4byte
		double  - 8byte
		char  - 2byte
		boolean  - 2byte */
		
		byte a = 11;
		byte b = 29;
		byte c = (byte)(a + b);

		//System.out.println("c : " + c);
		
		char ch = 'A';
		ch += 6;
		//ch = ch + 6; �� ������ ���� char -> int�� �ڵ� ��ȯ�� ������ int -> char�� �ڵ� ��ȯ�� ���� �ʴ´�
		ch = (char)(ch + 6);
		System.out.println("ch : " + ch);
		
		char ch2 = 'G';
		//System.out.println("ch2 : " + ch2 - 6);
		// ch2 : �� ch2 ���� string ���ε� -6�� �ҷ��� �ϴ� string������ - ������ ���⶧���� ������ �߻��Ѵ�
		System.out.println("ch2 : " + (char)(ch2 - 6));
		
		int ch3 = 'A';
		//�ڵ� ����ȯ
		System.out.println("ch3 : "+ ch3);
		
		float f = 3 / 2f;
		//float f = 3 / 2;
		//���� ���� ������ �ϰ� ���� ������ ����Ǳ� ������ ���������� ��� ���� ����ȴ�
		System.out.println("f : " + f);
		
		float f2 = 3.0f / 2f;
		//float f2 = 3.0 / 2f;
		//3.0�� �ƹ��� ǥ�ð� ���� ������ �Ǽ��� �⺻Ÿ���� double���̵Ǹ� float�� ����ȯ�� �ȵȴ�
		System.out.println("f2 : " + f2);
		
		long l = 3000 * 3000 * 3000l;
		//long l = 3000*3000*3000;
		// ������ ���� ����� intŸ���̸� int�� ������ ū���� �����⶧���� �߸��� ���� �Էµȴ�
		System.out.println("l : " + l);
	}
}