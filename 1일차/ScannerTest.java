import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
//		클래스이름 객체이름 = new 생성자()
		Scanner scanner = new Scanner(System.in); // 키보드로 입력받는 스캐너
		
//		변수: 프로그램에서 처리할 데이터를 기억하는 기억장소를 말한다.
//		변수의 이름은 영문자, 숫자, '_'만 사용해서 만들수 있고 첫 글자는 반드시 문자로
//		시작해야 한다.
//		변수는 변수를 선언한 후 최초로 사용하기 전에 반드시 초기화 시켜야 한다.
		
//		자료형 변수명;			// 변수만 선언, 변수에는 쓰레기가 들어있다.
//		자료형 변수명 = 초기치; // 변수를 선언하고 초기치로 초기화 시킨다.
		
//		"="의 의미는 "=" 오른쪽의 데이터를 "=" 왼쪽의 기억장소에 대입시키라는 의미로
//		사용된다. => 대입문, 배정문, 할당문 => "=="가 같다로 사용된다.
		
		int a;
		a = 11;
		System.out.println(a);
		
//		키보드로 입력받은 데이터를 변수에 저장한다.
		System.out.print("주소: ");
//		next(): 한 단어 입력, nextLine(): 한 줄 입력
//		nextLine()은 키보드 버퍼가 비어있을 경우 입력을 기다리며 대기하지만 키보드
//		버퍼가 비어있지 않을 경우 키보드 버퍼의 내용을 끝(엔터키)까지 읽어들인다.
//		스캐너로 키보드로 입력하는 내용을 입력받을 경우 바로 변수에 저장되는 것이 아니고
//		키보드 버퍼라는 임시 기억장소에 저장한 후 변수에 저장된다. => 키보드 버퍼에 
//		저장되는 내용은 녹색으로 보인다.
		String addr = scanner.nextLine();
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.println(name + "님은 " + addr + "에 삽니다.");
		
	}
	
}






