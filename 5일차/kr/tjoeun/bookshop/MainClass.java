package kr.tjoeun.bookshop;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		
//		여러권의 책 정보를 기억할 클래스 객체를 만든다.
		BookList bookList = new BookList(5);
//		BookList2 bookList = new BookList2();
		
//		도서 정보를 만든다.
		BookVO book1 = new BookVO("JAVA", "홍길동", "더조은출판사", 
				new Date(2010, 5, 17), 35000);
//		System.out.println(book1);
		BookVO book2 = new BookVO("JAVA", "홍길자", "더조은출판사", 
				new Date(2010, 5, 17), 35000);
		BookVO book3 = new BookVO("JAVA", "홍길숙", "더조은출판사", 
				new Date(2010, 5, 17), 35000);
		BookVO book4 = new BookVO("JAVA", "홍길희", "더조은출판사", 
				new Date(2010, 5, 17), 35000);
		BookVO book5 = new BookVO("JAVA", "홍길영", "더조은출판사", 
				new Date(2010, 5, 17), 35000);
		BookVO book6 = new BookVO("JAVA", "홍길길", "더조은출판사", 
				new Date(2010, 5, 17), 35000);
		
//		도서 정보를 BookList 클래스 객체의 bookList 배열에 저장한다.
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(book4);
		bookList.addBook(book5);
		bookList.addBook(book6);
		
		System.out.println(bookList);
		
	}
	
}
