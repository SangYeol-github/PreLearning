import java.util.Random;
import java.util.Scanner;

public class LottoNumber2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[45];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구매금액: ");
		int money = scanner.nextInt();
		
//		지역변수: {} 블록에서 선언된 변수를 말하며 {} 블록을 벗어나면 메모리에서
//		자동으로 소멸된다.
		for (int j=0; j<money / 1000; j++) {
			
			System.out.printf("%3d Game: ", j + 1);
			for (int i=0; i<1000000; i++) {
				int r = random.nextInt(44) + 1;
				int temp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = temp;
			}
			
			for (int i=0; i<6; i++) {
				System.out.printf("%02d ", lotto[i]);
			}
			System.out.println();
			
		}
		
		
	}

}















