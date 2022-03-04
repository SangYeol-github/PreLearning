package kr.tjoeun.bookshop;

import java.util.Arrays;

import javax.swing.JOptionPane;

//	여러권의 책 정보(BookVO)를 기억할 클래스
public class BookList {

	private BookVO[] bookList;	// 책 정보를 기억할 배열을 선언만 한 상태
	private int size;			// 배열의 크기
	private int index;			// 배열의 인덱스, 배열에 저장된 데이터의 개수
	
//	기본 생성자가 실행되면 10권의 책 정보를 기억하는 배열을 만들고 생성자의 인수로
//	배열의 크기가 넘어오면 넘어온 크기 만큼의 책 정보를 기억하는 배열을 만든다.
	public BookList() {
//		size = 10;
//		bookList = new BookVO[size];
		this(10); // BookList(int size)를 실행한다.
	}
	public BookList(int size) {
		this.size = size;
		bookList = new BookVO[size];
	}
	
	public BookVO[] getBookList() {
		return bookList;
	}
	public void setBookList(BookVO[] bookList) {
		this.bookList = bookList;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public String toString() {
//		return "BookList [bookList=" + Arrays.toString(bookList) + "]";
		String str = "";
		for (int i=0; i<bookList.length; i++) {
			if (bookList[i] == null) {
				break;
			}
			str += bookList[i] + "\n";
		}
//		for (BookVO vo : bookList) {
//			if (vo == null) {
//				break;
//			}
//			str += vo + "\n";
//		}
		return str;
	}
	
	
	public void addBook(BookVO book) {
		
//		if를 사용하는 전통적인 예외처리
//		if (size > index) {
//			bookList[index++] = book;
//		} else {
//			System.out.println("배열이 작아서 데이터를 넣을 수 없습니다.");
//		}
		
//		try ~ catch를 사용하는 자바의 예외처리
//		예외(exception)이 발생될 것으로 예상되는 문장을 try 블록에 입력한다.
//		예외가 발생되면 처리할 문장을 catch 블록에 입력한다.
//		try 블록의 문장을 실행하다가 예외가 발생되는 순간 더 이상 try 블록의 내용을
//		실행하지 않고 해당 예외의 catch 블록의 내용을 실행한다.
//		선택 사항으로 finally 블록이 있는데 예외가 발생되던 발생되지 않던 무조건
//		실행해야 할 문장이 있으면 적는다.
		
		try { // 필수
			bookList[index++] = book;
		} catch (ArrayIndexOutOfBoundsException e) { // 필수
			System.out.println("배열이 작아서 데이터를 넣을 수 없습니다.");
			
			JOptionPane.showMessageDialog(null, "배열이 작아서 데이터를 넣을 수 없습니다.");
			
//			예외가 발생되면 예외에 관련된 정보가 변수(e)에 저장된다.
//			getMessage(): 예외 메시지를 얻어온다.
			System.out.println(e.getMessage());
//			printStackTrace(): 예외를 발생시킨 문장을 실행의 역순으로 추적한다.
			e.printStackTrace();
		} catch (Exception e) {
//			catch 블록에 Exception을 사용하면 모든 예외를 처리할 수 있다.
//			모든 예외가 Exception에서 처리되기 때문에 반드시 맨 마지막 catch에 쓴다.
			System.out.println("Exception은 모든 예외를 처리할 수 있다.");
		} finally { // 선택사항
//			System.out.println("까~~~~~~~~~~~~~~~~~~~");
		}
		
	}
	
}






