package week2.day2;

import org.openqa.selenium.By;	
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) {
		
            WebDriverManager.chromedriver().setup(); 
			 ChromeDriver driver=new ChromeDriver(); 
			 driver.get("http://leaftaps.com/opentaps");
			
		    
		     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		     driver.findElement(By.xpath("//input[@id'=password']")).sendKeys("crmsfa");
		     driver.findElement(By.xpath("//input[@value'=Login']")).click();
		   
		     driver.findElement(By.xpath("//a[contains(text(),'CRMSFA']")).click();
		     driver.findElement(By.xpath("//a[text(),'Create Lead']")).click();
		     driver.findElement(By.xpath("//input[@id='CreateLeadForm_companyName']")).sendKeys("CTS");
		     driver.findElement(By.xpath("//input[@id='CreateLeadForm_firstName']")).sendKeys("Sachin");
		     driver.findElement(By.xpath("//input[@id='CreateLeadForm_lastName']")).sendKeys("Thiyagarajan");		    
		     driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		     
		     
				
	}

}
