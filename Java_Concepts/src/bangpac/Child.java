package bangpac;

import hydpac.Parent;

public class Child extends Parent {
	 public void mm(){
		 System.out.println(str);
	 }
	 public static void main(String[] args) {
			new Child().mm();
	 }

}

