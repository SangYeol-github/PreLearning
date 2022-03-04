import java.util.Scanner;

public class WeekDayTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 출력할 년, 월, 일을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();

//		서기 1년 1월 1일 부터 입력한 날짜의 전년도 12월 31일 까지 지난 날짜를 계산한다.
		int sum = (year - 1) * 365 +
				(year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
//		int sum = (year - 1) * 365;
//		for (int i=1; i<year; i++) {
//			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
//				sum++;
//			}
//		}
		
//		전년도 12월 31일 까지 지난 날짜에 전달 까지 지난 날짜를 더한다.
//		for (int i=1; i<month; i++) {
//			switch (i) {
//				case 2:
//					sum += 
//						(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
//					break;
//				case 4: case 6: case 9: case 11: // 짧은달
//					sum += 30;
//					break;
//				default: // 긴달
//					sum += 31;
//					break;
//			}
//		}
		
//		12달의 마지막 날짜를 기억하는 배열을 선언한다.
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		2월의 마지막 날짜를 확정한다.
		m[1] = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
		for (int i=1; i<month; i++) {
			sum += m[i - 1];
		}
		
//		전달 까지 날짜의 합계에 일을 더한다.
		sum += day;
		
//		요일을 계산한다.
//		날짜의 합계를 7로 나눈 나머지가 0이면 일요일, 1이면 월요일, 2이면 화요일
//		3이면 수요일, 4이면 목요일, 5이면 금요일, 6이면 토요일
//		switch (sum % 7) {
//			case 0: System.out.println("일요일"); break;
//			case 1: System.out.println("월요일"); break;
//			case 2: System.out.println("화요일"); break;
//			case 3: System.out.println("수요일"); break;
//			case 4: System.out.println("목요일"); break;
//			case 5: System.out.println("금요일"); break;
//			case 6: System.out.println("토요일"); break;
//		}

//		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일",
//				"토요일"};
//		System.out.println(week[sum % 7]);

		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		System.out.println(week[sum % 7] + "요일");
		
	}
	
}
	










