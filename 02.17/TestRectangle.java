package c.modeling.ex01;

import java.util.Scanner;

class Rectangle{
	///Field
	int width;
	int length;
	String color;
	
	///Constructor
	public Rectangle() { //default Constructor
	}
	
	///Method
	public void setWidth(int width) { //가로의 길이 
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setLength(int length) {// 세로의 길이 
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	
	public void setColor(String color) {// 색깔 설정
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public int area() {//넓이 계산 
		return width * length;
	}
	
	public int perimiter() {//둘레 계산 
		return (width + length) * 2;
	}
	
}// end of class		
public class TestRectangle {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 색깔 : ");
		rec1.setColor(keyboard.next());
		
		System.out.println("첫번째 직사각형의 가로 길이 : ");
		rec1.setWidth(keyboard.nextInt());
		
		System.out.println("첫번째 직사각형의 세로 길이 : ");
		rec1.setLength(keyboard.nextInt());
		
		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔 : ");
		rec2.setColor(keyboard.next());
		
		System.out.println("두번째 직사각형의 가로 길이 : ");
		rec2.setWidth(keyboard.nextInt());
		
		System.out.println("두번째 직사각형의 세로 길이 : ");
		rec2.setLength(keyboard.nextInt());
		
		System.out.println(rec1.getColor()+" 직사각형의 넓이는 "+rec1.area()+"이고 둘레는 "+rec1.perimiter()+"입니다.");
		System.out.println(rec2.getColor()+" 직사각형의 넓이는 "+rec2.area()+"이고 둘레는 "+rec2.perimiter()+"입니다.");
		
		if(rec1.area()<rec2.area()) {
			System.out.println("넓이는 "+rec1.color+" 직사각형이 더 큽니다.");
		}else if(rec1.area()>rec2.area()) {
			System.out.println("넓이는 "+rec2.color+" 직사각형이 더 큽니다.");
		}else {
			System.out.println("넓이는 같습니다.");
		}
		if(rec1.perimiter()>rec2.perimiter()) {
			System.out.println("둘는 "+rec1.color+" 직사각형이 더 큽니다.");
		}else if(rec1.perimiter()<rec2.perimiter()) {
			System.out.println("둘레는 "+rec2.color+" 직사각형이 더 큽니다.");
		}else {
			System.out.println("둘레는 같습니다.");
		}
		
	}//end of main

}//end of class
