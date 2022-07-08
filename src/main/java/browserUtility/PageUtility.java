package browserUtility;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class PageUtility {
	
	static WebDriver driver = Browser.driver;
	
	public static void switchTab(){
		String activeDriverWindow = driver.getWindowHandle();
		ArrayList<String> windows = new ArrayList<String> (driver.getWindowHandles());
		for(String window :windows) {
			if(!activeDriverWindow.equals(window)) {
				driver.switchTo().window(window);
			}
		}
	}

}
