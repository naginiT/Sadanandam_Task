package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HexaCode {
	WebDriver driver;

	@Test
public void exe(){
	
		System.setProperty("webdriver.chrome.driver", "H:\\desktop\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get("http://cubicitsolution.co.in/project/quikrdeal/");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]"));
		 Actions action = new Actions(driver);
		   action.moveToElement(element).build().perform();
		   String colorafterhover = element.getCssValue("background-color");
		   System.out.println("The color after  hover is"+colorafterhover);
		   String[] aftervalue = colorafterhover.replace("rgba(", "").replace(")", "").split(",");
		   int aftervalue1=Integer.parseInt(aftervalue[0]);
		   System.out.println(aftervalue1+"aftervalue1");
		   aftervalue[1] = aftervalue[1].trim();
		   System.out.println("Aftervalue1"+aftervalue1);
		   int aftervalue2=Integer.parseInt(aftervalue[1]);
		   aftervalue[2] = aftervalue[2].trim();
		   int aftervalue3=Integer.parseInt(aftervalue[2]);
		   String actualcolorafterhover = String.format("#%02x%02x%02x", aftervalue1, aftervalue2, aftervalue3);
		   System.out.println("The actual color afterhover"+actualcolorafterhover);
		   
		   
		 /*  String[] numbers =color.replace("rgba(","").replace(")","").split(",");
			int r=Integer.parseInt(numbers[0].trim());
			int g=Integer.parseInt(numbers[1].trim());
			int b=Integer.parseInt(numbers[2].trim());
			int a=Integer.parseInt(numbers[3].trim());
			System.out.println("r: " + r + " g: " + g + " b: " + b + " a: " + a);
			String hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b) + Integer.toHexString(a);
			System.out.println(hex);*/
	}
	
	
	
}

