package stnonmethods;

public class Premitivedatatypes {
	byte b;
	short s;
	int i;
	long l;
	double d;
	char c;
	boolean bolean;
	float f;
	public void  Defaultvalues(){
		System.out.println("byte default valueis:   "+b);
		System.out.println("short default valueis:   "+s);
		System.out.println("int default valueis:   "+i);
		System.out.println("long default valueis:   "+l);
		System.out.println("double default valueis:   "+d);
		System.out.println("char default valueis:     "+c);
		System.out.println("boolean default valueis:   "+bolean);
		System.out.println("float default valueis:   "+f);
		}
	
	public static void main(String[] args) {
		Premitivedatatypes h=new Premitivedatatypes();
		h.Defaultvalues();
		}

}
