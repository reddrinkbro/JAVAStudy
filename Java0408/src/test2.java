

public class test2 {

	public static void main(String[] args) {
		// ��� Ȱ��(�б⹮, �ݺ���)
		//1~10 Ȧ��, ¦���� ���� ��������� ��� for
		int sumEven =0;
		int sumOdd =0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1){
				sumOdd += i;
			}
			else{
				sumEven += i;
			}
		}
		System.out.println("Ȧ���� �� : " + sumOdd + " ¦���� �� : " + sumEven);
		System.out.println("\n========================================");
		//���� for��
		/*for(�ʱ��;���ǽ�;������){
			for(�ʱ��;���ǽ�;������){	
			}
		}*/
		/*for (int i = 2; i <= 9; i++) {
			System.out.println("������ " + i +"�� ");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}	*/
		//���׸���
		//1. ���η� 5��
		
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		//2. ���η� 5��
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println("\n========================================");
		//3. 5x5 �� �׸���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n========================================");
		//4. �ﰢ�� �����
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <i; j++) {
				if(i > j) System.out.print("*");
			}
			
			System.out.println("*");
		}
		System.out.println("\n========================================");
		//���ﰢ��
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i<=j)System.out.print("*");
			}
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
		/*long a = 1000000000l;
		int b = 10;
		while(b>0)
		{
			a--;
			if(a<0){
				System.out.println(b);
				b--;
				a = 1000000000l;
			}
		}*/
		for (int i = 1; i < 11; i++) {
			if(i%3 == 0)break;
			System.out.println(i + " ");
		}
		System.out.println("\n========================================");
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if(j % 3 == 0) break;
				System.out.println("i : "+ i +", j : " + j);
			}
		}
		//���̺��� ����Ͽ� ���ϴ� ��ġ�� �ݺ����� Ż��
		for (int i = 1; i < 11; i++) {
			if(i%3 == 0)break;
			System.out.println(i + " ");
		}
		System.out.println("\n========================================");
		
		exit_for:
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if(j % 3 == 0) 
					break exit_for;
				System.out.println("i : "+ i +", j : " + j);
			}
		}
		
		//���ѷ��� (���� �ݺ���)
		/*for (;;) {	
		}
		for (;true;) {
		}
		while(true){}
		do{}while(true);*/
	}

}