import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		배열은 한 번 선언하면 프로그램에서 크기를 변경시킬 수 없다.
		int[] data = new int[10];
		
//		ArrayList는 데이터를 넣으면 넣는대로 커지고 데이터를 제거하면 제거하는 만큼
//		작아진다.
//		<E>: 제네릭이라 부르며 ArrayList에 저장될 데이터의 타입을 반드시 클래스로 적어야
//		한다.
//		만약 ArrayList에 기본 자료형을 저장해야 한다면 기본 자료형을 클래스화 시켜놓은
//		랩퍼 클래스를 사용하면 된다.
//		랩퍼 클래스 이름은 기본 자료형의 이름과 같고 첫 문자만 대문자로 하면된다.
//		단, int(Integer)와 char(Character)는 전체 이름을 사용해야 한다.
		
//		ArrayList list = new ArrayList();                   // JDK 1.4 버전 이전
		ArrayList<Integer> list = new ArrayList<Integer>(); // JDK 1.5 버전 이후
//		ArrayList<Integer> list = new ArrayList<>();        // JDK 1.7 버전 이후
		
		for (int i=0; i<10; i++) {
			data[i] = i + 1;
			list.add(i + 1);
		}
		
		for (int i=0; i<10; i++) {
			System.out.println("data[" + i + "] = " + data[i] + 
					", list.get(" + i + ") = " + list.get(i));
		}
		
		for (int i=10; i<20; i++) {
//			data[i] = i + 1; // 인덱스가 배열의 범위를 넘어가므로 오류가 발생된다.
			list.add(i + 1);
		}
		
		for (int i=10; i<20; i++) {
//			System.out.println("data[" + i + "] = " + data[i]);
			System.out.println("list.get(" + i + ") = " + list.get(i));
		}
		
		
	}
	
}
