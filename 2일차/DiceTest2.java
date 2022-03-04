import java.util.Random;

public class DiceTest2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] count = new int[6];
		
		for (int i=0; i<10; i++) {
			int r = random.nextInt(count.length) + 1;
//			System.out.println(r);
//			switch (r) {
//				case 1: count[0] += 1; break;
//				case 2: count[1] += 1; break;
//				case 3: count[2] += 1; break;
//				case 4: count[3] += 1; break;
//				case 5: count[4] += 1; break;
//				case 6: count[5] += 1; break;
//			}
			count[r - 1]++;
		}
		
//		System.out.println("1의 개수: " + count[0]);
//		System.out.println("2의 개수: " + count[1]);
//		System.out.println("3의 개수: " + count[2]);
//		System.out.println("4의 개수: " + count[3]);
//		System.out.println("5의 개수: " + count[4]);
//		System.out.println("6의 개수: " + count[5]);
		for (int i=0; i<count.length; i++) {
			System.out.println(i + 1 + "의 개수: " + count[i]);
		}
		
	}
	
}
