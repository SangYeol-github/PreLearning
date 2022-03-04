import java.util.Random;

public class DiceTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		
		for (int i=0; i<10; i++) {
			int r = random.nextInt(6) + 1;
			System.out.println(r);
//			주사위 눈의 개수를 센다.
			/*
			if (r == 1) {
//				a = a + 1;
//				대입 연산자는 "="과 같이 사용되는 연산자를 말한다.
				a += 1;
			} else if (r == 2) {
				b += 1;
			} else if (r == 3) {
				c += 1;
			} else if (r == 4) {
				d += 1;
			} else if (r == 5) {
				e += 1;
			} else if (r == 6) {
				f += 1;
			}
			*/
			switch (r) {
				case 1: a += 1; break;
				case 2: b += 1; break;
				case 3: c += 1; break;
				case 4: d += 1; break;
				case 5: e += 1; break;
				case 6: f += 1; break;
			}
		}
		
		System.out.println("1의 개수: " + a);
		System.out.println("2의 개수: " + b);
		System.out.println("3의 개수: " + c);
		System.out.println("4의 개수: " + d);
		System.out.println("5의 개수: " + e);
		System.out.println("6의 개수: " + f);
		
	}
	
}
