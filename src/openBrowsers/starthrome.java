package openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class starthrome {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\kalag\\OneDrive\\Desktop\\Workspace\\Java_Project\\Resources\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\kalag\\OneDrive\\Desktop\\Workspace\\Java_Project\\Resources\\geckodriver.exe");
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://eenadu.net");
		driver.quit();
		driver.close();
	}

}
