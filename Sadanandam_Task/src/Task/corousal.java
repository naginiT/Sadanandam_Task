package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class corousal {
	static WebDriver driver;
	@Test

	public void exe(){

		System.setProperty("webdriver.chrome.driver", "H:\\desktop\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://cubicitsolution.co.in/");
     
     List<WebElement> images=driver.findElements(By.xpath("//div[@class='sb-description']"));
     int a=images.size();
     System.out.println("count of images" +a);
     for(int i=0;i<a;i++)
     {
     	WebElement ele=images.get(i);
     	String s=ele.getAttribute("innerHTML");
     	System.out.println(s);
     }
}
}