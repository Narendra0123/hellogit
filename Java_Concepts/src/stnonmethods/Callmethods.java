package stnonmethods;

public class Callmethods {
	public void m1(){
		System.out.println("hello ravi");
	}
	public static void m2(){
		System.out.println("how r u");
		Callmethods i=new Callmethods();
		i.m1();
	}
	public static void main(String[] args){
		m2();
	}

}
