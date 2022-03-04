import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
//		0 ~ 9 사이의 숫자를 level 만큼 랜덤하게 발생시킨다.
		Random random = new Random();
		int[] ball = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i=0; i<1000000; i++) {
			int r = random.nextInt(9) + 1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("레벨을 입력하세요: ");
		int level = scanner.nextInt();
		scanner.nextLine(); // 키보드 버퍼를 비운다.
		
		System.out.print("CPU: ");
		for (int i=0; i<level; i++) {
			System.out.print(ball[i]);
		}
		System.out.println();
		
//		맞출때 까지 반복한다.
		int count = 0;
		long start = System.currentTimeMillis(); // 시작시간
		while (true) {
			
			System.out.print("USER: ");
			String user = scanner.nextLine();
			count++;
			
			int s = 0, b = 0;
//			레벨만큼 반복하며 스트라이크와 볼의 개수를 센다.
			for (int i=0; i<level; i++) {
				if (ball[i] == user.charAt(i) - 48) {
					s++;
				}
//				if (user.indexOf(String.format("%s", ball[i])) >= 0) {
//				if (user.indexOf(String.valueOf(ball[i])) >= 0) {
//				if (user.indexOf(ball[i] + "") >= 0) {
				if (user.contains(ball[i] + "")) {
					b++;
				}
			}
			
//			맞췄으면 반복을 탈출한다.
			if (s == level) {
				break;
			}
			
			System.out.println(s + "스트라이크 " + (b - s) + "볼");
			
		}
		long end = System.currentTimeMillis(); // 종료시간
		System.out.println((end - start) / 1000. + "초 걸려서 " + count + 
				"번 만에 맞췄다");
		
//		==========================================================================
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		System.out.println(sdf.format(end - start) + "초 걸려서 " + count + 
				"번 만에 맞췄다");
		System.out.println(sdf.format(end - start - 32400000) + "초 걸려서 " + count + 
				"번 만에 맞췄다");
		
	}
	
}











