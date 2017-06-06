package stringexmple;

public class Stringreverse {
	String str="hello ravi";
	public void m1(){
		System.out.println("before string reverse :"+str);
		char[] rev=str.toCharArray();
		System.out.println(rev.length);
		System.out.println("ofter string reverse:  ");
		for(int i=rev.length-1;i>=0;i--){
			System.out.print(rev[i]);
			
		}
}
	public static void main(String[] args) {
		Stringreverse j=new Stringreverse();
		j.m1();
		
	}
}
