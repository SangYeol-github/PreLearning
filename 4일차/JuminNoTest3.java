import java.util.Scanner;

public class JuminNoTest3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 '-'없이 입력하세요: ");
		String jumin = scanner.nextLine();
		
//		가중치
		String check = "234567892345";
		
		int sum = 0;
		for (int i=0; i<12; i++) {
//			sum += (jumin.charAt(i) - 48) * (check.charAt(i) - '0');
//			sum += (jumin.charAt(i) - 48) * (i < 8 ? i + 2 : i - 6);
			sum += (jumin.charAt(i) - 48) * (i % 8 + 2);
		}
//		System.out.println(sum);
		
		int result = (11 - sum % 11) % 10;
		if (result == jumin.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}
		
	}
	
}









