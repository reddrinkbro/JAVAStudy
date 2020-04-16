
public class Test1 {

	public static void main(String[] args) {
		// 2차원 배열(다차원 배열) : 행렬표시 가능(표)
		// 반복문의 개수 증가 : 이중 for문
		// 1. new 연산자
		// 2. 직접 초기화
		
		// 5 x 3 행렬 표현하기 위한 2차원 배열
		int[][] arr = new int[5][3];
		
		arr[0][0] = 10; arr[0][1] = 50; arr[0][2] = 60;
		arr[1][0] = 12; arr[1][1] = 42; arr[1][2] = 64;
		arr[2][0] = 56; arr[2][1] = 35; arr[2][2] = 73;
		arr[3][0] = 78; arr[3][1] = 16; arr[3][2] = 23;
		arr[4][0] = 51; arr[4][1] = 48; arr[4][2] = 80;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i +"][" + j +"] = " + arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n------------------------------------------");
		int[][] score = {
			{85,60,70},
			{90,95,80},
			{75,80,100},
			{80,70,95},
			{100,65,80}
		};
		int[] sum2 = new int[3];
		for (int i = 0; i < score.length; i++) {
			int sum1 = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum1 +=score[i][j];
				sum2[j] +=score[i][j];
			}
			System.out.println("학생" + (i + 1) +" 총합 : "+ sum1);
		}
		for (int i = 0; i < sum2.length; i++) {
			System.out.print(i + 1+"과목 점수 : " + sum2[i]+ " ");
		}
		
		System.out.println("\n------------------------------------------");
		/* 배열의 선언, 초기화 모습(o,x)
		 1. int[] arr[]; (o)
		 2. int[] arr = {1,2,4,}; (o) 데이터가 3개가 있음
		 3. int[] arr = new int[5];(o)
		 4. int[] arr = new int[4]{1,2,3,4};(x)
		 4-1. int[] arr = new int[]{1,2,3,4};(o)
		 5. int arr[5];(x)
		 6. int[] arr[] = new int[3][]; (o)
		 6-1. int[] arr[] = new int[][3]; (x) 행을 기준으로 데이터가 채워지는데 행의 기준이 없으면 안된다
		 */
		int[][] arr2 = {
				{5,5,5,5},
				{10,10,10,10},
				{20,20,20,20},
				{30,30,30,30}
		};
		int sum = 0;
		int num = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
				num++;
			}
		}
		System.out.println("배열의 총 합 : " + sum + " 배열의 평균 : " + sum / (double)num);
		System.out.println("\n------------------------------------------");
		//int보다 크기가 작은 데이터타입의 경우 연산시 int(기본형) 변경후 연산
		//데이터 크기가 큰쪽에 따라 연산이 처리됨
		//int / double => double
		
		int[] arr4 = {10,20,30,40,50};
		//합출력
		sum = 0;
		for (int i = 0; i < arr4.length; i++) {
			sum += arr4[i];
		}
		System.out.println("총합 : " + sum);
	}

}
