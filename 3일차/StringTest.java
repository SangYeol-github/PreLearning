
public class StringTest {

	public static void main(String[] args) {
		
//		문자열이 최초로 만들어지면 메모리 어딘가에 문자열을 만들고 그 문자열의 시작
//		주소를 문자열 변수에 저장시킨다.
		String str1 = "AAA";
//		문자열이 이미 메모리에 존재한다면 존재하는 문자열의 주소를 변수에 저장한다.
		String str2 = "AAA";
		
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		new를 사용해서 문자열을 만들면 메모리에 같은 내용의 문자열이 있더라도 다시 
//		만들고 그 시작 주소를 문자열 변수에 저장한다.
		String str3 = new String("AAA");
		
		if (str1 == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		문자열을 "=="로 비고하면 안되고 equals() 메소드로 비교한다.
//		"=="을 사용해서 비교할 수 있는 값은 기본 자료형 8가지와 null만 가능하다.
//		문자열이나 클래스로 만든 객체에 저장된 내용을 비교하려면 "=="이 아닌 equals()
//		메소드를 사용해야 한다.
		if (str1.equals(str3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}
	
}





