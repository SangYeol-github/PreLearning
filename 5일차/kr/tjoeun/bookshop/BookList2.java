package kr.tjoeun.bookshop;

import java.util.ArrayList;
import java.util.Arrays;

//	여러권의 책 정보(BookVO)를 기억할 클래스
public class BookList2 {

	private ArrayList<BookVO> bookList = new ArrayList<BookVO>();
	
	public ArrayList<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
//		return "BookList [bookList=" + Arrays.toString(bookList) + "]";
		String str = "";
//		for (int i=0; i<bookList.size(); i++) {
//			str += bookList.get(i) + "\n";
//		}
		for (BookVO vo : bookList) {
			str += vo + "\n";
		}
		return str;
	}
	
	public void addBook(BookVO book) {
		bookList.add(book);
	}
	
}






