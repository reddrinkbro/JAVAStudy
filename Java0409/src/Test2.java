
public class Test2 {

	public static void main(String[] args) {
		//숫자 판독 프로그램 생성
		//숫자로만 이루어진 문자열의 경우만 숫자로 판단
		//문자열(String) 데이터가 각각의 방에 따로 저장. 각방의 번호는 0번부터 시작
		//charAt(위치) => 해당위치의 문자 데이터를 가져올 수 있음
		String str = "12!32131";
		char ch = ' ';
		boolean isNumber = false;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			isNumber = true;
			if(!(ch >= '0' && ch <= '9')){
				System.out.println("숫자가 아니다");
				isNumber = false;
				break;
			}
		}
		if(isNumber) System.out.println("숫자 입니다");
	}

}
