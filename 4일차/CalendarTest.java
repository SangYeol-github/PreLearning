import java.util.Scanner;

//	달력을 출력할 클래스
public class CalendarTest {

	public static void main(String[] args) {
		
//		MyCalendar myCalendar = new MyCalendar();
//		System.out.println(myCalendar.isLeapYear(2022));
//		System.out.println(MyCalendar.isLeapYear(2022));
//		System.out.println(MyCalendar.lastDay(2022, 1));
//		System.out.println(MyCalendar.totalDay(2022, 12, 25));
//		System.out.println(MyCalendar.weekDay(2022, 12, 25));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("달력을 출력할 년, 월을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		System.out.println("============================");
		System.out.println("         " + year + "년 " + month + "월");
		System.out.println("============================");
		System.out.println(" 일  월  화  수  목  금  토 ");
		System.out.println("============================");
		
//		1일이 출력될 요일의 위치를 맞추기 위해 1일의 요일만큼 반복하며 빈 칸을 출력한다.
		for (int i=0; i<MyCalendar.weekDay(year, month, 1); i++) {
			System.out.print("    ");
		}
		
//		1일 부터 달력을 출력할 달의 날짜만큼 반복하며 날짜를 출력한다.
		for (int i=1; i<=MyCalendar.lastDay(year, month); i++) {
			System.out.printf(" %2d ", i);
//			출력한 날짜(i)가 토요일이고 마지막 날짜가 아니면 줄을 바꾼다.
			if (MyCalendar.weekDay(year, month, i) == 6 
					&& i != MyCalendar.lastDay(year, month)) {
				System.out.println();
			}
		}
		System.out.println("\n============================");
		
	}
	
}











