import java.lang.*;
public class Person{
	
	private String name;
	private int age;
	private Passport pp;
	
	public Person(){}
	public Person(String name, int age, Passport pp){
		this.name = name;
		this.age = age;
		this.pp = pp;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setPassport(Passport pp){
		this.pp = pp;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public Passport getPassport(){
		return pp;
	}
	
	public void showAllInfo(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	    pp.showPassportInfo();
	}
	
}