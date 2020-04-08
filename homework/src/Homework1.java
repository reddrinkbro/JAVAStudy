import java.util.*;
public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int ten = input / 10;
		int one = input % 10;
		if( input <1 || input >99){
			System.out.println("잘못된 값이 입력되었습니다.");
		}
		else{
			if(input >= 10){
				if(ten % 3 == 0 && one % 3 == 0 && input >=10){
					System.out.print("박수 짝짝 (" + input +")");
				}
				else if(ten % 3 == 0 || one % 3 == 0){
						System.out.print("박수 짝 (" + input +")");
				}
				else{
					System.out.print("박수 없음 (" + input +")");
				}
			}
			else{
				if(one % 3 == 0)
					System.out.print("박수 짝 (" + input +")");
				else{
					System.out.print("박수 없음 (" + input +")");
				}
			}
		}
	}

}
