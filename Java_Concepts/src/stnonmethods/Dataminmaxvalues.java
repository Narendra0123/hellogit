package stnonmethods;

public class Dataminmaxvalues {

	byte bMIN=Byte.MIN_VALUE;
	byte b;
	byte bMAX=Byte.MAX_VALUE;
	short sMIN=Short.MIN_VALUE;
	short s;
	short sMAX=Short.MAX_VALUE;
	int iMIN=Integer.MIN_VALUE;
	int i;
	int iMAX=Integer.MAX_VALUE;
	long lMIN=Long.MIN_VALUE;
	long l;
	long lMAX=Long.MAX_VALUE;
	float f=10.0f;
	double dd=20.34567d;
	public void values(){
		System.out.println("byte range is: "+bMIN+"  "+b+" "+bMAX);
		System.out.println("short range is: "+sMIN+"  "+s+"  "+sMAX);
		System.out.println("int range is: "+iMIN+"  "+i+"  "+iMAX);
		System.out.println("long range is: "+lMIN+"  "+b+" "+lMAX);
		System.out.println(f+dd);
		
	}
	
	public static void main(String[] args) {
		Dataminmaxvalues h=new Dataminmaxvalues();
		h.values();
  }

}
