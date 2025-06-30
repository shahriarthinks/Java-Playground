import java.lang.*;
public class Shape{
	
	private double x;
	
	public Shape(){
		System.out.println("DC of Shape Called");
	}
	public Shape(double x){
		this.x = x;
	}
	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return x;
	}
	public double getArea(){
		return -9.99;
	}
}