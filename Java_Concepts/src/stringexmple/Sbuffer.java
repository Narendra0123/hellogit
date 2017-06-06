package stringexmple;

public class Sbuffer {
	StringBuffer str=new StringBuffer("ravi");
	public void m1(){
		System.out.println(str);
		System.out.println(str.append(" hello"));
		System.out.println(str);
		System.out.println(str.reverse());
	}

	public static void main(String[] args) {
		Sbuffer j=new Sbuffer();
		j.m1();
	}

}
