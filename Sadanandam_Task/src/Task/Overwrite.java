package Task;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Overwrite {
	WebDriver driver;
	@Test
public void Exe() throws Exception{
	System.setProperty("webdriver.chrome.driver", "H:\\desktop\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
		driver.get("http://cubicitsolution.co.in/project/mpower-admin/admin");
		
		driver.findElement(By.name("unm")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin321");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/form/div/div[3]/button")).click();
		driver.findElement(By.cssSelector("body > div > div.main-panel.ps-container.ps-theme-default.ps-active-x.ps-active-y > div.content > div > div > div:nth-child(2) > div > div.card-footer > div > b > a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p/a[1]")).click();
		  Thread.sleep(2000);
			File f = new File("C:\\Users\\NSSS KKISHORE\\Downloads\\Candidates_list.csv");
			System.out.println(f.getAbsolutePath());
			                                 
		File f1= new File("D:\\MpowerCanditate");
		FileUtils.moveFileToDirectory(f, f1, true);
			System.out.println("hello");
			
			 File f2 = new File("D:\\MpowerCanditate\\Candidates_list.csv");
			    f2.delete(); 
			    System.out.println("file deleted");
			
		
		}

	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	

