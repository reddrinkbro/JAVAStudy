
public class Test1 {

	public static void main(String[] args) {
		//while()문
		/*while(조건식){
			반복할 코드
			증감식
		}*/
		//whlie 반복문은 항상 조건문을 먼저 실행한다
		//1 ~ 10까지 출력
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
		//do-while문
		/*초기식;
		do{
			반복할 코드;
			증감식;
		}while(조건식);*/
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
		//반복문의 경우 반복할 코드의 내용이 한줄일 경우 괄호를 생략가능
		i=0;
		while(i++<=4);
		System.out.println(i+" ");

	}

}
