
public class Test2 {

	public static void main(String[] args) {
		//���� �ǵ� ���α׷� ����
		//���ڷθ� �̷���� ���ڿ��� ��츸 ���ڷ� �Ǵ�
		//���ڿ�(String) �����Ͱ� ������ �濡 ���� ����. ������ ��ȣ�� 0������ ����
		//charAt(��ġ) => �ش���ġ�� ���� �����͸� ������ �� ����
		String str = "12!32131";
		char ch = ' ';
		boolean isNumber = false;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			isNumber = true;
			if(!(ch >= '0' && ch <= '9')){
				System.out.println("���ڰ� �ƴϴ�");
				isNumber = false;
				break;
			}
		}
		if(isNumber) System.out.println("���� �Դϴ�");
	}

}