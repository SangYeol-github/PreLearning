
public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		System.out.println(person1);
		Person person2 = new Person();
//		toString(): 객체에 저장된 내용을 출력한다. 사용 빈도가 높기 때문에 생략하면
//		자바가 알아서 붙여준다.
		System.out.println(person2.toString());
		
//		System.out.println("Person.count: " + Person.count);
//		System.out.println("person1.count: " + person1.count);
//		person1.count = 100;
//		System.out.println("person1.count: " + person1.count);
//		System.out.println("person2.count: " + person2.count);
		
		Person person3 = new Person("홍길동", true, "1등 입니다.");
		System.out.println(person3);
		Person person4 = new Person("임꺽정", true, "2등 입니다.");
		System.out.println(person4);
		
//		private 멤버는 클래스 외부에서 접근할 수 없으므로 에러가 발생된다.
//		System.out.println(person3.name);
		System.out.println(person3.getName());
		
		person3.setName("장길산");
		System.out.println(person3.getName());
		
		
	}
	
}
