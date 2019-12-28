package Class_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_fundamentals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsam9\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        //WebDriver driver = new ChromeDriver();
	        //driver.manage().window().maximize();
	        //driver.get("https://google.com");
	        
	        //driver.get("https://login.salesforce.com/");
	        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
	        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jovana");
	        //driver.findElement(By.xpath("//input[@id='login']")).click(); 
	        //driver.findElement(By.xpath("//input[@id='error']")).equals
	        
	        //driver.get("https://salesforce.com/");
	        
	        //driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click(); 
	        
	        
	  //driver.get("https://www.pinterest.com/");
	  //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
      //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jovana");
      //driver.findElement(By.xpath("//input[@id='age']")).sendKeys("two")
      //driver.findElement(By.xpath("//button[@class='red SignupButton active'"]")).click();       
	        
	  
    		     		  
System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsam9\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.linkText("Click here to return to the tutorial.")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Click here to return to the tutorial.')]")).click();
		
		//create an object for wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lblSprocketTitle")));

		boolean message = driver.findElement(By.id("lblSprocketTitle")).isDisplayed();
		if(message) {
			System.out.print(true);
			driver.close();
		}else {
			System.out.print(false);
			driver.close();
		}

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//I realized that every time I get to the landing page I see a banner at the bottom so we just need to accept the message inside the banner so it doesn't restrict us from continuing. 
		driver.findElement(By.id("cookie_action_close_header")).click();
		Thread.sleep(3000);
		//I was using the line of code below but i kept getting the following error: Element <input id="sex-0" name="sex" type="radio" value="Male"> is not clickable at point
//		driver.findElement(By.xpath("//div[@class='control-group']/input[@id='sex-0']")).click();
		//did a google search for that exact error which led me to the following stackoverflow page:
//		driver.get("https://stackoverflow.com/questions/11908249/debugging-element-is-not-clickable-at-point-error");]
//		and I got an answer that I tried....and it worked. Great example of how development works. So a lot of the times you will need to research when you are stuck.
		driver.findElement(By.xpath("//div[@class='control-group']/input[@id='sex-0']")).click();
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().perform();
		driver.close();
		System.out.println("Success!!!");
		
		
		//switch frames using WebElement
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.id("draggable")).click();
				//switch frames using index
				//System.out.println(driver.findElements(By.tagName("iframe")).size());
				//driver.switchTo().frame(0);
//				Actions a = new Actions(driver);
//				WebElement source = driver.findElement(By.id("draggable"));
//				WebElement target = driver.findElement(By.id("droppable"));
//				a.dragAndDrop(source, target).build().perform();
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, target).build().perform();
				//SWITCH BACK TO ORIGINAL FRAME
		driver.switchTo().defaultContent();
		driver.close();
		System.out.print("Dragged and dropped successfully!!!");
		
		
		<!-- https://mvnrepository.com/artifact/junit/junit -->
			<dependency>
			    <groupId>junit</groupId>
			    <artifactId>junit</artifactId>
			    <version>4.12</version>
			    <scope>test</scope>
			</dependency>

}
}
	


