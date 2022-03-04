import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
//		관계(비교) 연산자: 연산 결과는 무조건 참(true) 또는 거짓(false)이다.
//		>: 크다, 초과
//		>=: 크거나 같다, 이상
//		<: 작다, 미만
//		<=: 작거나 같다, 이하
//		==: 같다
//		!=: 같지 않다
		
//		if (조건식) {
//			조건식이 참일 경우 실행할 문장
//		} else {
//			조건식이 거짓일 경우 실행할 문장
//		}
//		조건식이 거짓일 경우 실행할 문장이 없다면 else 이하를 생략하면 된다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이: ");
		int age = scanner.nextInt();
		
		if (age >= 19) {
			System.out.println("성인이시군요 어서오세요~~~~~");
		} else {
			System.out.println("애들은 가라~~~~~");
		}
		
//		삼항(조건) 연산자(?:): if 명령의 조건을 만족하거나 만족하지 않을 경우 실행할
//		문장이 각각 1문장씩일 경우 사용하면 편리하다.
//		조건식 ? 조건식이 참일 경우 실행할 문장 : 조건식이 거짓일 경우 실행할 문장
		System.out.println(age >= 19 ? "성인이시군요 어서오세요~~~~~" : 
			"애들은 가라~~~~~");
		
	}
	
}









