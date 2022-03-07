package Test0304;

import java.util.Vector;

public class Prob01 {

	private static Book makeBook(String bookData) throws DataFormatException {
		
		Book book = new Book();
		
		String[] array = null;
		
		array = bookData.split(" : ");
		
		book.setTitle(array[0]);
		
		if(array.length < 3 || array.length > 3) {
			
			throw new Test0304.DataFormatException(book.getTitle()+"책 정보는 변환할 수 없는 데이터 포맷입니다.");
		}
		
		book.setKind(array[1]);
		
		book.setRentalPrice(Integer.valueOf(array[2]));
		
			
		
		return book;
	}//end of method
	
	private static void printBookList(Vector bookList) {
		Book book = new Book();
		
			for(int i = 0; i< bookList.size(); i++) {
				
				System.out.println(bookList.get(i));
			}
			
	}//end of method
	
	public static void main(String[] args) {
		
		Vector bookList = new Vector();
		
		try {
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));
			//case1
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			//case2
//			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 : 56000"));
			System.out.println("<<책 목록>>");
			printBookList(bookList);
			
		}catch(Test0304.DataFormatException e) {
			System.out.println(e.getMessage());
		}
	}//end of main
}//end of class
