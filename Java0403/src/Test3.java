import java.util.*;

public class Test3 {
	public static void main(String[] args)
	{
		String msg = "Hello";
		//System.out.println(msg.charAt(5));
		
		//charAt(index)
		//���ڿ������� �ִ� ���߿� �ش� ��ġ�� �ִ� ������ �����͸� �����´�.
		
		msg = "abcae";
		switch (msg.charAt(3)) {
		case 'a':
		case 'A':
			System.out.println("Apple");
			break;
		case 'b':
		case 'B':
			System.out.println("Banana");
			break;
		case 'g':
		case 'G':
			System.out.println("Grape");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("ó�� �Ұ����� ���� �Դϴ�.");
			break;
		}
	}
}