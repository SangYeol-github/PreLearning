import java.util.Date;
import java.util.Scanner;

public class JuminNoTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine();
		
//		System.out.println(jumin.substring(0, 2) + 1900);
//		문자열을 숫자로 변환한다.
//		System.out.println(Integer.parseInt(jumin.substring(0, 2)) + 1900);
		
		Date date = new Date();
//		System.out.println(date.getYear() + 1900);
		
		int year = Integer.parseInt(jumin.substring(0, 2));
//		if (jumin.charAt(6) <= '2') {
//			year += 1900;
//		} else {
//			year += 2000;
//		}
		year += jumin.charAt(6) <= '2' ? 1900 : 2000;
		System.out.println(date.getYear() + 1900 - year);
		
	}
	
}









