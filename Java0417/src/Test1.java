
public class Test1 {
	
	//�޼��� ����
	public static void hello_itwill(){
		//void : �޼����� ���ϰ��� ����
		//Ư�� �۾��� ó�� ���۸� ������
		System.out.println("hello itwill");
	}
	public static void hello_name(String name){
		System.out.println("Hello " + name);
	}
	//Ư�� ����� �����ϴ� �޼���
	public static String hello(){
		return "Hello"; // �ش� �޼����� ����(���� �� ������ ����)
	}
	public static String rtnName(String name){
		//"ȫ�浿" + "�� �ȳ��ϼ���" 
		return name + "�� �ȳ��ϼ���";
	}
	public static void main(String[] args) {
		//�޼��� : Ư�� ������ �ѹ��� ������ �����ϱ� ���� ���
		//��ü ���� : �޼���, �������� : �Լ�
		//main �޼��� : ���α׷��� �����Ű�� �޼���
		//���ȭ ���α׷���
		/*
		 [����������][����Ÿ��][�޼����](��������1,...) // �ż���Ӹ�
		 { 
		  	���ൿ��;
		  	��������;
		 	return ��;
		 }
		 */
		String str = hello();
		hello_itwill();
		hello_name("ȫ�浿");
		System.out.println(str);
		System.out.println("---------------------------------");
		System.out.println(rtnName("ȫ�浿"));
	}

}