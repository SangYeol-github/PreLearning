import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = scanner.nextInt();
		
//		nextInt(), nextDouble() 등 문자열이 아닌 다른 데이터를 읽어들이는 메소드는
//		메소드 자신이 읽어들일 데이터만 읽어들인다.
		
//		키보드 버퍼를 비운다.
		scanner.nextLine();
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + age + "살 입니다.");
		
	}
	
}
