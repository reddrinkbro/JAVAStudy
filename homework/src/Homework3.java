
public class Homework3 {

	public static void main(String[] args) {
		//���ﰢ��
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j)System.out.print("*");				}
			System.out.println();
		}
		//90�� ȸ�� �ﰢ��
		System.out.println("\n========================================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//�߰� ����
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				if(i > j) {
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println(num + " ");
			num++;
		}
		num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j){
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println();
		}
	}

}