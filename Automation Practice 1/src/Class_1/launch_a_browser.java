package Class_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_a_browser {

	public static void main(String[] args) {
		//int first_number = 25;
		//double first_double = 2.5; 
		
		//System.out.println(first_number);
		//System.out.println(first_double);
		
		//String first_string = "my 1st string";
		//System.out.println(first_string);
		
		//int[] int_array = {23, 39, 4};
		//double [] double_array = {2.3, 3.9, 4};
		//String[] string_list = {"zero", "one", "two", "three"};
		
		//System.out.println(int_array[2]);
		//System.out.println(double_array[2]);
		//System.out.println(string_list[1]);
		
		//System.out.println("one");
		//System.out.println("two");
		//System.out.println("three");
		//System.out.println("four");
		
		
		//System.out.println(result1);
		
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsam9\\Downloads\\chromedriver_win32.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.path2usa.com/travel-companions");
	 
//Type Chicago in the "From" field
	 driver.findElement(By.cssSelector("#travel_from")).sendKeys("Chicago");
	 Thread.sleep(3000);
	 
	 //select the second option
	 driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.DOWN);
	 driver.findElement(By.cssSelector("#travel_from")).sendKeys(Keys.ENTER);
	 
	 //select the date May 21 2020
	 driver.findElement(By.cssSelector("#travel_date")).click();
	 
	 while (!driver.findElement(By.cssSelector("div[class='datepicker-days'][class='datepicker-switch']"))
		 .getText().contains("May")); {
		driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
				
						
	List<WebElement> dates = driver.findElements(By.cssSelector("div[class='datepicker-days'] td[class='day']"));
	int size_of_dates = dates.size(); 
	
	for (int i = 0; i < size_of_dates; i++); {
		String num = dates.get(i).getText();
		System.out.print(num);
		
		if(num.equalsIgnoreCase("21")) {
			dates.get(i).click(); 
			break; 
		}
		 }
	 
	 driver.findElement(By.cssSelector("#travel_language")).click();
	 driver.findElement(By.cssSelector("option[value='Hindi']")).click();
	 
	 driver.findElement(By.cssSelector("#travel_to")).sendKeys("hyder");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.cssSelector("#travel_to")).sendKeys(Keys.ENTER);
	 
	 driver.findElement(By.className("select[id='travel_airline'] option[value='Alitalia']")); 
	 
	 driver.findElement(By.cssSelector("button[class='btn btn-primary']"))click();
	 
	 System.out.print(class='row'] p")).equals("No listing found")); 
	 
	 
	 
	}
	
}

	
	
