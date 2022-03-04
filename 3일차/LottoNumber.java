import java.util.Random;

public class LottoNumber {

	public static void main(String[] args) {
		
//		두 기억장소에 저장된 데이터 교환하기
//		int a = 3, b = 4;
//		System.out.println("a = " + a + ", b = " + b);
//		
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("a = " + a + ", b = " + b);
		
//		1. 추첨기를 준비한다.
		int[] lotto = new int[45];
		
//		2. 추첨기에 공을 넣는다.
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		shuffle(lotto);
		System.out.println("\n===========섞기전============");
		
//		3. 섞는다.
//		lotto 배열의 0번째 인덱스의 값과 1 ~ 44번째 인덱스 중에서 랜덤한 위치의 값을
//		선택해서 두 기억장소의 값을 교환한다.
		Random random = new Random();
		for (int i=0; i<1000000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		
		shuffle(lotto);
		System.out.println("\n===========섞은후============");
		
//		4. 1등 번호를 출력한다.
		System.out.print("1등 번호: ");
		for (int i=0; i<6; i++) {
			System.out.printf("%2d ", lotto[i]);
			
//			프로그램을 1초 간격으로 실행한다.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("보너스: " + lotto[6]);
		
	}

	private static void shuffle(int[] lotto) {
		for (int i=0; i<lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
//			숫자를 10개 출력했나 판단해서 줄을 바꾼다.
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	
}















