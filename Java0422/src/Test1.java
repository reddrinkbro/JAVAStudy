import java.util.Arrays;


public class Test1 {

	public static void main(String[] args) {
		System.out.println(isNumber("0123"));
		System.out.println("\n=================================");
		int[] a = {133,2,34,43,5};
		System.out.println(max(a));
		System.out.println("\n=================================");
		System.out.print(Arrays.toString(shuffle(a)));
		
	}
	// �޼���  �� : isNumber
	// public static ���
	// �������� : String, ���� : boolean
	//���ڿ� ���� �������� �ƴ��� �Ǻ��ϴ� �޼���
	//���ڿ��� null�̰ų� ���ڿ��̸� false�� ����
	public static boolean isNumber(String s){
		if(s == null || s.length() == 0) return false;
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if('0' > tmp || tmp >'9') return false;
		}
		return true;
	}
	// �޼���  �� : max
	// public static ���
	// �������� : int[], ���� : int
	//5�� �̻��� int Ÿ���� ���� ���� �迭�߿��� ���� ū���� ã�Ƽ� ���
	//���� �迭�� null�̰ų� �迭�� ũ�Ⱑ 0�϶� -99999����
	public static int max(int[] a){
		if(a == null || a.length == 0) return -99999;
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(max < a[i]) max = a[i];
		}
		return max;
	}
	
	//�޼��� �� : shuffle
	// public static ���
	// �������� : int[], ���� : int[]
	//�ش� �迭�� ���� �޾Ƽ� �����ϰ� �迭�� ��Ҹ� ������ ����
	//���� �迭�� null�̰ų� �迭�� ũ�Ⱑ 0�϶� -99999����
	
	public static int[] shuffle(int[] a){
		if(a == null || a.length == 0) return a;
		for (int i = 0; i < a.length; i++) {
			int tmp = (int)(Math.random() * a.length);
			int tmp2 =  a[i];
			a[i] = a[tmp];
			a[tmp] = tmp2;
		}		
		return a;
	}
}