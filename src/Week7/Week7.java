package Week7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week7 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Google...");;
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		driver.close();

	}

}


