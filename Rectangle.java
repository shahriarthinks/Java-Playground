import java.lang.*;
public class Rectangle extends Shape{
	
	private double y;
	
	public Rectangle(){
		System.out.println("DC of Rectangle Called");
	}
	public Rectangle(double x, double y){
		super(x);
		this.y = y;
		System.out.println("PC of Rectangle Called");
	}
	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return y;
	}
	public double getArea(){
		return getX()*y;
	}
	public void showInfo(){
		System.out.println("x: "+getX());
		System.out.println("y: "+y);
		System.out.println("Area of Rectangle: "+getArea());
	}
}