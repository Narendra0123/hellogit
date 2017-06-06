package stringexmple;

public class Emptystring {
	String str="  ";
	public void m(){
		if(!str.isEmpty()){
			System.out.println("string is not empty:"+str.length());
		}
			else {
				System.out.println("string is not empty:");
			}
		}
	public static void main(String[] args) {
		Emptystring k=new Emptystring();
		k.m();
	

	}

}
