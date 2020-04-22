//학생 객체를 생성한다
//이름, 나이 정보를 저장하고 있다 -> 멤버변수(명사) : 해당 데이터를 저장할 수 있는 타입 사용
//공부하기, 놀기 동작을 할 수 있다  -> 멤버 메서드(동사)
class Student{
	String name;
	int age;
	public void study(){
		System.out.println("공부하기");
	}
	public void play(){
		System.out.println("놀기");
	}
}

//자동차 클래스 -> 자동차 객체
class Car {
	//자동차 클래스
	
}

public class Test2 {

	public static void main(String[] args) {
		
		//클래스 : 객체를 만들기위해서 생성한 틀 
		//객체(인스턴스) : 모든 대상(프로그래밍에 사용할 객체)
		
		//클래스는 대부분 선언후 인스턴스화(메모리에 올리는 작업) 해서 사용해야함
		//객체 생성은 main()메서드에서 실행
		
		Car bus = new Car();
		// Car : Car타입 (사용자 정의 타입)
		// bus : Car타입의 변수(참조변수,레퍼런스)
		// new : 연산자(인스턴스화)
		// Car() : 객체
		
		//Student kim(4바이트) -> stack
		//나머지 -> heap
		//heap에 할당된 객체의 주소를 kim에 알려준다
		Student kim = new Student();
		kim.name = "김학생";
		kim.age = 20;
		
		System.out.println("이름 : " + kim.name + "\n나이 : " + kim.age);
		kim.study();
		kim.play();
		
		//학생 2 객체 생성
		Student jung = new Student();
		jung.name = "정학생";
		jung.age = 20;
		
		System.out.println("이름 : " + jung.name + "\n나이 : " + jung.age);
		jung.study();
		jung.play();
		
		//메모리 관리
		//자바에서는 메모리 관리해주는 가비지 컬렉터가 존재한다.
		//자바에서는 메모리 생성 / 해제를 개발자 직접 할 필요가 없다
		//개발의 편의성 제공
		//메모리 회수시점을 알수 없다 (가비지 컬렉터가 알아서 판단하고 처리)
		
		//가비지 :쓰레기값
		//참조하는 레퍼런스가 없는 객체/배열
		
		//자바는 실시간 처리 프로그램에 부적합하다
		
		//System.gc(); ->가비지 컬랙터 작동 요청
		
	}

}
