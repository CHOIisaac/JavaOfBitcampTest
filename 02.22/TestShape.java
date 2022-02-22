package Test0222;


abstract class Shape {
	protected double area;
	private String name;
	
	public Shape() {
	}
	public Shape(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(getName()+"의 면적은 "+ area);
	}
	
	
}//end of class

class Circle extends Shape{
	private double radius;
	
	public Circle(){
	}
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	public void setRadius(double raidus) {
		super.getName();
	}
	
	public void calculationArea() {
		super.area = ((radius*radius)*Math.PI);
	}
	
	
}//end of class

class Rectangular extends Shape{
	private double width;
	private double hight;
	
	public Rectangular() {
	}
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
		
	}
	
	public void calculationArea() {
		super.area = width * hight;
	}
	
}


public class TestShape {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		
		shape[0] = new Circle("원", 10);
		shape[1] = new Rectangular("직사각형", 10, 20);
		
		for(int i = 0; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
		
		
	}//end of main

}//end of class
