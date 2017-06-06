package singlelevelinheritance;

public class Single2 extends Single1 {
	int b=30;
	String str="hello";
	public void m2(){
		System.out.println(a+b);
		System.out.println(str);
	}

	public static void main(String[] args) {
		Single2 j=new Single2();
		j.m2();
		

	}

}
