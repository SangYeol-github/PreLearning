
public class WhileTest {

	public static void main(String[] args) {
		
//		반복으로 최초 진입시 조건이 거짓일 경우 {} 블록의 내용을 1번도 실행하지 않는다.
//		while (조건식) {
//			조건이 참인 동안 실행할 문장;
//			...;
//		}
		
		int sum = 0, i = 0;
		while (i < 100) {
//			i = i + 1;
			i += 1;
			sum += i;
		}
		System.out.println("1 ~ 100의 합계: " + sum);
		
//		반복으로 최초 진입시 조건이 거짓이더라도 {} 블록의 내용을 1번은 실행한다.
//		do {
//			조건이 참인 동안 실행할 문장;
//			...;
//		} while (조건식);	// ";"을 빼먹으면 안된다.
		
//		0을 i에 넣고 i에 저장된 값을 sum에 넣는다.
//		변수를 선언할 때는 사용할 수 없다.
		sum = i = 0;
		do {
//			i += 1;
//			sum += i;
			sum += ++i;
		} while (i < 100);
		System.out.println("1 ~ 100의 합계: " + sum);
		
	}
	
}




