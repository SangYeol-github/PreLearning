import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		
//		논리 연산자: 연산 결과는 무조건 참(true) 또는 거짓(false)이다.
//		&&(논리곱, and): 두 개의 조건이 모두 참일 경우에만 참, ~이고, ~이면서, ~중에서
//		||(논리합, or): 두 개의 조건중 1개 이상 참일 경우에 참, ~또는, ~이거나
//		!(논리부정, not): 참은 거짓으로 거짓은 참으로 변경한다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("3과목 점수를 입력하세요: ");
		int java = scanner.nextInt();
		int jsp = scanner.nextInt();
		int spring = scanner.nextInt();
		
		int total = java + jsp + spring;
		double average = (double) total / 3;
		System.out.println("평균: " + average);
		
		if (average >= 90) {
			System.out.println("A");
		}
		if (average < 90 && average >= 80) {
			System.out.println("B");
		}
		if (average < 80 && average >= 70) {
			System.out.println("C");
		}
		if (average < 70 && average >= 60) {
			System.out.println("D");
		}
		if (average < 60) {
			System.out.println("F");
		}
		
		
	}
	
}





