package week2.day2;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Facebook {
		public static void main(String[] args) throws InterruptedException {
			
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sachin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KT");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8778439805");
		driver.findElement(By.id("password_step_input")).sendKeys("Sachu123");
		
		WebElement dropDown1 = driver.findElement(By.id("day"));
		Select selectDropDown1=new Select(dropDown1);
		selectDropDown1.selectByValue("20");
		
		WebElement dropDown2 = driver.findElement(By.id("month"));
		Select selectDropDown2=new Select(dropDown2);
		selectDropDown2.selectByVisibleText("May");
		
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select selectDropDown3=new Select(dropDown3);
		selectDropDown3.selectByVisibleText("2000");	
		driver.findElement(By.name("sex")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
	}
}


