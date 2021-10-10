package org.octmini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mvndemo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");










	}

}
