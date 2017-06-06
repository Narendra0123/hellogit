package stnonmethods;

public class Initializationval {
	int a;
	int b=20;
	public void values(){
		int x=30;
		int y=90;
		System.out.println(x+y);
		System.out.println(a);
		System.out.println(b);
		System.out.println("additional logic");
		
	}
	public void values1(){
		System.out.println("values1");
		
	}

	public static void main(String[] args) {
		Initializationval k=new Initializationval();
		k.values();
		k.values1();
	}

}
