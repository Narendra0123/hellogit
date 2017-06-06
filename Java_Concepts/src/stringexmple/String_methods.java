package stringexmple;

public class String_methods {
	String name="Hello Ravi";
    String city1="chodavaram";
    String city2="varam";
    String str="hello";
    String str1="how are";
    String str2=" you?";    
    String transactionid="my transaction id is @7776766@676767";
	public void m1(){
		//System.out.println(name);
		//System.out.println(name.length());
		//System.out.println(name.toUpperCase());
		//System.out.println(name.toLowerCase());
		//System.out.println(name.charAt(1));
		//System.out.println(name.replace("Hello", "Hi"));
		//System.out.println(name.substring(6));
		//System.out.println(name.subSequence(0,4));
		//System.out.println(city1.equals(city2));
		//System.out.println(city1.equalsIgnoreCase(city2));
		//System.out.println(str);
		//System.out.println(str1.concat(str2));
		//System.out.println(str1.contains("how are"));
		String[] x=transactionid.split("@");
		//stem.out.println(x[0]);
		//stem.out.println(x[1]);
		//stem.out.println(x[2]);
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		String_methods j=new String_methods();
		j.m1();
	 }
}

	
	