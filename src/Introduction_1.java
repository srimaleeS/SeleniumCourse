import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface above driver classes such as ChromeDriver allows methods to be implemented, along with it's own (chrome's) methods 
		//ChromeDriver driver = new ChromeDriver(); --might not work on other browsers if personal Chrome driver methods
		//to get WebDriver implementation of ChromeDriver,
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//chromedrive.exe is needed for Selenium to launch browser
        driver.get("https://rahulshettyacademy.com");
//        System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());
        System.out.println("Current URL : " + driver.getCurrentUrl());
        driver.close();
//        driver.quit();
	}

}
