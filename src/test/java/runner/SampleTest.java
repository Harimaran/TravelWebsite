package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/login");
		
		
	
		By emailLoc= By.xpath("//input[@name='username']");
		By passwordLoc = By.id("inputPassword");
		By logInBtnLoc =By.id("login");

		driver.findElement(emailLoc).sendKeys("email@email.com");
		driver.findElement(passwordLoc).sendKeys("password");
		driver.findElement(logInBtnLoc).click();

	}
}
