package pack2;

public class AA {
	int a=20;
	int b=30;
	public void n1(){
		System.out.println(a+b);
	}
	public void n2(int a,int b){
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		new AA().n1();
		new AA().n2(90,90);
 }

}
