import java.util.Random;
import java.util.Scanner;

public class Mukchiba {

	public static void main(String[] args) {
		
//		가위(1), 바위(2), 보(3)
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int win = 0, tie = 0, lose = 0;
		
		for (int i=0; i<5; i++) {
			
			int cpu = random.nextInt(3) + 1;
//			System.out.println("cpu: " + cpu);
			System.out.print("가위(1)바위(2)보(3): ");
			int user = scanner.nextInt();
			
//			이기는 조건: cpu == 1 일 때 user == 2, cpu == 2 일 때 user == 3
//		             	 cpu == 3 일 때 user == 1
//			지는 조건:   cpu == 1 일 때 user == 3, cpu == 2 일 때 user == 1
//		             	 cpu == 3 일 때 user == 2
//			비기는 조건: cpu == user
			if (cpu == user) {
				System.out.println("비겼다.");
				tie += 1;
			} else if ((cpu == 1 && user == 2) || (cpu == 2 && user == 3) || 
					(cpu == 3 && user == 1)) {
				System.out.println("이겼다.");
				win += 1;
			} else {
				System.out.println("졌다.");
				lose += 1;
			}
			
		}
		System.out.println(win + "승 " + tie + "무 " + lose + "패");
		
	}
	
}






