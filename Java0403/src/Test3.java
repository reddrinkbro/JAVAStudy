import java.util.*;

public class Test3 {
	public static void main(String[] args)
	{
		String msg = "Hello";
		//System.out.println(msg.charAt(5));
		
		//charAt(index)
		//문자열변수에 있는 값중에 해당 위치에 있는 문자형 데이터를 가져온다.
		
		msg = "abcae";
		switch (msg.charAt(3)) {
		case 'a':
		case 'A':
			System.out.println("Apple");
			break;
		case 'b':
		case 'B':
			System.out.println("Banana");
			break;
		case 'g':
		case 'G':
			System.out.println("Grape");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("처리 불가능한 문자 입니다.");
			break;
		}
	}
}
