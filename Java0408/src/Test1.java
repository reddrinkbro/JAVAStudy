
public class Test1 {

	public static void main(String[] args) {
		//while()��
		/*while(���ǽ�){
			�ݺ��� �ڵ�
			������
		}*/
		//whlie �ݺ����� �׻� ���ǹ��� ���� �����Ѵ�
		//1 ~ 10���� ���
		/*for(int i = 1 ; i <= 10; i++ )
		{
			System.out.print(i + " ");
		}
		System.out.println();
		int a = 1;
		while(a<=10){
			System.out.print(a++ + " ");
		}
		System.out.println("\n-----------------------------------------");
		a = 1;
		while(a<=10){
			System.out.print(a + " ");
			a+=2;
		}
		System.out.println("\n-----------------------------------------");
		
		a = 1;
		while(a<=4){
			a++;
			System.out.print(a+" ");
		}
		System.out.println("\n-----------------------------------------");
		int sum = 0;
		a = 1;
		while(a <= 10){
			sum +=a;
			a++;
		}
		System.out.print(sum+ " ");
		System.out.println("\n-----------------------------------------");
		sum = 0;
		a = 2;
		while(a <= 8){
			sum +=a;
			a+=2;
		} 
		System.out.print((sum + a)+ " ");/*
		//do-while��
		/*�ʱ��;
		do{
			�ݺ��� �ڵ�;
			������;
		}while(���ǽ�);*/
		System.out.println("\n-----------------------------------------");
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i<=5);
		System.out.println("\n-----------------------------------------");
		i = 1;
		do {
			System.out.print(i + " ");
		} while (i++<=5);
		System.out.println("\n-----------------------------------------");
		//�ݺ����� ��� �ݺ��� �ڵ��� ������ ������ ��� ��ȣ�� ��������
		i=0;
		while(i++<=4);
		System.out.println(i+" ");

	}

}