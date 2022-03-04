import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
//		현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("yy.MM.dd(E) a h:mm:ss.SSS");
		System.out.println(sdf2.format(date));
		
//		Date 클래스는 1900년을 기준으로 날짜를 처리하므로 년도는 1900을 더해서 얻어와야
//		하고 월은 1을 더해서 얻어와야 한다.
		System.out.println("년: " + (date.getYear() + 1900));	// 년
		System.out.println("월: " + (date.getMonth() + 1));		// 월
		System.out.println("일: " + date.getDate());			// 일
		System.out.println("요일: " + date.getDay());			// 요일(숫자)
		System.out.println("시: " + date.getHours());			// 시
		System.out.println("분: " + date.getMinutes());			// 분
		System.out.println("초: " + date.getSeconds());			// 초
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(sdf2.format(calendar.getTime()));
		
		System.out.println("년: " + calendar.get(Calendar.YEAR));			// 년
		System.out.println("월: " + (calendar.get(Calendar.MONTH) + 1));	// 월
		System.out.println("일: " + calendar.get(Calendar.DATE));			// 일
		System.out.println("일: " + calendar.get(Calendar.DAY_OF_MONTH));	// 일
//		일(1) ~ 토(7)
		System.out.println("요일: " + calendar.get(Calendar.DAY_OF_WEEK));	// 요일
		System.out.println("시간: " + calendar.get(Calendar.HOUR));			// 시간(12)
		System.out.println("시간: " + calendar.get(Calendar.HOUR_OF_DAY));	// 시간(24)
		System.out.println("분: " + calendar.get(Calendar.MINUTE));			// 분
		System.out.println("초: " + calendar.get(Calendar.SECOND));			// 초
		System.out.println("밀리초: " + calendar.get(Calendar.MILLISECOND));// 밀리초
		
//		currentTimeMillis() 메소드는 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간
//		까지 지난 시간을 1/1000초로 환산해서 얻어온다.
//		currentTimeMillis() 메소드의 실행 결과는 13자리의 정수이므로 int 타입에는
//		저장시킬 수 없고 long 타입의 변수에 저장시켜야 한다.
		long start = System.currentTimeMillis();
		System.out.println(sdf2.format(start));
		
	}
	
}







