import java.text.SimpleDateFormat;
import java.util.Date;

//	클래스는 데이터와 그 데이터를 처리하기 위한 메소드를 가진다.
//	VO(Value Object): 처리할 데이터 1건을 기억하는 클래스, DTO(Data Access Object)
//	bean: 자바로 작업하는데 필요한 최소단위, 처리할 데이터를 기억하는 멤버 변수와
//	데이터를 입출력 할 수 있는 getters & setters 메소드로만 구성된 클래스를 말한다.
public class Person {

//	멤버 변수(필드)를 정의한다.
//	자바는 멤버 변수를 선언만 하면 숫자는 0, 문자는 공백, boolean은 false, 클래스로
//	생성한 객체는 null로 자동 초기화 된다.
	
//	멤버 변수는 정적(static) 멤버 변수와 인스턴스 멤버 변수가 있다.
//	정적 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 같은 기억장소를 공유해서
//	사용하고 인스턴스 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 독립된 기억공간을
//	가진다.
//	정적 멤버 변수나 정적 메소드는 객체를 생성하지 않고 클래스 이름에 "."을 찍어서
//	사용할 수 있으므로 자주 사용하는 변수나 메소드에 지정해서 사용하면 편리하다.
	
//	[접근권한지정자] [static] 자료형 변수명 [= 초기치];
	
	public static int count;	// 정적 멤버 변수
	
	private int idx;		// 일련번호 - 객체가 생성될 때 자동으로 1증가 시킨다.
	private String name;	// 이름
	private boolean gender;	// 성별
	private String memo;	// 소개
	private Date writeDate;	// 가입일 - 객체가 생성될 때 컴퓨터의 날짜/시간을 저장한다.
	
//	생성자(Constructor) 메소드(이하 생성자)를 정의한다.
//	생성자 이름은 클래스 이름과 똑같고 현재 클래스의 객체가 생성되는 순간 자동 실행된다.
//	생성자는 return을 사용하지 않고 리턴타입도 사용하지 않는다.
//	생성자를 사용하는 주 목적은 멤버 변수를 초기화 시키는 것이다.
//	생성자를 정의하지 않으면 자바 컴파일러가 알아서 아무 일도 하지않는 기본 생성자를
//	자동으로 만들어준다.
//	하지만 프로그래머가 별도의 생성자를 정의하면 기본 생성자는 자동으로 만들어지지
//	않는다.
	
//	기본 생성자
	public Person() {
//		this: 현재 클래스를 의미한다.
//		super: 부모 클래스를 의미한다.
//		this(인수): 현재 클래스의 다른 생성자를 의미한다.
//		super(): 부모 클래스의 기본 생성자를 의미한다.
//		this()와 super()는 반드시 생성자의 첫 문장으로 사용해야 한다.
		
//		Person(String name, boolean gender, String memo)를 실행한다.
		this("무명씨", false, "없음");
		
		System.out.println("기본 생성자가 실행됩니다.");
//		name = "무명씨";
//		memo = "없음";
//		writeDate = new Date();
	}
	
//	데이터를 넘겨받아 멤버 변수를 초기화시키는 생성자
	public Person(String name, boolean gender, String memo) {
		idx = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
//		자동으로 컴퓨터 시스템의 날짜와 시간 넣어주기
		writeDate = new Date();
	}

//	객체에 저장된 내용을 출력해야 한다면 toString() 메소드를 override(재정의) 한다.
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		return "Person [idx=" + idx + ", name=" + name + ", gender=" + gender + ", memo=" + memo + ", writeDate="
				+ sdf.format(writeDate) + "]";
	}

//	getters & setters 메소드를 정의한다.
//	멤버 변수가 private 권한을 사용할 경우 이 권한의 적용이 너무 엄격해서 꼭 필요한
//	경우라 하더라도 private 권한이 설정된 멤버 변수에 접근할 수 없다.
//	private 권한으로 설정된 멤버 변수에 예외적으로 접근을 허용하기 위해서 getters &
//	setters 메소드를 사용한다.

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	
	
	

	
	
}













