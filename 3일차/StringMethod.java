import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("영문자 입력: ");
		String str = scanner.nextLine();
		
//		length(): 문자열을 구성하는 문자의 개수를 얻어온다.
		System.out.println("입력받은 글자수(불필요한 공백 포함): " + str.length());
//		trim(): 문자열 앞뒤의 불필요한 공백을 제거한다.
		System.out.println("입력받은 글자수(불필요한 공백 제거): " + 
				str.trim().length());
		
		for (int i=0; i<str.length(); i++) {
//			charAt(index): 문자열에서 index 번째 문자 1개를 얻어온다.
			System.out.println(i + "번째 문자: " + str.charAt(i));
		}
		
//		입력된 영문자를 무조건 대문자로 바꿔 출력하기
		for (int i=0; i<str.length(); i++) {
//			소문자인가 물어봐서 그렇다면 대문자로 바꿔 출력한다.
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {		// 소문자인가?
				System.out.print((char) (str.charAt(i) - 32));
			} else {
				System.out.print(str.charAt(i));
			}
		}
		
//		toUpperCase(): 문자열을 무조건 대문자로 변환한다.
		System.out.println("무조건 대문자로 출력: " + str.toUpperCase());
//		toLowerCase(): 문자열을 무조건 소문자로 변환한다.
		System.out.println("무조건 소문자로 출력: " + str.toLowerCase());
		
//		indexOf(문자열): 문자열에서 괄호안의 문자열의 앞에서 위치를 얻어온다.
		System.out.println("문자열에서 'it'의 위치: " + str.indexOf("it"));
//		lastIndexOf(문자열): 문자열에서 괄호안의 문자열의 뒤에서 위치를 얻어온다.
		System.out.println("문자열에서 'it'의 위치: " + str.lastIndexOf("it"));
//		indexOf(), lastIndexOf() 메소드는 인수로 지정된 문자열이 없으면 -1을 얻어온다.
		System.out.println("문자열에서 'at'의 위치: " + str.indexOf("at"));
		
//		contains(문자열): 문자열에 인수로 지정된 문자열이 포함되어 있으면 true, 없으면
//		false를 얻어온다.
		System.out.println("tjoeun 포함 여부: " + str.contains("tjoeun"));
		
//		substring(a): 문자열에서 a번째 위치의 문자부터 끝까지 얻어온다.
		System.out.println(str.substring(2));
//		substring(a, b): 문자열에서 a번째 위치의 문자부터 b-1번째 문자까지 얻어온다.
		System.out.println(str.substring(2, 5));
		
	}
	
}






