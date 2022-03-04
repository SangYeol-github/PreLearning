
public class MagicSquare {

	public static void main(String[] args) {
		
//		2차원 배열
//		자료형[][] 배열명 = new 자료형[행][열];
		int[][] a = new int[5][5];
		
//		최초의 1이 채워질 자리를 정한다.
		int i = 0; // 행
		int j = 2; // 열
		
//		마방진에 채워질 숫자만큼 반복하며 배열에 숫자를 채운다.
		for (int k=1; k<=Math.pow(5, 2); k++) {
//			마방진에 숫자를 채운다.
			a[i][j] = k;
//			방금 채운 숫자가 5의 배수면 아래줄에 5의 배수가 아니면 오른쪽 위 방향으로
//			숫자를 채운다.
			if (k % 5 == 0) {
//				5의 배수면 아래줄에 채워야 하므로 행만 1증가 시킨다.
				i++;
			} else {
//				5의 배수가 아니면 오른쪽 위 방향에 채워야 하므로 행은 1감소, 열은 1증가
//				시킨다.
				i--;
//				행이 -1이 되면 마지막 행으로 수정한다.
				if (i == -1) {
					i = 4;
				}
				j++;
//				열이 5가 되면 첫번째 열로 수정한다.
				if (j == 5) {
					j = 0;
				}
			}
		}
		
//		출력
		for (int row=0; row<5; row++) {
			for (int col=0; col<5; col++) {
				System.out.printf("%2d ", a[row][col]);
			}
			System.out.println();
		}
		
	}
	
}





