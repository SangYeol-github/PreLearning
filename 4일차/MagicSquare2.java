import java.util.Scanner;

public class MagicSquare2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;
		while (true) {
			System.out.print("행렬의 차수: ");
			n = scanner.nextInt();
			if (n >= 3 && n % 2 == 1) { // 3이상인 홀수인가?
				break;
			}
			System.out.println("3이상인 홀수를 입력하세요");
		}
		
//		n행 n열인 2차원 배열을 선언한다.
		int[][] a = new int[n][n];
		
//		최초의 1이 채워질 위치를 정한다.
		int i = 0;
		int j = (n - 1) / 2;
		
		for (int k=1; k<=Math.pow(n, 2); k++) {
			a[i][j] = k;
			if (k % n == 0) {
				i++;
			} else {
				i--;
				if (i == -1) {
					i = n - 1;
				}
				j++;
				if (j == n) {
					j = 0;
				}
			}
		}
		
		for (int row=0; row<n; row++) {
			for (int col=0; col<n; col++) {
				System.out.printf("%3d ", a[row][col]);
			}
			System.out.println();
		}
		
	}
	
}





