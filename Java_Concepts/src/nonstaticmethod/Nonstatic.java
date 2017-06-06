package nonstaticmethod;

public class Nonstatic {
	public void launchApp(){
		System.out.println("launched the application");
	}
	public void rigistrartion(){
		System.out.println("i have done my rigistrartion");
	}
	public void login(){ 
		System.out.println("i have done my login");
	}
	public void logout(){
		System.out.println("i have done my logout");
	}

	public static void main(String[] args) {
		Nonstatic k=new Nonstatic();
		k.launchApp();
		k.rigistrartion();
		k.login();
		k.logout();
		}

}
