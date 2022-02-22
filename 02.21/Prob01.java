package Test0221;


//모델링하기
class Book{
	private String title;
	private int price;
	
	public Book() {
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
}//end of class

class BookMgr{
	Book[] booklist;
	int sum;
	
	public BookMgr() {
	}
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBooklist() {
		for(int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice() {
		for(int i = 0; i < booklist.length; i++) {
			sum +=booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+sum);
	}
}//end of class

public class Prob01 {

	public static void main(String[] args) {
		Book[] booklist = new Book[5];
		
		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundaments", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		
		System.out.println("===책 목록===");
		mgr.printBooklist();
		System.out.println("");
		
		System.out.println("===책 가격의 총합===");
		mgr.printTotalPrice();
		
		
	}//end of class

}//end of class
