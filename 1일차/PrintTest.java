
public class PrintTest {

	public static void main(String[] args) {
	
//		자바는 "+"이 두 가지 용도로 사용된다.
//		"+" 양쪽이 모두 숫자일 경우 덧셈이 실행된다.
//		"+"의 한쪽이라도 문자열이 나오면 이어 붙이는 문자열 연결 연산자로 사용된다.
		System.out.println(5 + " + " + 3 + " = " + (5 + 3));
		System.out.println(5 + " - " + 3 + " = " + (5 - 3));
		System.out.println(5 + " * " + 3 + " = " + 5 * 3);
//		자바는 정수와 정수의 연산은 결과도 정수다.
		System.out.println(5 + " / " + 3 + " = " + 5 / 3);
		System.out.println(5 + " / " + 3 + " = " + 5 / 3.);
		System.out.println(5 + " % " + 3 + " = " + 5 % 3); // 나머지
		
//		자바의 기본 자료형
//		boolean: 1byte, 논리값(true, false)을 기억한다.
//		byte: 1byte, 2진 데이터
//		char: 2byte, 문자 1개
//		short: 2byte, -32768 ~ 32767 사이의 정수
//		int: 4byte, -2147483648 ~ 2147473647 사이의 정수
//		long: 8byte, -2의 63승 ~ 2의 63승 -1 사이의 정수
//		float: 4byte, 단정도 실수, 소수점 아래 6자리 정도를 표현한다.
//		double: 8byte, 배정도 실수, 소수점 아래 16자리 정도를 표현한다.
		
//		묵시적 형변환
//		자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료형으로 자동 변환된다.
		System.out.println(5 + " / " + 3 + " = " + 5 / 3.);
		System.out.println('A' + " + " + 32 + " = " + ('A' + 32));
//		'A' => 100 0001 => 65
//		'a' => 110 0001 => 97
//		'0' => 011 0000 => 48
		System.out.println('a' + " - " + 32 + " = " + ('a' - 32));
		
//		명시적 형변환 => casting
//		프로그래머가 그 순간의 자료형을 지정할 수 있다.
		System.out.println(5 + " / " + 3 + " = " + (double) 5 / 3);
		System.out.println('A' + " + " + 32 + " = " + (char) ('A' + 32));
		System.out.println('a' + " - " + 32 + " = " + (char) ('a' - 32));
		System.out.println("================================");
		
//		서식있는 출력
//		printf("출력 서식", 출력할 내용) => JDK 1.5 부터 추가된 내용
//		출력 서식은 출력 서식 문자를 제외한 나머지 내용을 그대로 출력한다.
//		출력 서식 문자: d(정수), f(실수), s(문자열), c(문자)
//		출력 서식의 형식: %[-][0][n][.m]서식문자, [] 안의 내용은 필요하면 적는다.
//		n: 출력할 전체 자리수, 전체 자리수가 지정되면 오른쪽으로 맞춰 출력된다.
//		-: 출력할 전체 자리수가 지정된 경우 왼쪽으로 맞춰 출력한다.
//		0: 출력할 전체 자리수가 지정된 경우 남는 자리에 "0"을 채워 출력한다.
//		.m: 출력할 소수점 아래 자리수, 잘리는 자리에서 반올림 해서 화면에 표시한다.
		
		System.out.println(100);
		System.out.println(1);
		System.out.println(10000);
		
		System.out.printf("%d\n", 100);
		System.out.printf("%d\n", 1);
		System.out.printf("%d\n", 10000);
		
		System.out.printf("%5d\n", 100);
		System.out.printf("%5d\n", 1);
		System.out.printf("%5d\n", 10000);
		
		System.out.printf("%-5d\n", 100);
		System.out.printf("%-5d\n", 1);
		System.out.printf("%-5d\n", 10000);
		
		System.out.printf("%05d\n", 100);
		System.out.printf("%05d\n", 1);
		System.out.printf("%05d\n", 10000);
		System.out.println("================================");
		
		System.out.println("asd");
		System.out.println("a");
		System.out.println("asdfg");
		
		System.out.printf("%s\n", "asd");
		System.out.printf("%s\n", "a");
		System.out.printf("%s\n", "asdfg");
		
		System.out.printf("%5s\n", "asd");
		System.out.printf("%5s\n", "a");
		System.out.printf("%5s\n", "asdfg");
		
		System.out.printf("%-5s\n", "asd");
		System.out.printf("%-5s\n", "a");
		System.out.printf("%-5s\n", "asdfg");
		
//		문자열 출력시 "0"을 사용하면 FormatFlagsConversionMismatchException이 발생된다.
//		System.out.printf("%05s\n", "asd");
		System.out.println("================================");
		
		System.out.printf("평균점수: %6.2f\n", 100.);
		System.out.printf("평균점수: %6.2f\n", 65.125);
		System.out.printf("평균점수: %6.2f\n", 65.124);
		System.out.printf("평균점수: %6.2f\n", 65.1);
		System.out.println("================================");
		
		System.out.printf("%d + %d = %d\n", 5, 3, 5 + 3);
		System.out.printf("%d - %d = %d\n", 5, 3, 5 - 3);
		System.out.printf("%d * %d = %d\n", 5, 3, 5 * 3);
		System.out.printf("%d / %d = %d\n", 5, 3, 5 / 3);
		System.out.printf("%d / %d = %f\n", 5, 3, 5 / 3.);
//		출력 서식에 "%" 자체를 출력하려면 "%%"로 입력해야 한다.
		System.out.printf("%d %% %d = %d\n", 5, 3, 5 % 3);
		
	}
	
}











