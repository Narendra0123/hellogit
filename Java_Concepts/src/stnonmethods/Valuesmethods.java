package stnonmethods;

public class Valuesmethods { 
	int a=30;
	static int b=90;
	public void m1(){
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void m2(){
		//System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
	Valuesmethods k=new Valuesmethods();
	k.m1();
	m2();

	}

}
