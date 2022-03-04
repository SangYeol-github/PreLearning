import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년/평년을 판단할 년도를 입력하세요: ");
		int year = scanner.nextInt();
		
//		연산자 우선순위
//		단항 연산자 => 이항 연산자(산술 => 관계 => 논리) => 삼항 연산자 => 대입 연산자
//		이항 연산자 우선순위
//		()
//		*, /, %
//		+, -
//		>, >=, <, <=
//		==, !=
//		&&
//		||
				
//		윤년/평년 판별식
//		년도가 4로 나눠 떨어지고 100으로 나눠 떨어지지 않거나 400으로 나눠 떨어지면
//		윤년 그렇치 않으면 평년
		
//		프로그램에서 여러번 사용되는 값은 변수에 저장해서 사용하면 편리하다.
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if (isLeapYear) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년입니다.");
		
	}
	
}






