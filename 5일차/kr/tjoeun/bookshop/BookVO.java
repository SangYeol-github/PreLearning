package kr.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//	1건의 책 정보를 기억할 클래스
public class BookVO {

//	멤버 변수를 만든다.
	private String title;		// 책 이름
	private String author;		// 저자 이름
	private String publisher;	// 출판사 이름
	private Date date;			// 출판일
	private double price;		// 가격
	
//	생성자를 만든다.
	public BookVO() {
		
	}
	public BookVO(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
//		Date 클래스 객체는 1900년을 기준으로 날짜를 처리하므로 년을 얻어올 때는 얻어온
//		후 1900을 더해야 하고 넣어줄 때는 1900을 빼서 넣어야 한다.
//		data에서 년만 얻어와서 1900을 뺀 후 다시 넣어준다.
		date.setYear(date.getYear() - 1900);
		
//		Date 클래스는 월을 1 ~ 12월로 처리하는 것이 아니라 0 ~ 11월로 처리하기 때문에
//		월을 얻어올 때는 얻어온 후 1을 더해야 하고 넣어줄 때는 1을 빼서 넣어야 한다.
//		data에서 월만 얻어와서 1을 뺀 후 다시 넣어준다.
		date.setMonth(date.getMonth() - 1);
		
		this.date = date;
		this.price = price;
	}
	
//	getters & setters 메소드를 만든다.
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
//	toString() 메소드를 override 한다.
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		
//		숫자 서식 변경
//		NumberFormat nf1 = NumberFormat.getNumberInstance();	// 천 단위 컴마
//		NumberFormat nf2 = NumberFormat.getCurrencyInstance();	// 통화
//		NumberFormat nf3 = NumberFormat.getPercentInstance();	// 백분율
		
//		DecimalFormat df1 = new DecimalFormat("#,##0");			// 천 단위 컴마
//		DecimalFormat df2 = new DecimalFormat("￦#,##0");		// 통화
//		DecimalFormat df3 = new DecimalFormat("#,##0%");		// 백분율
//		소수점 아래 데이터를 출력하려면 "."을 찍고 필요한 만큼 "0"을 입력한다.
//		DecimalFormat df4 = new DecimalFormat("$#,##0.00");
//		#,##0 앞, 뒤로 필요한 문자를 적는다.
		DecimalFormat df5 = new DecimalFormat("#,##0원");
		
		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + 
				publisher + ", date=" + sdf.format(date) + 
				", price=" + df5.format(price) + "]";
	}
	
}











