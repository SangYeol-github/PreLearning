import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
//		Math.random(): 0 이상이고 1미만인 무작위수(난수)를 발생시킨다.
		for(int i=0; i<6; i++) {
			System.out.println((int) (Math.random() * 45 + 1));
		}
		System.out.println("================================");
		
		Random random = new Random();
		
		for(int i=0; i<6; i++) {
			System.out.println(random.nextInt(45) + 1);
		}
		
	}
	
}
