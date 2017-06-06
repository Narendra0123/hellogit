package multilevel_inheritance;

public class Multilevel3 extends Multilevel2 {
	int c=40;
	public void m2(){
		System.out.println(a*b*c);
	}

	public static void main(String[] args) {
		Multilevel3 j=new Multilevel3();
		j.m2();

	}

}
