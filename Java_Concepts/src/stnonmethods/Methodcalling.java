package stnonmethods;

public class Methodcalling {
	public void m1(){
		System.out.println("hello");
	}
	public void m2(){
		m1();
		System.out.println("Ravi");
		
	}

	public static void main(String[] args) {
    Methodcalling	j=new Methodcalling();
    j.m2();
		

	}

}
