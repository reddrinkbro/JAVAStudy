import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		//��ȣȭ ���α׷� �ۼ�
		//
		
		//����� �Է�
		Scanner scan = new Scanner(System.in);
		String input = "ABDCDS"/*scan.nextLine()*/;
		
		char[] charArr = new char[36];
		char[] charArr1 = {
			'`','~','!','@',
			'#','$','%','^',
			'&','*','(',')',
			'-','_','+','=',
			'|','[',']','{',
			'}',';',':',',',
			'.','/','Q','W',
			'E','R','T','Y',
			'U','I','O','P',
		};
		char a = 'A';
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = a;
			a++;
		}
		a = '0';
		for (int i = 26; i < charArr.length; i++) {
			charArr[i] = a;
			a++;
		}
		//��ȣȭ ó��
		//��ȣȭ ��� ���
		char tmp;
		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);
			for (int j = 0; j < charArr.length; j++) {
				if(tmp == charArr[j]) System.out.print(charArr1[j] + " ");
			}
		}
		
		//��ȣȭ
		/*char tmp;
		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);
			for (int j = 0; j < charArr1.length; j++) {
				if(tmp == charArr1[j]) System.out.println(charArr[j]);
			}
		}*/
		
	}

}