import java.util.Scanner;

public class JuminNoTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine();
		
//		8304221185600
//		System.out.println(jumin.charAt(6));
		
		if (jumin.charAt(6) == '1' || jumin.charAt(6) == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		if (jumin.charAt(6) - 48 == 1 || jumin.charAt(6) - '0' == 3) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		if (jumin.charAt(6) % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		System.out.println(jumin.charAt(6) % 2 == 0 ? "여자" : "남자");
		
	}
	
}






