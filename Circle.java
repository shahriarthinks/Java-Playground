import java.lang.*;
public class Circle extends Shape{
	
	public Circle(){
		System.out.println("DC of Circle Called");
	}
	public Circle(double x){
		super(x);
		System.out.println("PC of Circle Called");
	}
	public double getArea(){
		return 3.14*getX()*getX();
	}
	public void showInfo(){
		System.out.println("Radius of Circle: " +getX());
		System.out.println("Area of Circle: "+getArea());
	}
}