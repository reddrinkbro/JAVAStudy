//�л� ��ü�� �����Ѵ�
//�̸�, ���� ������ �����ϰ� �ִ� -> �������(���) : �ش� �����͸� ������ �� �ִ� Ÿ�� ���
//�����ϱ�, ��� ������ �� �� �ִ�  -> ��� �޼���(����)
class Student{
	String name;
	int age;
	public void study(){
		System.out.println("�����ϱ�");
	}
	public void play(){
		System.out.println("���");
	}
}

//�ڵ��� Ŭ���� -> �ڵ��� ��ü
class Car {
	//�ڵ��� Ŭ����
	
}

public class Test2 {

	public static void main(String[] args) {
		
		//Ŭ���� : ��ü�� ��������ؼ� ������ Ʋ 
		//��ü(�ν��Ͻ�) : ��� ���(���α׷��ֿ� ����� ��ü)
		
		//Ŭ������ ��κ� ������ �ν��Ͻ�ȭ(�޸𸮿� �ø��� �۾�) �ؼ� ����ؾ���
		//��ü ������ main()�޼��忡�� ����
		
		Car bus = new Car();
		// Car : CarŸ�� (����� ���� Ÿ��)
		// bus : CarŸ���� ����(��������,���۷���)
		// new : ������(�ν��Ͻ�ȭ)
		// Car() : ��ü
		
		//Student kim(4����Ʈ) -> stack
		//������ -> heap
		//heap�� �Ҵ�� ��ü�� �ּҸ� kim�� �˷��ش�
		Student kim = new Student();
		kim.name = "���л�";
		kim.age = 20;
		
		System.out.println("�̸� : " + kim.name + "\n���� : " + kim.age);
		kim.study();
		kim.play();
		
		//�л� 2 ��ü ����
		Student jung = new Student();
		jung.name = "���л�";
		jung.age = 20;
		
		System.out.println("�̸� : " + jung.name + "\n���� : " + jung.age);
		jung.study();
		jung.play();
		
		//�޸� ����
		//�ڹٿ����� �޸� �������ִ� ������ �÷��Ͱ� �����Ѵ�.
		//�ڹٿ����� �޸� ���� / ������ ������ ���� �� �ʿ䰡 ����
		//������ ���Ǽ� ����
		//�޸� ȸ�������� �˼� ���� (������ �÷��Ͱ� �˾Ƽ� �Ǵ��ϰ� ó��)
		
		//������ :�����Ⱚ
		//�����ϴ� ���۷����� ���� ��ü/�迭
		
		//�ڹٴ� �ǽð� ó�� ���α׷��� �������ϴ�
		
		//System.gc(); ->������ �÷��� �۵� ��û
		
	}

}
