package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> AllpageID=driver.getWindowHandles();
		System.out.println(AllpageID);
		List<String> PageList=new ArrayList<String>(AllpageID);
		driver.switchTo().window(PageList.get(2));
		driver.findElement(By.xpath("//input[@placeholder='E-mail Address']")).sendKeys("mk8051550@gmail.com");
		System.out.println("MuthuKumar C");
		System.out.println("The Trial branch is created and added");
		System.out.println("ReviseBranch");
		
		

	}

}



