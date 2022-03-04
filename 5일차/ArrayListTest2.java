import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
//		add(value): ArrayList의 맨 뒤에 데이터를 추가한다.
		list.add("홍길동");
//		size(): ArrayList에 저장된 데이터 개수를 얻어온다.
		System.out.println(list.size() + " : " + list);
		list.add("임꺽정");
		System.out.println(list.size() + " : " + list);
		list.add("장길산");
		System.out.println(list.size() + " : " + list);
		
//		add(index, value): ArrayList의 index 번째 위치에 데이터를 삽입한다.
		list.add(1, "일지매");
		System.out.println(list.size() + " : " + list);
		
//		set(index, value): ArrayList의 index 번째 위치에 데이터를 수정한다.
		list.set(1, "손오공");
		System.out.println(list.size() + " : " + list);
		
		for (int i=0; i<list.size(); i++) {
//			get(index): ArrayList의 index 위치의 데이터를 얻어온다.
			System.out.println("list.get(" + i + ") = " + list.get(i));
		}
		
		for (String str : list) {
			System.out.println(str);
		}
		
//		remove(index): ArrayList의 index 번째 위치의 데이터를 제거한다.
		list.remove(1);
		System.out.println(list.size() + " : " + list);
//		remove(value): ArrayList에서 인수로 지정된 데이터를 제거한다.
		list.remove("홍길동");
		System.out.println(list.size() + " : " + list);
		
//		clear(): ArrayList에 저장된 모든 데이터를 제거한다.
		list.clear();
		System.out.println(list.size() + " : " + list);
		
	}
	
}






