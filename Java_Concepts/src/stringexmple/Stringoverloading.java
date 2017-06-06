package stringexmple;

public class Stringoverloading {
	String str="hello";
	public void m1(){
		System.out.println(str);
		System.out.println(str.concat(" ravi"));
		System.out.println(str);
	}
	public static void main(String[] args) {
	Stringoverloading nn=new Stringoverloading();
	nn.m1();
		

	}

}
