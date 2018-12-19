import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A_JPSR_LandingPageDemoEnv {

	public static void main1(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//DODCR-196
		
		
			//envoke Chrome Object Browser 	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipes\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		//envoke InternetExplorer Object Browser 
		//NOTE Find out better way then to copy Class then to envoke ie
//		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Eclipes\\InternetExplorerDriver\\InternetExplorerDriver.exe");
//		WebDriver driver1=new InternetExplorerDriver();
		
			//open url
		driver.get("http://dod.datixweb.co.uk/demo/");
			//verify page title 
		driver.getTitle();
		System.out.println(driver.getTitle());
			//printIn "passing" on page title 
		System.out.println("passs");
		
			//Selecting "Transportation Command Regulated Patient Movement" hyper link. 
		driver.findElement(By.partialLinkText("Regulated Patient Movement")).click();
	
			//verify page Title 
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println("passs");
		
			//verify if landing on correct page - printIn
		System.out.println(driver.getCurrentUrl());
		
			//user interface verify the page source frames
		System.out.println(driver.getPageSource());
			//selecting Back Button
		driver.navigate().back();
			//selecting Forward Button
		driver.navigate().forward();
		
		




	}

}
