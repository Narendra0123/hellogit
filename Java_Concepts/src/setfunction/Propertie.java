package setfunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selinium Softwears\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
			
	}

}
