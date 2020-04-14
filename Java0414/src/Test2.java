
public class Test2 {

	public static void main(String[] args) {
		//배열 : 동일한 타입의 데이터를 한번에 저장할 수 있는 공간(연속된 공간)
		//1) new 연산자를 사용
		//2) 배열을 직접 초기화
		
		//데이터타입[] 변수명 = new 데이터타입[크기];
		int[] array = new int[5];
		//-> 5칸 짜리 배열을 생성한다. -> 5개의 변수를 저장할 수 있는 공간
		// 기본형 타입 x, 참조형 타입
		// 배열은 각각의 방 인덱스를 가지고 있다 (항상 0부터 시작)
		// 배열의 한칸은 변수처럼 사용이 가능(해당 배열타입의 값을 저장 가능)
		// 배열에 이름을 사용해서 접근(사용) array[위치]
		// 배열 한 칸의 정보를 요소라고 한다
		
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;
		array[4] = 14;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\n----------------------------------------------");
		System.out.println("array.length : " + array.length);
		//배열의 요소의 개수
		
		// 1번 0번 인덱스 데이터 : 00
		// 2번 1번 인덱스 데이터 : 00
		// ...
		// 배열의 모든 요소를 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + 1 +"번 "+ i +"번 인덱스 데이터 : " + array[i] );
		}
		System.out.println("\n----------------------------------------------");
		//double형 타입의 배열 생성
		//11.2, 5.5,36.1
		
		double[] dArray = new double[3];
		dArray[0] = 11.2d;
		dArray[1] = 5.5d;
		dArray[2] = 36.1d;
		
		for (int i = 0; i < dArray.length; i++) {
			System.out.println(i +"번방 : " + dArray[i] );
		}
	}
	
}
