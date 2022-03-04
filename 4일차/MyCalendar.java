//	달력 작업에 사용할 메소드를 모아놓은 클래스
public class MyCalendar {

//	메소드 형식
//	[접근권한지정자] [static] 리턴타입 메소드이름([인수, ...]) {	// 메소드의 머리
//		메소드가 실행할 문장;
//		...;
//		[return 값;]
//	}
	
//	접근 권한 지정자
//	private: 현재 클래스 외부에서 접근할 수 없다.
//	protected: 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 접근할 수 있다.
//	package: 접근 권한 지정자 생략시, 같은 패키지 안에서는 public 처럼 사용되고 다른
//	패키지에서는 private 처럼 사용된다.
//	public: 현재 클래스의 내부, 외부 어디에서나 자유롭게 접근할 수 있다.
	
//	정적(static) 메소드는 메소드를 선언한 클래스의 객체를 생성하지 않고 클래스 이름에
//	"."을 찍어서 실행할 수 있다.
//	자주 사용하는 메소드는 정적 메소드로 만들어서 사용하면 편리하다.
	
//	리턴타입은 메소드가 실행되고 난 결과를 되돌려줄 때 결과의 자료형을 적어준다.
//	메소드를 실행한 후 결과를 되돌려줄 필요가 없으면 return을 생략하고 리턴타입에
//	"void"라고 적어준다.
	
//	===================================================================================
	
//	년을 인수로 넘겨받아 윤년, 평년을 판단해 윤년이면 true, 평년이면 false를 리턴하는
//	메소드
//	논리값을 기억하는 변수나 리턴 타입이 논리값인 메소드의 이름은 "is"로 시작하는 것이
//	관행이다.
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
//	년, 월을 인수로 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
		int m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		m[1] = isLeapYear(year) ? 29 : 28;
		return m[month - 1];
	}
	
//	년, 월, 일을 인수로 넘겨받아 1년 1월 1일 부터 지난 날짜를 리턴하는 메소드
	public static int totalDay(int year, int month, int day) {
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 +
				(year - 1) / 400;
		for (int i=1; i<month; i++) {
			sum += lastDay(year, i);
		}
		return sum + day;
	}
	
//	년, 월, 일을 인수로 넘겨받아 요일을 숫자로 리턴하는 메소드
//	일요일(0), 월요일(1), 화요일(2), 수요일(3), 목요일(4), 금요일(5), 토요일(6)
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
	}
	
}


















