package day2;

class Area {
	int length;
	public Area(int length) {
		this.length=length;
	}
	public void calculateArea() {}
}
class Rectangle extends Area{
	int height;
	public Rectangle(int length,int height) {
		super(length);
		this.height=height;
	}
	@Override
	public void calculateArea() {
		int res=2*(length+height);
		System.out.println("Area of rect:"+res);
	}
}
class Triangle extends Area{
	int height;
	public Triangle(int length,int height) {
		super(length);
		this.height=height;
	}
	@Override
	public void calculateArea() {
		double res=0.5*(length*height);
		System.out.println("Area of triangle:"+res);
	}
}
class Square extends Area{
	int height;
	public Square(int length,int height) {
		super(length);
		this.height=height;
	}
	@Override
	public void calculateArea() {
		int res=length*height;
		System.out.println("Area of square:"+res);
	}
}
public class Shape{
	public static void main(String[] args) {
		Rectangle rect=new Rectangle(5,2);
		rect.calculateArea();
		Triangle tri=new Triangle(5,2);
		tri.calculateArea();
		Square sq=new Square(5,5);
		sq.calculateArea();
	}
}