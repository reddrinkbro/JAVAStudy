import java.util.*;

import org.omg.CORBA.INTF_REPOS;
public class Test1 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (int)(str.charAt(i) - '0');
		}
		System.out.println("1+2+3+4+5 = " + sum);
		
		System.out.println("\n----------------------------------");
		sum = 0;
		int num = 12345;
		
		for (int i = 0; i < 5; i++) {
			sum += num % 10;
			num /= 10;			
		}
		System.out.println("1+2+3+4+5 = " + sum);
		
		//������ ���� ���� ���� ���ϴ� ���
		/*while(num > 0){
			sum+=num%10;
			num/=10;
		}*/
		
		System.out.println("\n----------------------------------\n\n");
		//���� ã�� ����
		int num1 = (int)(Math.random() * 100 + 1);
		Scanner scan = new Scanner(System.in);
		System.out.println(num1);
		
		int count = 0;
		while (true) {
			int input = scan.nextInt();
			count++;
			if(num1 > input) System.out.println("�����Դϴ�. �� ū���� �Է��ϼ���");
			else if(num1 < input) System.out.println("�����Դϴ�. �� �������� �Է��ϼ���");
			else{
				System.out.println("�����Դϴ�. �� ����Ƚ�� " + count +"ȸ");
				break;
			}
		}
		
	}
	
	

}